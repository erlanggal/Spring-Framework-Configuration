package springFramework.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import springFramework.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp()
    {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void test()
    {
        Assert.assertEquals(GreetingServiceImpl.word, this.setterInjectedController.greeting());
    }
}
