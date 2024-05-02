package com.algaworks.algatransito.domain.services;

import com.algaworks.algatransito.domain.model.Autuacao;
import com.algaworks.algatransito.domain.model.Veiculo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class RegistroAutuacaoService {

    private final RegistrosVeiculoServices veiculoServices;

    @Transactional
    public Autuacao registrar(Long veiculoId, Autuacao novoaAutuacao) {
        Veiculo veiculo = veiculoServices.buscar(veiculoId);
        return veiculo.adicionarAutuacao(novoaAutuacao);
    }

}
