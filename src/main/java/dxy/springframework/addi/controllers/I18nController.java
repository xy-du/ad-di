package dxy.springframework.addi.controllers;

import dxy.springframework.addi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author AD
 * @date 2020/10/08
 */

@Controller
public class I18nController {
    GreetingService service;

    public I18nController(@Qualifier("i18nService") GreetingService service) {
        this.service = service;
    }

    public String getGreeting() {
        return service.sayGreeting();
    }

}
