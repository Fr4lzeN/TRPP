package ru.mirea.trpp_second_3;

import io.micronaut.http.HttpResponse;
import ru.mirea.trpp_second_3.controllers.ClientController;
import ru.mirea.trpp_second_3.entity.Client;

public class Checker {
    public static void main(String[] args) {
        ClientController controller = new ClientController();
        HttpResponse<Client> response = controller.findById(183L);
        System.out.println("Code: "+response.code()+"\nBody: "+response.body().toString());
    }
}
