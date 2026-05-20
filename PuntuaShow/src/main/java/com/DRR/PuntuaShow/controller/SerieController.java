package com.DRR.PuntuaShow.controller;

import com.DRR.PuntuaShow.entity.Serie;
import com.DRR.PuntuaShow.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // =========================
    // POST - Crear nueva serie
    // =========================

    /**
     * POST /api/series
     *
     * @RequestBody convierte JSON → objeto Java
     */
    @PostMapping
    public Serie createSerie(@RequestBody Serie serie) {
        return serieService.save(serie);
    }
    // =========================
    // PUT - Actualizar serie
    // =========================

    /**
     * PUT /api/series/{id}
     */
    @PutMapping("/{id}")
    public Serie updateSerie(@PathVariable Long id, @RequestBody Serie serie) {

        /**
         * Aseguramos que el ID del path se usa
         * para actualizar la serie correcta
         */
        serie.setId(id);

        return serieService.save(serie);
    }

    // =========================
    // DELETE - Borrar serie
    // =========================

    /**
     * DELETE /api/series/{id}
     */
    @DeleteMapping("/{id}")
    public void deleteSerie(@PathVariable Long id) {
        serieService.deleteById(id);
    }

    // =========================
    // BÚSQUEDAS PERSONALIZADAS
    // =========================

    /**
     * GET /api/series/nombre?nombre=Dark
     */
    @GetMapping("/nombre")
    public List<Serie> getByNombre(@RequestParam String nombre) {
        return serieService.findByNombre(nombre);
    }

    /**
     * GET /api/series/genero?genero=Drama
     */
    @GetMapping("/genero")
    public List<Serie> getByGenero(@RequestParam String genero) {
        return serieService.findByGenero(genero);
    }


}
