package com.quark.forohub.respuesta;

import java.util.Date;

public record DatosRespuesta(
        Long id,
        String mensaje,
        String topico,
        Date fechaCreacion,
        String autor,
        String solucion
) {
}
