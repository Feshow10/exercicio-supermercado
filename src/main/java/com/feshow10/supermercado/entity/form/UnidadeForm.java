package com.feshow10.supermercado.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;


@Data
@AllArgsConstructor

public class UnidadeForm {

    @NotNull(message = "Preencha o campo corretamente.")
    @NotEmpty(message = "Preencha o campo corretamente.")
    @NotBlank(message = "Preencha o campo corretamente.")
    @Size(min = 5, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @NotNull(message = "Preencha o campo corretamente.")
    @NotEmpty(message = "Preencha o campo corretamente.")
    @NotBlank(message = "Preencha o campo corretamente.")
    @Size(min = 10, max = 100, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String endereco;

    @NotNull(message = "Preencha o campo corretamente.")
    @NotEmpty(message = "Preencha o campo corretamente.")
    @NotBlank(message = "Preencha o campo corretamente.")
    @Size(min = 2, max = 10, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String numeroDoEndereco;

    @NotNull(message = "Preencha o campo corretamente.")
    @NotEmpty(message = "Preencha o campo corretamente.")
    @NotBlank(message = "Preencha o campo corretamente.")
    @Size(min = 4, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String complementoDoEndereco;

    @NotNull(message = "Preencha o campo corretamente.")
    @NotEmpty(message = "Preencha o campo corretamente.")
    @NotBlank(message = "Preencha o campo corretamente.")
    @Size(min = 5, max = 10, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String CEP;

    @DecimalMin("1000") @DecimalMax("99999.99")
    private Double volumeMaximo;

}
