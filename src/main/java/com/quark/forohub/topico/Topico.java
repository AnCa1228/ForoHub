package com.quark.forohub.topico;

import com.quark.forohub.curso.Curso;
import com.quark.forohub.respuesta.DatosRespuesta;
import com.quark.forohub.respuesta.Respuesta;
import com.quark.forohub.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private Date fechaCreacion;
    private String status;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
    @OneToMany(mappedBy = "topico")
    private List<Respuesta> respuestas;

    public List<Respuesta> convertirDatosRespuesta(List<DatosRespuesta> datosRespuestas){
        return datosRespuestas.stream()
                .map(Respuesta::new)
                .collect(Collectors.toList());
    }


    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaCreacion = datosRegistroTopico.fechaCreacion();
        this.status = datosRegistroTopico.status();
        this.usuario = new Usuario(datosRegistroTopico.usuario());
        this.curso = new Curso(datosRegistroTopico.curso());
        this.respuestas = convertirDatosRespuesta(datosRegistroTopico.respuestas());
    }
}
