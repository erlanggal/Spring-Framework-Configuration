package springFramework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryIndonesiaService implements GreetingService {

    private GreetingRepository repository;

    public PrimaryIndonesiaService(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayHello() {
        return this.repository.getIndonesiaGreeting();
    }
}
