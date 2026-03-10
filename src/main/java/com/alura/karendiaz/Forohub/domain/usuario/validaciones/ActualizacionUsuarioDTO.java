package com.alura.karendiaz.Forohub.domain.usuario.validaciones;

import jakarta.validation.constraints.NotNull;

public record ActualizacionUsuarioDTO(
        @NotNull Long id,
        String name,
        String email
) {
}