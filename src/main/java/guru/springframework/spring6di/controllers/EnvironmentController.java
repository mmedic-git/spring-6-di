package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;  //samo jednu instancu želimo povezati, pa neka se ovisno o okolini poziva koja treba (dev, qa, uat, prod). Označi sa final da se ne može modificirati

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return "You are in " + environmentService.getENV() + " Environment";
    }

}
