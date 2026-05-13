package com.DRR.PuntuaShow.controller;

import com.DRR.PuntuaShow.entity.Serie;
import com.DRR.PuntuaShow.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @RestController indica que esta clase es un controlador REST.
 *
 * Combina:
 * - @Controller
 * - @ResponseBody (devuelve JSON automáticamente)
 */
@RestController

/**
 * Define la ruta base de todos los endpoints
 *
 * Ejemplo:
 * http://localhost:1010/api/series
 */
@RequestMapping("/api/series")
public class SerieController {

    /**
     * Inyectamos el service (NO el repository)
     */
    @Autowired
    private SerieService serieService;

    // =========================
    // GET - Obtener todas las series
    // =========================

    /**
     * GET /api/series
     */
    @GetMapping
    public List<Serie> getAllSeries() {
        return serieService.findAll();
    }

    // =========================
    // GET - Buscar por ID
    // =========================

    /**
     * GET /api/series/{id}
     */
    @GetMapping("/{id}")
    public Optional<Serie> getSerieById(@PathVariable Long id) {
        return serieService.findById(id);
    }

}
