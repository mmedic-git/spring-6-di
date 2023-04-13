package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller         //@Controler upućuje da se radi o Spring managiranoj komponenti
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    /* ovo je bitno, sa qualifierom @Qualifier ćemo ipak nadjačati @Primary da nam ipak pozove base klasu
    @Qulifier će osigurati da se instancira klasa GreetingServiceImpl, po nazivu, s tim moraš pazit na prvo slova da bude malo, ako je klasa s velikim kao što bi trebala biti po Java coding standardu
    */
    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) { // koristimo constructor
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting();
    }
}
