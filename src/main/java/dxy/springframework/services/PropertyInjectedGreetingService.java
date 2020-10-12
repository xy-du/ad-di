package dxy.springframework.services;

import org.springframework.stereotype.Service;

/**
 * @author AD
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World---property";
    }
}
