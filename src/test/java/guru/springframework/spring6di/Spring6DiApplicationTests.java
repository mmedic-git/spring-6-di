package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void testAutowireOfController() {
        System.out.println(myController.sayHello());        //Spring IoC je instancirao objekt myController, uspješno jer je objekt @Autowired i zato možemo izvršiti metodu. Minimum kodiranja, ali da bi ovo radilo  MyController mora viti prefiksiran sa @Autowired

    }

    @Test
    void testGetControllerFromCtx() {
        MyController myController = applicationContext.getBean(MyController.class);  //može i ovako, i opet je Spring IoC instancirao bojekt, ali imam malo više koda za napisati. Obzirom da ovdje Ioc instancira MyController objekt, ne ovisi o @Autowired

        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
