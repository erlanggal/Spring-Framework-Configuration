package springFramework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorService implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello - I Call From Constructor";
    }
}
