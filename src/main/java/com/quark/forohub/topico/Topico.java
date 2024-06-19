package com.quark.forohub.topico;

import com.quark.forohub.curso.Curso;
import com.quark.forohub.respuesta.Respuesta;
import com.quark.forohub.usuario.Usuario;

import java.util.Date;

public class Topico {
    private Long id;
    private String titulo;
    private String mensaje;
    private Date fechaCreacion;
    private String status;
    private Usuario usuario;
    private Curso curso;
    private Respuesta respuestas;
}
