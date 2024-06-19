package com.quark.forohub.usuario;

import com.quark.forohub.perfil.Perfil;

public record DatosUsuario(
        Long id,
        String nombre,
        String email,
        String password,
        Perfil perfiles
) {
}
