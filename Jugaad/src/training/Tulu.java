package training;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Tulu {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://10.51.104.24:8765/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTulu() throws Exception {
    driver.get(baseUrl + "/ifirst/Login.htm");
    driver.findElement(By.id("loginId")).clear();
    driver.findElement(By.id("loginId")).sendKeys("dvinod");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("test");
    driver.findElement(By.id("authenticate")).click();
    driver.findElement(By.id("proceedToHome")).click();
    driver.findElement(By.id("17")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [removeSelection | id=CITY_ID | label=--Please Select--]]
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=CITY_ID | label=Ballarat]]
    new Select(driver.findElement(By.id("buildingId"))).selectByVisibleText("Wendouree - 300B Gillies Street");
    new Select(driver.findElement(By.id("floor"))).selectByVisibleText("1st Floor");
    new Select(driver.findElement(By.id("CATEGORY_ID"))).selectByVisibleText("Bombing / Terrorist Attack / Bomb Hoax");
    new Select(driver.findElement(By.id("SEVERITY_ID"))).selectByVisibleText("Critical");
    new Select(driver.findElement(By.id("IMPACT_ID"))).selectByVisibleText("Critical");
    driver.findElement(By.id("actualDateID")).click();
    driver.findElement(By.linkText("20")).click();
    driver.findElement(By.id("INCIDENT_DESCRIPTION")).clear();
    driver.findElement(By.id("INCIDENT_DESCRIPTION")).sendKeys("test");
    driver.findElement(By.id("iSubmit")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
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
