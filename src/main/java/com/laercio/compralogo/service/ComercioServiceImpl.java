package com.laercio.compralogo.service;

import com.laercio.compralogo.Model.Comercio;
import com.laercio.compralogo.Repository.ComercioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComercioServiceImpl implements ComercioService {
    @Autowired
    private ComercioRepository comercioRepository;

    @Override
    public List<Comercio> getAllComercios() {
        return this.comercioRepository.findAll();
    }

    @Override
    public void saveComercio(Comercio comercio) {
        this.comercioRepository.save(comercio);
    }

    @Override
    public Comercio getComercioById(long id) {
        Optional<Comercio> optional = this.comercioRepository.findById(id);
        Comercio comercio = null;
        if (optional.isPresent()) {
            comercio = optional.get();
        } else {
            throw new RuntimeException(" Comercio not found for id :: " + id);
        }
        return comercio;
    }

    @Override
    public void deletarComercioById(long id) {
        this.comercioRepository.deleteById(id);
    }

    @Override
    public Page<Comercio> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.comercioRepository.findAll(pageable);
    }
}
