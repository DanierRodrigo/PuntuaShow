package com.DRR.PuntuaShow.repository;

import com.DRR.PuntuaShow.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Un Repository en Spring Data es una interfaz (NO una clase).
 *
 * Spring se encarga automáticamente de crear la implementación
 * en tiempo de ejecución.
 */
public interface SerieRepository extends JpaRepository<Serie, Long> {

    // =========================
    // MÉTODOS PERSONALIZADOS
    // =========================

    /**
     * Spring genera automáticamente la query a partir del nombre.
     *
     * findBy + NombreCampo
     *
     * Esto generará algo equivalente a:
     * SELECT * FROM series WHERE nombre = ?
     */
    List<Serie> findByNombre(String nombre);

    /**
     * Buscar por género
     */
    List<Serie> findByGenero(String genero);

}