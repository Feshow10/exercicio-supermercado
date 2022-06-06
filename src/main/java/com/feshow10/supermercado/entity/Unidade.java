package com.feshow10.supermercado.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_unidades")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Unidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String endereco;

    private String numeroDoEndereco;

    private String complementoDoEndereco;

    private String CEP;

    private Double volumeMaximo;

}
