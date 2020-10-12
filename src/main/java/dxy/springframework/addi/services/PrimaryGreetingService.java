package dxy.springframework.addi.services;

/**
 * @author AD
 * @date 2020/10/07
 */
//since it will be registered in the Configuration Class, Annotations here have to be removed
//@Primary
//@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World!---primary bean";
    }
}
