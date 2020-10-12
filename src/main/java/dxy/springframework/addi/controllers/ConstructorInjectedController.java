package dxy.springframework.addi.controllers;

import dxy.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author AD
 */

@Controller
public class ConstructorInjectedController {
    private GreetingService service;


    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService service) {
        this.service = service;
    }

    public String getGreeting() {
        return service.sayGreeting();
    }
}
