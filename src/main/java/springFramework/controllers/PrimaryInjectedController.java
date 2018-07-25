package springFramework.controllers;

import org.springframework.stereotype.Controller;
import springFramework.services.GreetingService;

@Controller
public class PrimaryInjectedController {

    private GreetingService greetingService;

    public PrimaryInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting()
    {
        return this.greetingService.sayHello();
    }
}
