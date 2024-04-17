package com.algaworks.algatransito.domain.services;

import com.algaworks.algatransito.domain.Exception.NegocioException;
import com.algaworks.algatransito.domain.model.Proprietario;
import com.algaworks.algatransito.domain.repository.ProprietarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class RegistrosProprietarioServices {

    private final ProprietarioRepository proprietarioRepository;

    @Transactional
    public Proprietario salvar(Proprietario proprietario) {
        boolean emailEmUso = proprietarioRepository.findByEmail(proprietario.getEmail())
                .filter(p -> !p.equals(proprietario))
                .isPresent();

        if (emailEmUso) {
            throw new NegocioException("Já existe um proprietário cadastrado com este e-mail.");
        }

        return proprietarioRepository.save(proprietario);
    }

    public Proprietario buscar(Long id) {
        return proprietarioRepository.findById(id)
                .orElseThrow(() -> new NegocioException("Proprietário não encontrado"));
    }

    @Transactional
    public void excluir(Long id) {
        proprietarioRepository.deleteById(id);
    }

}
