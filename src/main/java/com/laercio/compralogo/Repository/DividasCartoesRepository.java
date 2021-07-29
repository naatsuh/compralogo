package com.laercio.compralogo.Repository;

import com.laercio.compralogo.Model.DividasCartoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DividasCartoesRepository extends JpaRepository<DividasCartoes, Long> {
}
