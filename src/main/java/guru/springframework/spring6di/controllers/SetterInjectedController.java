package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


/* setter bazirani injection primjer */

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;


    @Qualifier("setterGreetingBean") // može i na ovaj način, da je @Qualifier na cijelom setteru-u
    @Autowired
    /*
     ali i na ovaj, da @Qualifier napišemo unutar setter-a, odnosno unutar parametra metode
     public void setGreetingService(@Qualifier("setterGreetingBean") GreetingService greetingService) {
    */
    public void setGreetingService(GreetingService greetingService) {  // koristimo setter
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
