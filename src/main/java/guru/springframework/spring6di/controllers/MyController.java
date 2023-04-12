package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {                               // u constructoru smo instancirali novi objekt tipa GreetingServiceImpl
        this.greetingService = new GreetingServiceImpl(); // ovo naravno radi, ali je nefleksibilno, jer sad MyController direktno instancira/ovisi o GreetingServiceImpl klasi. To ćemo zamijeniti kasnije sa IoC Dependency Injection-om.
    }                                                     // U ovom primjeru nema nikakvog IoC-a, nego smo objekte instancirali direktno.

    public String sayHello() {

        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }

}
