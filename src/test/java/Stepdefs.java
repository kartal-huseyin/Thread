import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class Stepdefs  {



    @Given("one")
    public void one() {
        Driver.getDriver().get("https://www.google.com");
        System.out.println("");
    }
    @Then("two")
    public void two() {
        System.out.println("a" +
                "");


        Assert.assertEquals("a","a");

    }



}

