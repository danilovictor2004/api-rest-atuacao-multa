package com.algaworks.algatransito.api.controller;

import com.algaworks.algatransito.api.model.VeiculoModel;
import com.algaworks.algatransito.domain.model.Veiculo;
import com.algaworks.algatransito.domain.repository.VeiculoRepository;
import com.algaworks.algatransito.domain.services.RegistrosVeiculoServices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
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

    @GetMapping
    public List<VeiculoModel> listar() {
        return veiculoRepository.findAll()
                .stream()
                .map(VeiculoController::getVeiculoModel).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeiculoModel> buscar(@PathVariable Long id) {
        return veiculoRepository.findById(id)
                .map(VeiculoController::getVeiculoModel)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    private static VeiculoModel getVeiculoModel(Veiculo veiculo) {
        var veiculoModel = new VeiculoModel();
        veiculoModel.setId(veiculo.getId());
        veiculoModel.setNomeProprietario(veiculo.getProprietario().getNome());
        veiculoModel.setMarca(veiculo.getMarca());
        veiculoModel.setModelo(veiculo.getModelo());
        veiculoModel.setPlaca(veiculo.getPlaca());
        veiculoModel.setStatus(veiculo.getStatus());
        veiculoModel.setDataCadastro(veiculo.getDataCadastro());
        veiculoModel.setDataApreensao(veiculo.getDataApreensao());
        return veiculoModel;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Veiculo cadastrar (@Valid @RequestBody Veiculo veiculo) {
        return registrosVeiculoServices.cadastrar(veiculo);
    }

}
