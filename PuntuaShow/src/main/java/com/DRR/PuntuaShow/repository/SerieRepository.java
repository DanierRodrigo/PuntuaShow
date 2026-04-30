package com.DRR.PuntuaShow.repository;

import com.DRR.PuntuaShow.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Un Repository en Spring Data es una interfaz (NO una clase).
 *
 * Spring se encarga automáticamente de crear la implementación
 * en tiempo de ejecución.
 */
public interface SerieRepository extends JpaRepository<Serie, Long> {
}