package ReadExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DrawIT_Login_Logout {
public static void main(String[] args) throws InterruptedException{
	
	//open browser
	FirefoxDriver driver = new FirefoxDriver ();
	
	//open Chrome browser
    //System.setProperty("webdriver.chrome.driver", "D:\\Lasest BackUP 30 Jan 2017\\chrome_driver\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();			
	
	
	// maximize
	driver.manage().window().maximize();
	
	// launch URL
	driver.get("http://10.100.245.68:8080/drawit/LOGIN_Page.htm");
	
	// hold 
	Thread.sleep(3000);
	
	// find user name
    WebElement Uname = driver.findElement(By.xpath("//*[@id='loginId']"));
    
    // insert user name
    Uname.sendKeys("salipd");  
    
    // find user name
    WebElement password = driver.findElement(By.id("password"));
    
    // insert password
    password.sendKeys("test");
    
    Thread.sleep(2000);
   
    // find login button and click on login
   driver.findElement(By.id("login")).click();
    
    //click on login
    //login.click();
	
   Thread.sleep(5000);
   
   // find logout button and click on logout
   driver.findElement(By.xpath("*[@id='navbar']/ul[2]/li[1]/span[2]")).click();
   
   //close browser
   driver.close();
   
}
}
