package springFramework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String word = "Hello World";

    @Override
    public String sayHello() {
        return this.word;
    }
}
