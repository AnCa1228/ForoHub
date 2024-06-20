package com.quark.forohub.usuario;

import com.quark.forohub.perfil.DatosPerfil;

public record DatosUsuario(
        Long id,
        String nombre,
        String email,
        String password,
        DatosPerfil perfiles
) {
}
