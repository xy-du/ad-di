package dxy.springframework.addi.controllers;

import dxy.springframework.addi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService service;

    /**
     * no @qualifier here in order to test the primary bean
     */
    public MyController(GreetingService service) {
        this.service = service;
    }

    public String sayHi() {
        return service.sayGreeting();
    }
}
