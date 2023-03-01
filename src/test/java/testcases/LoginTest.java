package testcases;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void login() {

        WebElement username = driver.findElement(By.xpath(OR.getProperty("Username")));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath(OR.getProperty("Password")));
        password.sendKeys("admin");


        WebElement submitButton = driver.findElement(By.xpath(OR.getProperty("SubmitButton")));
        submitButton.click();
    }
}
