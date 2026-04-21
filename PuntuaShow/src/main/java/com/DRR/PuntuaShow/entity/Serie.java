package com.DRR.PuntuaShow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * La anotación @Entity indica que esta clase
 * será mapeada a una tabla en la base de datos.

 * La anotación @Table permite definir el nombre de la tabla.
 * Si no lo pones, usaría "serie" por defecto.
 */
@Entity
@Table(name = "series")
public class Serie {
}
