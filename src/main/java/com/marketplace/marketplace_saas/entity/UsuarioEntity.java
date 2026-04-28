package com.marketplace.marketplace_saas.entity;

import com.marketplace.marketplace_saas.enums.CargoUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "TB_USUARIO")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "NOME_USUARIO")
    private String nome;

    @Column(name = "EMAIL_USUARIO")
    private String email;

    @Column(name = "SENHA_HASH_USUARIO")
    private String senha_hash;

    @Enumerated(EnumType.STRING)
    @Column(name = "CARGO_USUARIO")
    private CargoUsuario cargo;

    @Column(name = "STATUS_USUARIO")
    private Boolean status;

    @Column(name = "ULTIMO_ACESSO_USUARIO")
    private LocalDateTime ultimo_acesso;

    @Column(name = "CRIADO_EM_USUARIO")
    private LocalDateTime criado_em;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_id",nullable = false)
    private EmpresaEntity empresa;

}
