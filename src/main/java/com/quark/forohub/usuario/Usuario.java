package com.quark.forohub.usuario;

import com.quark.forohub.perfil.Perfil;
import com.quark.forohub.respuesta.Respuesta;
import com.quark.forohub.topico.Topico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String password;

    @ManyToMany
    @JoinTable(
            name = "usuario_perfil",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "perfil_id")
    )
    private List<Perfil> perfiles;

    @OneToMany(mappedBy = "usuario")
    private List<Topico> topicos;
    @OneToMany(mappedBy = "usuario")
    private List<Respuesta> respuestas;

    public Usuario(DatosUsuario datosUsuario) {
        this.nombre = datosUsuario.nombre();
        this.email = datosUsuario.email();
        this.password = datosUsuario.password();
    }
}
