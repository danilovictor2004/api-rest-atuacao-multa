package com.algaworks.algatransito.api.controller;

import com.algaworks.algatransito.api.model.VeiculoModel;
import com.algaworks.algatransito.domain.model.Veiculo;
import com.algaworks.algatransito.domain.repository.VeiculoRepository;
import com.algaworks.algatransito.domain.services.RegistrosVeiculoServices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/veiculos")
public class VeiculoController {

    private final VeiculoRepository veiculoRepository;
    private final RegistrosVeiculoServices registrosVeiculoServices;
    private final ModelMapper modelMapper;

    @GetMapping
    public List<VeiculoModel> listar() {
        return veiculoRepository.findAll()
                .stream()
                .map(veiculo -> modelMapper.map(veiculo, VeiculoModel.class)).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeiculoModel> buscar(@PathVariable Long id) {
        return veiculoRepository.findById(id)
                .map(veiculo -> modelMapper.map(veiculo, VeiculoModel.class))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Veiculo cadastrar (@Valid @RequestBody Veiculo veiculo) {
        return registrosVeiculoServices.cadastrar(veiculo);
    }

}
