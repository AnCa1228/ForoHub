package com.quark.forohub.respuesta;

import com.quark.forohub.topico.Topico;
import com.quark.forohub.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "respuestas")
@Entity(name = "Respuesta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;
    private Date fechaCreacion;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    private String solucion;

    public Respuesta(DatosRespuesta datosRespuestas) {
        this.mensaje = datosRespuestas.mensaje();
        this.fechaCreacion = datosRespuestas.fechaCreacion();
        this.usuario = new Usuario(datosRespuestas.usuario());
        this.solucion = datosRespuestas.solucion();
    }
}
