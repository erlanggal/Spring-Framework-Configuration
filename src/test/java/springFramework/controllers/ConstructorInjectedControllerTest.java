package springFramework.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import springFramework.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;


    @Before
    public void setUp()
    {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void test()
    {
        Assert.assertEquals(this.constructorInjectedController.greeting(), GreetingServiceImpl.word);
    }
}
