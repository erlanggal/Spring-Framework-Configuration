package springFramework.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import springFramework.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp()
    {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void test()
    {
        Assert.assertEquals(GreetingServiceImpl.word, this.propertyInjectedController.greeting());
    }
}
