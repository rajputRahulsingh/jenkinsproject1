package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By username = By.name("username");

    By password = By.name("password");

    By loginBtn = By.xpath("//button[@type='submit']");

    By dashboard = By.xpath("//h6[text()='Dashboard']");

    public void openURL(String url) {

        driver.get(url);
    }

    public void enterUsername(String uname) {

        WebElement user =
                wait.until(
                ExpectedConditions.visibilityOfElementLocated(username));

        user.sendKeys(uname);
    }

    public void enterPassword(String pass) {

        WebElement passField =
                wait.until(
                ExpectedConditions.visibilityOfElementLocated(password));

        passField.sendKeys(pass);
    }

    public void clickLogin() {

        WebElement login =
                wait.until(
                ExpectedConditions.elementToBeClickable(loginBtn));

        login.click();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }

        System.out.println("URL After Login = "
                + driver.getCurrentUrl());
    }

    public boolean verifyDashboard() {

        wait.until(
                ExpectedConditions.urlContains("dashboard"));

        return true;
    }
}