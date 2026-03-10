package com.alura.karendiaz.Forohub.domain.usuario.validaciones;

import com.alura.karendiaz.Forohub.domain.topico.RegistroTopicoDTO;
import com.alura.karendiaz.Forohub.domain.usuario.validaciones.RegistroUsuarioDTO;
import com.alura.karendiaz.Forohub.domain.usuario.validaciones.RespuestaUsuarioDTO;


public interface ValidadorDeUsuario {

    public void validate(RegistroUsuarioDTO RegistroUsuarioDTO);
}