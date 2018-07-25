package springFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import springFramework.controllers.*;

@SpringBootApplication
//@ComponentScan(basePackages = {"springFramework.services", "springFramework"})
public class WellDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(WellDemoApplication.class, args);

        MyControllers myControllers = (MyControllers) ctx.getBean("myControllers");
        myControllers.greeting();

        System.out.println(ctx.getBean(PropertyInjectedController.class).greeting());
        System.out.println(ctx.getBean(SetterInjectedController.class).greeting());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).greeting());
        System.out.println(ctx.getBean(PrimaryInjectedController.class).greeting());
    }
}
