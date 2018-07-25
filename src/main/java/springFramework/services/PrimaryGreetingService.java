package springFramework.services;

public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository repository;

    public PrimaryGreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayHello() {
        return this.repository.getIndonesiaGreeting();
    }
}
