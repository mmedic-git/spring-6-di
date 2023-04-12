package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;

    /*

    ovu cijelu sekciju sada mogu iskomentirati, jer sam klasu označio sa @SpringBootTest, što znači Springu da loada cijeli Springboot kontekst, a koji će odraditi i @Autowired, pa više ne moram kao prije ručno inicijalizirati objekte
    PropertyInjectedController i GreetingServiceImpl.

    @BeforeEach
    void setUp() {

        propertyInjectedController = new PropertyInjectedController();                  //moramo eksplicitno instancirati  i PropertyInjectedController i  GreetingServiceImpl da bi test proradio uspješno
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }
    */

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}