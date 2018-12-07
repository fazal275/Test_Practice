package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class frames {
	
	WebDriver driver = null;
	@Test
	public void propertypage() throws InterruptedException
	{
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='search/about.php']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@id='bar_category'][@value = 'S']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href = 'index.php']")).click();
		
	}
	
	@BeforeMethod
	public void launchbrowser()
	{
		 driver = new FirefoxDriver();
		driver.get("http://www.propertiesindia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void tear_down()
	{
		driver.close();
	}
	
}
