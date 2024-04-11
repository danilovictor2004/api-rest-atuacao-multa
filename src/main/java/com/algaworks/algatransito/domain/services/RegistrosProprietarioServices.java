package com.algaworks.algatransito.domain.services;

import com.algaworks.algatransito.domain.model.Proprietario;
import com.algaworks.algatransito.domain.repository.ProprietarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrosProprietarioServices {

    private final ProprietarioRepository proprietarioRepository;

    public Proprietario salvar(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }

    public void excluir(Long id) {
        proprietarioRepository.deleteById(id);
    }

}
