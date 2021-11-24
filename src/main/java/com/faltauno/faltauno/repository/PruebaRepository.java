package com.faltauno.faltauno.repository;

import com.faltauno.faltauno.model.Prueba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PruebaRepository extends JpaRepository<Prueba,Long> {
}
