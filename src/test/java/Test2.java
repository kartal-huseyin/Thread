import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Instant;

public class Test2 {

    WebDriver driver;

    @Test
    public void test01() {
        System.out.println("Firefox1 Test Starts at:  " + Instant.now());
        System.out.println("The Thread ID for FIREFOX Is :  " + Thread.currentThread().getId());

        System.out.println("Firefox Browser Starts at:  " + Instant.now());
        DriverSingleton.getDriver("firefox").get("https://firefox.com");

    }

    @Test
    public void test02() throws InterruptedException {
        System.out.println("Firefox2 Test Starts at:  " + Instant.now());
        System.out.println("The Thread ID for FIREFOX Is :  " + Thread.currentThread().getId());

        System.out.println("Firefox Browser Starts at:  " + Instant.now());
        DriverSingleton.getDriver("firefox").get("https://firefox.com");

    }

    @Test
    public void test03() {
        System.out.println("Firefox3 Test Starts at:  " + Instant.now());
        System.out.println("The Thread ID for FIREFOX Is :  " + Thread.currentThread().getId());

        System.out.println("Firefox Browser Starts at:  " + Instant.now());
        DriverSingleton.getDriver("firefox").get("https://firefox.com");

    }

    @Test
    public void test04() throws InterruptedException {
        System.out.println("Chrome1 Test Starts at:  " + Instant.now());
        System.out.println("The Thread ID for CHROME Is :  " + Thread.currentThread().getId());

        Thread.sleep(1400);

        System.out.println("Chrome Browser Starts at:  " + Instant.now());
        DriverSingleton.getDriver("chrome").get("https://google.com");

    }

    @Test
    public void test05() throws InterruptedException {
        System.out.println("Chrome2 Test Starts at:  " + Instant.now());
        System.out.println("The Thread ID for CHROME Is :  " + Thread.currentThread().getId());

        Thread.sleep(1400);

        System.out.println("Chrome Browser Starts at:  " + Instant.now());
        DriverSingleton.getDriver("chrome").get("https://google.com");

    }

    @Test
    public void test06() throws InterruptedException {
        System.out.println("Chrome3 Test Starts at:  " + Instant.now());
        System.out.println("The Thread ID for CHROME Is :  " + Thread.currentThread().getId());

        Thread.sleep(1400);

        System.out.println("Chrome Browser Starts at:  " + Instant.now());
        DriverSingleton.getDriver("chrome").get("https://google.com");

    }


    @Test
    public void test07() throws InterruptedException {
        System.out.println("Chrome3 Test Starts at:  " + Instant.now());
        System.out.println("The Thread ID for CHROME Is :  " + Thread.currentThread().getId());

        Thread.sleep(1400);

        System.out.println("Chrome Browser Starts at:  " + Instant.now());
        DriverSingleton.getDriver("chrome").get("https://google.com");

    }








}



