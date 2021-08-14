package com.laercio.compralogo.service;



import com.laercio.compralogo.Model.DespesasFixas;
import com.laercio.compralogo.Repository.DespesasFixasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DespesasFixasServiceImpl implements DespesasFixasService {
    @Autowired
    private DespesasFixasRepository despesasFixasRepository;

    @Override
    public List<DespesasFixas> getAllDespesasFixas() {
        return this.despesasFixasRepository.findAll();
    }

    @Override
    public void saveDespesasFixas(DespesasFixas despesasFixas) {
        this.despesasFixasRepository.save(despesasFixas);
    }

    @Override
    public DespesasFixas getDespesasFixasById(long id) {
        Optional<DespesasFixas> optional = this.despesasFixasRepository.findById(id);
        DespesasFixas despesasFixas = null;
        if (optional.isPresent()) {
            despesasFixas = optional.get();
        } else {
            throw new RuntimeException(" DespesasFixas not found for id :: " + id);
        }
        return despesasFixas;
    }

    @Override
    public void deletarDespesasFixasById(long id) {
        this.despesasFixasRepository.deleteById(id);
    }

    @Override
    public Page<DespesasFixas> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.despesasFixasRepository.findAll(pageable);
    }
}
