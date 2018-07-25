package springFramework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springFramework.services.GreetingService;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterService")
    public void setGreetingService(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String greeting()
    {
        return this.greetingService.sayHello();
    }
}
