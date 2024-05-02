package com.algaworks.algatransito.domain.services;

import com.algaworks.algatransito.domain.model.Veiculo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class ApreensaoVeiculoService {

    private final RegistrosVeiculoServices registrosVeiculoServices;

    @Transactional
    public void apreender(Long veiculoId) {
        Veiculo veiculo = registrosVeiculoServices.buscar(veiculoId);
        veiculo.apreender();
    }

    @Transactional
    public void removerApreensao(Long veiculoId) {
        Veiculo veiculo = registrosVeiculoServices.buscar(veiculoId);
        veiculo.removerApreensao();
    }

}
