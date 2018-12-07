package training;


import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Pmts {

	public static void main(String[] args) throws InterruptedException {
		        
		     //open FireFox browser 
		     //FirefoxDriver driver = new FirefoxDriver();
		
			//open Chrome browser
		    //System.setProperty("webdriver.chrome.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			
			
		   // open IE browser
		    //File file = new File("D:\\Dektop backup 23 march 2016\\Selenium\\IEDriverServer.exe");
		    System.setProperty("webdriver.ie.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\IEDriverServer.exe");
		    WebDriver driver = new InternetExplorerDriver();
		   
		  
		    //System.setProperty("webdriver.ie.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\IEDriverServer.exe");
		    //WebDriver driver = new InternetExplorerDriver();
		    
				
				// maximize window
				driver.manage().window().maximize();
				
				// launch URL
				driver.get("http://10.75.162.162:88/Account/FrmLogin.aspx");
				Thread.sleep(2000);
				
				// find user id
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.id("txtUserID")).sendKeys("sapancha");
				//driver.findElement(By.xpath("//input[@id='txtUserID']")).sendKeys("sapancha");
				//driver.findElement(By.cssSelector("input[id='txtUserID']")).sendKeys("sapancha");
				Thread.sleep(2000);
				
				// find portal button and click on it
				//driver.findElement(By.xpath("//*[@id='form1']/div[3]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/input[@id='btnSubmit']")).click();
				driver.findElement(By.cssSelector("#btnSubmit")).click();
				Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//Find Delivery and click on it
				//driver.findElement(By.xpath("//div[@id='Menu_CAP']/ul/li[3]/a")).click();
				// <a class="level1 static highlighted" tabindex="-1">DELIVERY</a>
				driver.findElement(By.cssSelector("li.static:nth-child(3) > a:nth-child(1)")).click();
				
				//MouseHover on PMTS
				Actions actions = new Actions(driver);
				WebElement menuHoverLink = driver.findElement(By.linkText("PMTS"));
				Thread.sleep(2000);
				
				//MouseHover on AM Metrics
				actions.moveToElement(menuHoverLink).perform();
				WebElement subLink = driver.findElement(By.xpath("//div[@id='Menu_CAP']/ul/li[3]/ul/li[3]/ul/li[4]/a[contains(text(),'AM Metrics')]"));
				//WebElement subLink = driver.findElement(By.cssSelector("#Menu_CAP/:submenu/:57>li:nth-child(4)>a:nth-child(1)"));
				//WebElement subLink = driver.findElement(By.cssSelector("#Menu_CAP/:submenu/:57>li:nth-child(4)>a:nth-child(1)"));
				Thread.sleep(2000);
				
				//MouseHover on Monthly Metrics
				actions.moveToElement(subLink).perform();
				WebElement subLink1 = driver.findElement(By.xpath("//div[@id='Menu_CAP']/ul/li[3]/ul/li[3]/ul/li[4]/ul/li/a[contains(text(),'Monthly Metrics')]"));
				//WebElement subLink1 = driver.findElement(By.cssSelector("#Menu_CAP/:submenu/:95>li:nth-child(1)>a:nth-child(1)"));
				//WebElement subLink1 = driver.findElement(By.cssSelector("#Menu_CAP/:submenu/:95>li:nth-child(1)>a:nth-child(1)"));
				//.click().build().perform()
				Thread.sleep(2000);
				actions.moveToElement(subLink1).click().build().perform();
				
				
				Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				
				//Switch to frame
				driver.switchTo().frame(driver.findElement(By.id("frmapplications")));
				
				// Insert Project ID
				driver.findElement(By.cssSelector("#txtProjID")).sendKeys("100191204");
				Thread.sleep(10000);
				
				//Click on AM Project ID Search Button
				WebElement Search = driver.findElement(By.cssSelector("#imgBtnProjLookUp"));
				Thread.sleep(6000);
				Search.click();
				
				Thread.sleep(4000);
				
				//find and Click on Ticket Button 
				driver.findElement(By.cssSelector("#img9")).click();
				Thread.sleep(2000);
				
				driver.switchTo().defaultContent();
				
				//find and Click on Upload Button 
				driver.findElement(By.xpath("//*[@id='imgBtnUpload']")).click();
				
				//Upload 
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				/*
				//driver.switchTo().defaultContent();
				 
				
				String winHandleparent= driver.getWindowHandle();
				System.out.println("Parent window Handle-->"+winHandleparent);
				
				Set<String> childwindow=driver.getWindowHandles();
				System.out.println("Child windows-->"+childwindow);
				
				Search.click();
				
				for (String string : childwindow) {
					driver.switchTo().window(string);
				}
				
				//System.out.println(winHandleparent);
				
				//driver.navigate().to("http://10.75.162.162:88/Portal_Demo_PMTS/AspxPages/FrmProjectLookUp.aspx?ProjType=2&LID=71");
				
				 driver.findElement(By.xpath("//input[@id='txtSearch']")).sendKeys("100191204");
				 
			
				
			
			
				
				
				//Log Out
				//driver.findElement(By.xpath("//a[@id='btnlogout']")).click();
				
				*/
	}

}
