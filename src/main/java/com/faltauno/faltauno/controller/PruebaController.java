package com.faltauno.faltauno.controller;

import com.faltauno.faltauno.model.Prueba;
import com.faltauno.faltauno.repository.PruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/prueba")
public class PruebaController {

    @Autowired
    private PruebaRepository pruebaRepository;

    ResponseEntity response = null;

    @GetMapping("/")
    public ResponseEntity<List<Prueba>> getPruebas() {
        List<Prueba> pruebas = this.pruebaRepository.findAll();
        response = ResponseEntity.status(HttpStatus.OK)
                .body(pruebas);
        return response;
    }
}

