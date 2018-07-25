package springFramework.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import springFramework.services.GreetingRepository;
import springFramework.services.GreetingService;
import springFramework.services.GreetingServiceFactory;

@Configuration
public class GreetingServicesConfiguration {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository)
    {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default", "primary"})
    public GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.greeting("default");
    }

    @Bean
    @Primary
    @Profile("english")
    public GreetingService primaryEnglishService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.greeting("english");
    }

    @Bean
    @Primary
    @Profile("indonesia")
    public GreetingService primaryIndonesiaService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.greeting("indonesia");
    }

    @Bean
    @Primary
    @Profile("spain")
    public GreetingService primarySpainService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.greeting("spain");
    }
}
