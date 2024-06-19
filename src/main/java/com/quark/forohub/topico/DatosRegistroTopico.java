package com.quark.forohub.topico;

import com.quark.forohub.curso.Curso;
import com.quark.forohub.respuesta.Respuesta;
import com.quark.forohub.usuario.Usuario;

import java.util.Date;

public record DatosRegistroTopico(
        Long id,
        String titulo,
        String mensaje,
        Date fechaCreacion,
        String status,
        Usuario usuario,
        Curso curso,
        Respuesta respuestas
) {
}
