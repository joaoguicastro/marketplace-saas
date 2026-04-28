package com.marketplace.marketplace_saas.entity;


import com.marketplace.marketplace_saas.enums.PlanoEmpresa;
import com.marketplace.marketplace_saas.enums.SituacaoEmpresa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "TB_EMPRESA")
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EMPRESA")
    private Long id;

    @Column(name = "NOME_EMPRESA",nullable = false)
    private String nome;

    @Column(name = "CNPJ_EMPRESA",nullable = false,unique = true)
    private String cnpj;

    @Column(name = "EMAIL_EMPRESA",nullable = false)
    private String email;

    @Column(name = "TEL_EMPRESA", nullable = false)
    private String telefone;

    @Enumerated(EnumType.STRING)
    @Column(name = "PLANO_EMPRESA",nullable = false)
    private PlanoEmpresa plano;

    @Enumerated(EnumType.STRING)
    @Column(name = "SITUACAO_EMPRESA",nullable = false)
    private SituacaoEmpresa situacao;

    @Column(name = "DATA_CRIACAO_EMPRESA",nullable = false)
    private LocalDateTime criado_em;

    @Column(name = "DATA_ATUALIZADO_EMPRESA")
    private LocalDateTime atualizado_em;

}
