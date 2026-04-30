package com.DRR.PuntuaShow.config;

import com.DRR.PuntuaShow.entity.Serie;
import com.DRR.PuntuaShow.repository.SerieRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration indica que esta clase es una clase de configuración de Spring.
 *
 * Es decir, aquí definimos "cosas" (beans) que Spring debe gestionar.
 */
@Configuration
public class DataLoader {

    /**
     * @Bean indica que el objeto que devuelve este mét.odo
     * será gestionado por el contenedor de Spring (IoC Container).
     *
     * En este caso, estamos registrando un CommandLineRunner como bean.
     */
    @Bean
    CommandLineRunner initDatabase(SerieRepository repository) {

        /**
         * IMPORTANTE:
         *
         * - Spring detecta que este mét.odo necesita un SerieRepository
         * - Busca un bean de tipo SerieRepository
         * - Lo inyecta automáticamente (Dependency Injection)
         *
         * Tú NO creas el repository con "new"
         * → Spring lo hace por ti
         */

        return args -> {

            /**
             * Este código se ejecuta automáticamente
             * cuando la aplicación arranca.
             *
             * CommandLineRunner es una interfaz funcional
             * que Spring ejecuta al inicio.
             */

            // =========================
            // INSERTAMOS DATOS DE PRUEBA
            // =========================

            repository.save(new Serie("Breaking Bad", 2008, "Drama", "Vince Gilligan", 10));
            repository.save(new Serie("Dark", 2017, "Ciencia ficción", "Baran bo Odar", 7));

            /**
             * save():
             * - Si el ID es null → INSERT
             * - Si el ID existe → UPDATE
             */

            // =========================
            // PROBAMOS UNA QUERY
            // =========================

            System.out.println("Series con puntuación >= 9:");

            repository.findByPuntuacionGreaterThanEqual(9)
                    .forEach(serie -> System.out.println(serie.getNombre()));

            /**
             * findByPuntuacionGreaterThanEqual:
             *
             * Spring genera automáticamente esta query a partir del nombre.
             * No hemos escrito SQL en ningún momento.
             */
        };
    }
}