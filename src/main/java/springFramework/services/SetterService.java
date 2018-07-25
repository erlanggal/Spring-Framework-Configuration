package services;

import org.springframework.stereotype.Service;

@Service
public class SetterService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello - I Call From Setter";
    }
}
