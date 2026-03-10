package com.alura.karendiaz.Forohub.domain.respuesta;

import com.alura.karendiaz.Forohub.domain.topico.Topico;
import com.alura.karendiaz.Forohub.domain.usuario.validaciones.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record RespuestaDTO(
        @NotBlank
        String solution,
        @NotNull
        @Valid
        Long usuario_Id,
        @NotNull
        @Valid
        Long topico_Id,
        LocalDateTime creationDate) {
}