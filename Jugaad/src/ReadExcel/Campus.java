package ReadExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Campus {

	public static void main(String[] args) throws InterruptedException {
		
		 //Open firefox browser
		 FirefoxDriver driver = new FirefoxDriver();
		 
		 //Maximize browser
		 driver.manage().window().maximize();
		 
		 //Launch the test URL
		 driver.get("http://10.51.104.60:8888/campuscrawler/Login.htm#");
		 
		 //Wait for the page to load
		 Thread.sleep(3000);
		 
		 //User ID
		 //driver.findElement(By.id("loginId")).sendKeys("mcampane");
		 //driver.findElementByXPath("//input[@id='loginId']").sendKeys("mcampane");
		 driver.findElementByCssSelector("#loginId").sendKeys("mcampane");
		 
		 //Password
		 //driver.findElement(By.id("passWordId")).sendKeys("testCC");
		 //driver.findElementByXPath("//input[@id='passWordId']").sendKeys("testCC");
		 driver.findElementByCssSelector("#passWordId").sendKeys("testCC");
		 
		 //Login Button
		 driver.findElementByName("login1").click();
		 //driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input")).click();
		 // driver.findElement(By.cssSelector("input[name=login1]")).click();
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
