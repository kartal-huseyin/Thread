package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class Stepdefs  {


    @Given("one")
    public void one() {
        System.out.println("");
    }
    @Then("two")
    public void two() {
        System.out.println("a" +
                "");


        Assert.assertEquals("a","a");

    }




}
