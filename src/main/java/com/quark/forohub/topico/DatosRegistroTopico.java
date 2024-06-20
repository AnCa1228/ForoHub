package com.quark.forohub.topico;

import com.quark.forohub.curso.DatosCurso;
import com.quark.forohub.respuesta.DatosRespuesta;
import com.quark.forohub.usuario.DatosUsuario;

import java.util.Date;
import java.util.List;

public record DatosRegistroTopico(
        Long id,
        String titulo,
        String mensaje,
        Date fechaCreacion,
        String status,
        DatosUsuario usuario,
        DatosCurso curso,
        List<DatosRespuesta> respuestas
) {
}
