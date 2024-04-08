package ru.mirea.trpp_second_3;

import io.micronaut.context.ApplicationContext;
import io.micronaut.http.HttpResponse;
import io.micronaut.runtime.Micronaut;
import ru.mirea.trpp_second_3.controllers.HealthController;
import ru.mirea.trpp_second_3.entity.HealthResponse;

/**
 * Класс - точка входа в приложение.
 */
public class Application {

    /**
     * Точка входа.
     *
     * @param args аргументы
     */
    public static void main(String[] args) {
        Micronaut.run(Application.class, args).getBean(HealthController.class);
    }
}
