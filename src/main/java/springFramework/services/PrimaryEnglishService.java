package springFramework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryEnglishService implements GreetingService{

    private GreetingRepository repository;

    public PrimaryEnglishService(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayHello() {
        return this.repository.getEnglishGreeting();
    }
}
