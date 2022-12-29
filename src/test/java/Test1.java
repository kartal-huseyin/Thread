import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Instant;

public class Test1 {



    @Test
    public void test01() throws InterruptedException {
        System.out.println("Firefox Test Starts at:  " + Instant.now());
        System.out.println("The Thread ID for FIREFOX Is :  " + Thread.currentThread().getId());

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        System.out.println("Firefox Browser Starts at:  " + Instant.now());
        driver.get("https://firefox.com");

    }

    @Test
    public void test02() throws InterruptedException {
        System.out.println("Chrome Test Starts at:  " + Instant.now());
        System.out.println("The Thread ID for CHROME Is :  " + Thread.currentThread().getId());

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        System.out.println("Chrome Browser Starts at:  " + Instant.now());
        driver.get("https://google.com");
        Thread.sleep(5000);
        driver.get("https://amazon.com");







    }

}



