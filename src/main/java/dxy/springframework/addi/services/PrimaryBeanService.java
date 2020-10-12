package dxy.springframework.addi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author AD
 * @date 2020/10/07
 */
@Primary
@Service
public class PrimaryBeanService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World!---primary bean";
    }
}
