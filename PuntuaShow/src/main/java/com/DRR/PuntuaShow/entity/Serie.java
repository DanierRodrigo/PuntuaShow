package com.DRR.PuntuaShow.entity;

import jakarta.persistence.*;


/**
 * La anotación @Entity indica que esta clase
 * será mapeada a una tabla en la base de datos.

 * La anotación @Table permite definir el nombre de la tabla.
 * Si no lo pones, usaría "serie" por defecto.
 */
@Entity
@Table(name = "series")
public class Serie {

    /**
     * @ Id indica que este campo es la clave primaria.
     * @ GeneratedValue indica cómo se genera el ID.
     *
     * IDENTITY → la base de datos se encarga de generar
     * un valor autoincremental (como AUTO_INCREMENT en SQL).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * @ Column permite configurar la columna en la BD.
     * -nullable = "false" → este campo es obligatorio.
     * No se puede guardar una serie sin nombre.
     */
    @Column(nullable = false)
    private String nombre;

    /**
     * Año de la serie (no obligatorio).
     * Al no poner @Column, JPA lo mapeará automáticamente
     * con el mismo nombre del atributo.
     */
    private Integer anio;

    /**
     * Género de la serie (Drama, Comedia, etc.)
     */
    private String genero;

    /**
     * Director de la serie
     */
    private String director;

    /**
     * Puntuación que le da el usuario (1–10)
     */
    @Column(name = "puntuacion_usuario")
    // Nombre personalizado en la base de datos
    private Integer puntuacion;


    /**
     * Constructor vacío obligatorio para JPA.
     *
     * Hibernate necesita poder crear instancias
     * de la clase mediante reflexión.
     */
    public Serie() {
    }

    /**
     * Constructor con parámetros.
     * Muy útil para crear objetos manualmente.
     */
    public Serie(String nombre, Integer anio, String genero, String director, Integer puntuacion) {
        this.nombre = nombre;
        this.anio = anio;
        this.genero = genero;
        this.director = director;
        this.puntuacion = puntuacion;
    }
}
