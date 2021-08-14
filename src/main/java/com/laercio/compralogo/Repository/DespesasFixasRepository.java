package com.laercio.compralogo.Repository;

import com.laercio.compralogo.Model.DespesasFixas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespesasFixasRepository extends JpaRepository<DespesasFixas, Long> {
}
