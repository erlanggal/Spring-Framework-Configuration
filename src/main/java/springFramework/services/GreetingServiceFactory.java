package springFramework.services;

import org.springframework.stereotype.Controller;

@Controller
public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService greeting(String language)
    {
        switch (language) {
            case "english": {
                return new PrimaryEnglishService(this.greetingRepository);
            }
            case "indonesia": {
                return new PrimaryIndonesiaService(this.greetingRepository);
            }
            case "spain": {
                return new PrimarySpainService(this.greetingRepository);
            }
            default: {
                return new PrimaryGreetingService(this.greetingRepository);
            }
        }
    }
}
