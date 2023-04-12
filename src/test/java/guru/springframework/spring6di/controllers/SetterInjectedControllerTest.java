package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;



    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl()); //ako iskomentiram ovu liniju, test će fail-ati, jer se objekt tipa GreetingServiceImpl neće kreirati, pa nećemo moći pozvati ni metodu objekta pod nazivom sayHello()
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}