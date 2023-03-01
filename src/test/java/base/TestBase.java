package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public static ChromeDriver driver;
    public static Properties OR = new Properties();
    public static FileInputStream fis;

    @BeforeTest
    public void di() throws IOException {

        if(driver == null){
             fis = new FileInputStream("G:\\software\\intellij\\seleniumLearning\\src\\test\\resources\\properties\\OR.properties");
             OR.load(fis);

        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        System.out.println("Page is opened.");

    }

}
