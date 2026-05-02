package com.marketplace.marketplace_saas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Table(name = "TB_ANUNCIO")
public class AnuncioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ANUNCIO")
    private Long id;

    @Column(name = "TITULO_ANUNCIO")
    private String titulo;

    @Column(name = "DESCRICAO_ANUNCIO")
    private String descricao;

    @Column(name = "PRECO_ATUAL_ANUNCIO")
    private Double precoAtual;

    @Column(name = "PRECO_SUGERIDO_ANUNCIO")
    private Double precoSugerido;


}
