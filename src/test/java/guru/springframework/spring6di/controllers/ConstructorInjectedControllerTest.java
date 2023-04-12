package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController controller;

    /*
    opet ista spika, eksplicitno instanciranje klasa mijenjamo sa @SpringBootTest i  @Autowired
    @BeforeEach
    void setUp() {
        controller  = new ConstructorInjectedController(new GreetingServiceImpl()); // ovdje oponašamo otprilike što radi Spring framework, a to je da implicitno instancira objekte, pa to ne moramo ručno raditi u kodu. IoC princip rada.
    }
    */
    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}