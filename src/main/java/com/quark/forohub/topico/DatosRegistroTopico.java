package com.quark.forohub.topico;

import java.util.Date;

public record DatosRegistroTopico(
        Long id,
        String titulo,
        String mensaje,
        Date fechaCreacion,
        String status,
        String autor,
        String curso,
        String respuestas
) {
}
