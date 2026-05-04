package com.DRR.PuntuaShow.service.impl;

import com.DRR.PuntuaShow.entity.Serie;
import com.DRR.PuntuaShow.repository.SerieRepository;
import com.DRR.PuntuaShow.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Service indica que esta clase es un componente
 * de lógica de negocio gestionado por Spring.
 */
@Service
public class SerieServiceImpl implements SerieService {

    /**
     * Inyección del repository.
     *
     * Spring nos proporciona automáticamente la instancia con Autowired.
     */
    @Autowired
    private SerieRepository serieRepository;

    // =========================
    // MÉTODOS CRUD BÁSICOS
    // =========================

    @Override
    public List<Serie> findAll() {
        return serieRepository.findAll();
    }

    @Override
    public Optional<Serie> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Serie save(Serie serie) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Serie> findByNombre(String nombre) {
        return List.of();
    }

    @Override
    public List<Serie> findByGenero(String genero) {
        return List.of();
    }

    @Override
    public List<Serie> findByPuntuacionMinima(Integer puntuacion) {
        return List.of();
    }

    @Override
    public List<Serie> findByDirector(String director) {
        return List.of();
    }
}
