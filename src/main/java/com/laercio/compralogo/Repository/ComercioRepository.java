package com.laercio.compralogo.Repository;

import com.laercio.compralogo.Model.Comercio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComercioRepository extends JpaRepository <Comercio, Long> {
}
