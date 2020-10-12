package dxy.springframework.services;

import org.springframework.stereotype.Service;

/**
 * @author AD
 * @date 2020/10/07
 */
@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World---constructor";
    }
}
