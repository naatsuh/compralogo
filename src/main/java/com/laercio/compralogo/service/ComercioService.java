package com.laercio.compralogo.service;

import com.laercio.compralogo.Model.Comercio;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ComercioService {
    List<Comercio> getAllComercios();
    void saveComercio(Comercio comercio);
    Comercio getComercioById(long id);
    void deletarComercioById(long id);
    Page<Comercio> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
