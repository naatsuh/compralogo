package com.laercio.compralogo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laercio.compralogo.Model.Comercio;

@Repository
public interface ComercioRepository extends JpaRepository <Comercio, Long> {
}
