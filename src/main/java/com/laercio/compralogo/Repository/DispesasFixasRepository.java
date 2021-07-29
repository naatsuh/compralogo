package com.laercio.compralogo.Repository;

import com.laercio.compralogo.Model.DispesasFixas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispesasFixasRepository extends JpaRepository<DispesasFixas, Long> {
}
