package stepdefinitions;

import java.util.Properties;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverFactory;

public class LoginSteps {

    WebDriver driver;

    LoginPage loginPage;

    Properties prop;

    @Given("user launches browser")
    public void user_launches_browser() {

        driver = DriverFactory.initializeBrowser();

        prop = ConfigReader.init_prop();
    }

    @When("user opens OrangeHRM application")
    public void user_opens_orangehrm_application() {

        loginPage = new LoginPage(driver);

        loginPage.openURL(prop.getProperty("url"));
    }

    @And("user enters valid username and password")
    public void user_enters_valid_username_and_password() {

        loginPage.enterUsername(prop.getProperty("username"));

        loginPage.enterPassword(prop.getProperty("password"));
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {

        loginPage.clickLogin();
    }

    @Then("user should navigate to dashboard")
    public void user_should_navigate_to_dashboard() {

        Assert.assertTrue(loginPage.verifyDashboard());
    }
}