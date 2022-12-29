
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import java.time.Instant;

public class TestThreadDriver {

    WebDriver driver;

    @Test
    public void test01() {
        System.out.println("Firefox Test Starts at:  " + Instant.now());
        System.out.println("The Thread ID for FIREFOX Is :  " + Thread.currentThread().getId());



        System.out.println("Firefox Browser Starts at:  " + Instant.now());
        Driver.getDriver("firefox").get("https://firefox.com");

    }

    @Test
    public void test02() throws InterruptedException {
        System.out.println("Chrome Test Starts at:  " + Instant.now());
        System.out.println("The Thread ID for CHROME Is :  " + Thread.currentThread().getId());

        Thread.sleep(1400);

        System.out.println("Chrome Browser Starts at:  " + Instant.now());
        Driver.getDriver("chrome").get("https://google.com");







    }

}

