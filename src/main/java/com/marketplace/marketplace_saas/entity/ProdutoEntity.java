package com.marketplace.marketplace_saas.entity;

import com.marketplace.marketplace_saas.enums.StatusProduto;
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
@Table(name = "TB_PRODUTO")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_SKU_PRODUTO")
    private String codigoSKU;

    @Column(name = "NOME_PRODUTO")
    private String nome;

    @Column(name = "DESCRICAO_PRODUTO")
    private String descricao;

    // Ver a viabilidade de colocar um enum
    @Column(name = "CATEGORIA_PRODUTO")
    private String categoria;

    // Ver a viabilidade de colocar um enum
    @Column(name = "MARCA_PRODUTO")
    private String marca;

    @Column(name = "PESO_GRAMAS_PRODUTO")
    private Integer pesoGramas;

    @Column(name = "PRECO_CUSTO_PRODUTO")
    private Double precoCusto;

    @Column(name = "PRECO_MINIMO_PRODUTO")
    private Double precoMinimo;

    @Column(name = "PRECO_MAXIMO_PRODUTO")
    private Double precoMaximo;

    @Column(name = "ESTOQUE_PRODUTO")
    private Integer estoque;

    @Column(name = "STATUS_PRODUTO")
    @Enumerated(EnumType.STRING)
    private StatusProduto status;

    @Column(name = "CRIADO_EM_PRODUTO")
    private LocalDateTime criadoEm;

    @Column(name = "ATUALIZADO_EM_PRODUTO")
    private LocalDateTime atualizadoEm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_id",nullable = false)
    private EmpresaEntity empresa;

    public ProdutoEntity(Long id, String codigoSKU, String nome, String descricao, String categoria, String marca, Double precoCusto, Integer pesoGramas, Double precoMinimo, Double precoMaximo, Integer estoque, LocalDateTime criadoEm, LocalDateTime atualizadoEm, StatusProduto status) {
        this.id = id;
        this.codigoSKU = codigoSKU;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.marca = marca;
        this.precoCusto = precoCusto;
        this.pesoGramas = pesoGramas;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
        this.estoque = estoque;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
        this.status = StatusProduto.ATIVO;
    }
}
