package com.quark.forohub.respuesta;

import com.quark.forohub.topico.DatosRegistroTopico;
import com.quark.forohub.usuario.DatosUsuario;

import java.util.Date;

public record DatosRespuesta(
        Long id,
        String mensaje,
        DatosRegistroTopico topico,
        Date fechaCreacion,
        DatosUsuario usuario,
        String solucion
) {
}
