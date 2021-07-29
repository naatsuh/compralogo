package com.laercio.compralogo.Repository;

import com.laercio.compralogo.Model.Compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ComprasRepository extends JpaRepository<Compras, Long> {
}
