package services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"indonesia","default"})
public class PrimaryIndonesiaService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hallo Erlangga";
    }
}
