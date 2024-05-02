package com.algaworks.algatransito.api.model.input;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VeiculoInput {

    @NotBlank
    @Size
    private String marca;

    @NotBlank
    private String modelo;

    @NotBlank
    @Size(max = 7)
    @Pattern(regexp = "[A-Z]{3}[0-9][0-9A-Z][0-9]{2}")
    private String placa;

    @Valid
    @NotNull
    private ProprietarioIdInput proprietario;

}
