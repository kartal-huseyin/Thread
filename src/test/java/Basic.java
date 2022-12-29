
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Basic {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = Driver.getDriver();
    baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void testBasic() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1920,969 | ]]

    driver.get("https://the-internet.herokuapp.com/basic_auth");

    Robot robot=new Robot();
    robot.delay(1000);
    robot.keyPress(KeyEvent.VK_SHIFT);robot.delay(100);
    robot.keyPress(KeyEvent.VK_A);robot.delay(100);
    robot.keyPress(KeyEvent.VK_D);robot.delay(100);
    robot.keyPress(KeyEvent.VK_M);robot.delay(100);
    robot.keyPress(KeyEvent.VK_I);robot.delay(100);
    robot.keyPress(KeyEvent.VK_N);robot.delay(100);
    robot.keyPress(KeyEvent.VK_TAB);robot.delay(100);
    robot.keyPress(KeyEvent.VK_A);robot.delay(100);
    robot.keyPress(KeyEvent.VK_D);robot.delay(100);
    robot.keyPress(KeyEvent.VK_M);robot.delay(100);
    robot.keyPress(KeyEvent.VK_I);robot.delay(100);
    robot.keyPress(KeyEvent.VK_N);robot.delay(100);
    robot.keyPress(KeyEvent.VK_ENTER);robot.delay(100);
    robot.keyRelease(KeyEvent.VK_SHIFT);

    driver.findElement(By.xpath("//h3"));

  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      Assert.fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
