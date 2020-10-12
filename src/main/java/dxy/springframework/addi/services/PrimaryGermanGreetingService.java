package dxy.springframework.addi.services;

/**
 * @author AD
 * @date 2020/10/11
 */
public class PrimaryGermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo--German";
    }
}
