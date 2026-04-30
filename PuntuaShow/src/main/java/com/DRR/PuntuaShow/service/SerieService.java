package com.DRR.PuntuaShow.service;

import com.DRR.PuntuaShow.entity.Serie;

import java.util.List;

/**
 * Definimos el contrato del servicio.
 *
 * Aquí declaramos QUÉ se puede hacer,
 * no CÓMO se hace.
 */
public interface SerieService {

    // Obtener todas las series
    List<Serie> findAll();
}
