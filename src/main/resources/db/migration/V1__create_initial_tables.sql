CREATE TABLE perfiles (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

CREATE TABLE cursos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    categoria VARCHAR(255) NOT NULL
);

CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE topicos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL,
    fecha_creacion DATETIME NOT NULL,
    status VARCHAR(255) NOT NULL,
    usuario_id BIGINT,
    curso_id BIGINT,
    CONSTRAINT fk_topico_usuario FOREIGN KEY (usuario_id) REFERENCES usuarios (id),
    CONSTRAINT fk_topico_curso FOREIGN KEY (curso_id) REFERENCES cursos (id)
);

CREATE TABLE respuestas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    mensaje TEXT NOT NULL,
    topico_id BIGINT,
    fecha_creacion DATETIME NOT NULL,
    usuario_id BIGINT,
    solucion TEXT NOT NULL,
    CONSTRAINT fk_respuesta_topico FOREIGN KEY (topico_id) REFERENCES topicos (id),
    CONSTRAINT fk_respuesta_usuario FOREIGN KEY (usuario_id) REFERENCES usuarios (id)
);

CREATE TABLE usuario_perfil (
    usuario_id BIGINT,
    perfil_id BIGINT,
    PRIMARY KEY (usuario_id, perfil_id),
    CONSTRAINT fk_usuario_perfil_usuario FOREIGN KEY (usuario_id) REFERENCES usuarios (id),
    CONSTRAINT fk_usuario_perfil_perfil FOREIGN KEY (perfil_id) REFERENCES perfiles (id)
);