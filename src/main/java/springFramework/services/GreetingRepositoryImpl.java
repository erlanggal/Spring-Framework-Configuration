package springFramework.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello";
    }

    @Override
    public String getIndonesiaGreeting() {
        return "Halo";
    }

    @Override
    public String getSpainGreeting() {
        return "Hola";
    }
}
