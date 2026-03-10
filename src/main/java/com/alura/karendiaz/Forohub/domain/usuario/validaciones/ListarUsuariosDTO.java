package com.alura.karendiaz.Forohub.domain.usuario.validaciones;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public record ListarUsuariosDTO (
        Long id,
        String name,
        String email
){
    public ListarUsuariosDTO(Usuario usuario){

        this(usuario.getId(),usuario.getName(),usuario.getEmail());
    }
}