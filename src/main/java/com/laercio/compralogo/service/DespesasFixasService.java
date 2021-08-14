package com.laercio.compralogo.service;

import com.laercio.compralogo.Model.DespesasFixas;
import org.springframework.data.domain.Page;

import java.util.List;

public interface DespesasFixasService {
    List<DespesasFixas> getAllDespesasFixas();
    void saveDespesasFixas(DespesasFixas despesasFixas);
    DespesasFixas getDespesasFixasById(long id);
    void deletarDespesasFixasById(long id);
    Page<DespesasFixas> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
