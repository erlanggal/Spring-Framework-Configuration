package springFramework.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springFramework.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorService") GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String greeting()
    {
        return this.greetingService.sayHello();
    }
}
