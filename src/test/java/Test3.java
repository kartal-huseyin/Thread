
import org.junit.Test;


public class Test3 {



    @Test
    public void test01() throws InterruptedException {

        System.out.println("The Thread ID for FIREFOX Is :  " + Thread.currentThread().getId());

        Thread.sleep(3000);


        DriverSingleton.getDriver("firefox").get("https://firefox.com");



    }

    @Test
    public void test02() throws InterruptedException {

        System.out.println("The Thread ID for CHROME Is :  " + Thread.currentThread().getId());

        DriverSingleton.getDriver("chrome").get("https://yahoo.com");

    }

    @Test
    public void test03() throws InterruptedException {

        System.out.println("The Thread ID for CHROME Is :  " + Thread.currentThread().getId());


        Thread.sleep(3000);

        DriverSingleton.getDriver("chrome").get("https://google.com");
        Thread.sleep(20000);

    }

    @Test
    public void test04() throws InterruptedException {

        System.out.println("The Thread ID for CHROME Is :  " + Thread.currentThread().getId());


        Thread.sleep(15000);

        DriverSingleton.getDriver("chrome").get("https://amazon.com");

    }



}



