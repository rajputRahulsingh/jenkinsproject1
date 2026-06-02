package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import utils.DriverFactory;

public class Hooks {

    @Before
    public void setUp() {

        System.out.println("Starting Test");
    }

    @After
   
    public void tearDown() {


    if (DriverFactory.driver != null) {
        DriverFactory.driver.quit();
    }
   

    }
}
