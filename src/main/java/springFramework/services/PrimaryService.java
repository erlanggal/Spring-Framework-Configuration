package springFramework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("english")
public class PrimaryService implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello - I'm Called From Primary Service";
    }
}
