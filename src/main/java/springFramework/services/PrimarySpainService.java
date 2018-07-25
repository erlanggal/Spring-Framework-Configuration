package springFramework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("spain")
public class PrimarySpainService implements GreetingService{

    @Override
    public String sayHello() {
        return "Servicio de Saluda Primario";
    }
}
