package com.quark.forohub.respuesta;

import com.quark.forohub.usuario.Usuario;

import java.util.Date;

public record DatosRespuesta(
        Long id,
        String mensaje,
        String topico,
        Date fechaCreacion,
        Usuario usuario,
        String solucion
) {
}
