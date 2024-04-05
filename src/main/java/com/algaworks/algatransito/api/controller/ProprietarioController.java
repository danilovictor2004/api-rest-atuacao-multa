package com.algaworks.algatransito.api.controller;

import com.algaworks.algatransito.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {
        var proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setNome("Alvaro");
        proprietario1.setTelefone("82 98888-7777");
        proprietario1.setEmail("alvaro@email.com");

        var proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setNome("Josué");
        proprietario2.setTelefone("82 97777-7777");
        proprietario2.setEmail("josue@email.com");

        return Arrays.asList(proprietario1, proprietario2);
    }

}
