package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GrettingServicePrimary implements GreetingService{


    @Override
    public String sayGreeting() {               // nadjačat ćemo metodu originalne klase. Obzirom da je Spring naletio na dvije klase GrettingServicePrimary i GreetingService, koje imaju istu metodu sayGreeting,
                                                // pa ne zna koju bi injectirao, jednu od njih mu moramo označiti kao @Primary, tako da kad radi Autowired injekciju odaberu klasu.metodu koja ima oznaku @Primary
        return "Hello from the Primary Bean!!";
    }
}
