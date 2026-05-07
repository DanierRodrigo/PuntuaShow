package com.DRR.PuntuaShow.controller;

import com.DRR.PuntuaShow.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
