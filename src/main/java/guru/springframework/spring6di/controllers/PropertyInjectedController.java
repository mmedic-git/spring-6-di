package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    //način korištenja @Qualifier po nazivu klase, s prvim malim slovom
    //@Qualifier("greetingServicePropertyInjected")  /* @Qulifier će osigurati da se instancira klasa GreetingServicePropertyInjected, po nazivu, s tim moraš pazit na prvo slova da bude malo, ako je klasa s velikim kao što bi trebala biti po Java coding standardu*/

    //Alternativni bolji način je da imenujemo sve servise, označene sa @Service i onda pozivamo po imenu , npr. propertyGreetingService
    @Qualifier("propertyGreetingService")
    @Autowired  //dajemo Spring hint da želimo da ovo bude auto-injectano
    GreetingService greetingService;

    public String sayHello() {

        return greetingService.sayGreeting();

    }
}
