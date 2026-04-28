package com.marketplace.marketplace_saas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Table(name = "TB_IMAGEM_PRODUTO")
public class ImagemProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_IMAGEM_PRODUTO")
    private Long id;

    @Column(name = "URL_IMAGEM_PRODUTO")
    private String url;

    @Column(name = "ORDEM_IMAGEM_PRODUTO")
    private Integer ordem;

    @Column(name = "PRINCIPAL_IMAGEM_PRODUTO")
    private Boolean princial;

    @Column(name = "CRIADO_EM_IMAGEM_PRODUTO")
    private LocalDateTime criadoEm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id",nullable = false)
    private ProdutoEntity produto;
}
