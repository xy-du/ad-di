package dxy.springframework.addi.services;

/**
 * @author AD
 * @date 2020/10/11
 */
public class PrimarySpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola---spanish";
    }
}
