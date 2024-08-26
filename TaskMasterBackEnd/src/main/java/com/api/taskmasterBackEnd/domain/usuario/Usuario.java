package com.api.taskmasterBackEnd.domain.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Data
@Table
@Entity(name = "usuario")
public class Usuario {

    @Id
    private UUID id;

    private String nome;

    private String email;

    private String senha;
}
