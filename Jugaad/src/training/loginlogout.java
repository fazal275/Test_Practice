package training;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class loginlogout 
{

	
		public static void main(String[] args) throws InterruptedException 
		{
			//Chrome driver
			//System.setProperty("webdriver.chrome.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			
			//IE driver
			/*File file = new File("D:\\Dektop backup 23 march 2016\\Selenium\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			WebDriver driver = new InternetExplorerDriver();*/
			
			//open browser
			FirefoxDriver driver = new FirefoxDriver ();
			
			// maximize
			driver.manage().window().maximize();
			
			// launch URL
			driver.get("http://10.51.104.24:8765/ifirst/Login.htm");
			
			// hold 
			Thread.sleep(2000);
			
			//find for partial link text
			//driver.findElementByPartialLinkText("")
			
			// find user name
	        /*WebElement Uname = driver.findElement(By.id("loginId"));
	        
	        // insert user name
	        Uname.sendKeys("dvinod");
	        
	        // find user name
	        WebElement password = driver.findElement(By.id("password"));
	        
	        // insert password
	        password.sendKeys("test");
	       
	        // find login button
	        WebElement login = driver.findElement(By.id("authenticate"));
	        
	        //click on login
	        login.click();
	        
	        // find role drop down
	        WebElement Role = driver.findElement(By.id("userRoleId"));
	        
	        // click on value
	        Select opt = new Select(Role);
	        //List<WebElement> ls = opt.getOptions();
	        opt.selectByValue("3");
	        
	        // find continue button
	        WebElement continu = driver.findElement(By.id("proceedToHome"));
	        
	        //click on login
	        continu.click();
	        
	        // hold 
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//img[@alt='Logout']")).click(); */
	        
	        // find user name
	        WebElement Uname1 = driver.findElement(By.xpath("//input[@id='loginId']"));
	        
	        // insert user name
	        Uname1.sendKeys("652678");
	        
	        // find user name
	        WebElement password1 = driver.findElement(By.id("password"));
	        
	        // insert password
	        password1.sendKeys("test");
	       
	        // find login button
	        WebElement login1 = driver.findElement(By.id("authenticate"));
	        
	        //click on login
	        login1.click();
	        
	        // find role drop down
	        
	        WebElement Role1 = driver.findElement(By.id("userRoleId"));
	        // Role1.clear();
	        // click on value
	        Select opt1 = new Select(Role1);
	        //List<WebElement> ls = opt.getOptions();
	        opt1.selectByValue("2");
	        
	        // hold 
	        Thread.sleep(2000);
	        
	        // find continue button
	        WebElement continu2 = driver.findElement(By.xpath("//input[@id='proceedToHome']"));
	        
	        //click on login
	        continu2.click();
	        
	        
	        Thread.sleep(2000); 
            
            /*Actions actions1 = new Actions(driver);
            WebElement mainMenu1 = driver.findElement(By.xpath("//img[@id='4']"));
            
            WebElement subMenu1 = driver.findElement(By.xpath("//div[@id='demo-bar']/ul[2]/li/ul/li/a[@id='5']"));
            actions1.moveToElement(mainMenu1).click().build().perform();
            
            JavascriptExecutor js1 = (JavascriptExecutor)driver;
            js1.executeScript("arguments[0].click();", subMenu1);
            
            
            WebElement web=driver.findElement(By.id("centerFrame"));
            driver.switchTo().frame(web);
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[contains(text(),'3894')]")).click();
            driver.switchTo().defaultContent();
            
            driver.switchTo().frame(web);
            driver.findElement(By.xpath("//input[@id='Edit_Incident']")).click();
            
            new Select(driver.findElement(By.xpath("//select[@id='WORKFLOW_ID']"))).selectByVisibleText("Work In Progress");
            
            driver.findElement(By.id("Update_Incident")).click();
            Alert alert1=driver.switchTo().alert();
            
            alert1.accept();
            
            driver.findElement(By.xpath("//input[@id='Edit_Incident']")).click();  
            
            new Select(driver.findElement(By.xpath("//select[@id='WORKFLOW_ID']"))).selectByVisibleText("Completed");
            
            driver.findElement(By.xpath("//select[@id='ROOTCAUSE_ID']/option[2]")).click();
            
             // driver.findElementByXPath("//input [@id='ROOT_CAUSE_ANALYSIS_BUTTON']");
            //driver.findElementsByXPath("//input [@id='ROOT_CAUSE_ANALYSIS_BUTTON']");
            
            driver.findElement(By.xpath("//input [@id='ROOT_CAUSE_ANALYSIS_BUTTON']")).click();
            
            //Add RCA comments
            String parentwindow = driver.getWindowHandle();
            Set<String> windows = driver.getWindowHandles();
    		//System.out.println(parentwindow);
    		//System.out.println(windows.size());
    		for(String x:windows)
    		{
    			if(!x.equals(parentwindow))
    			{
    				driver.switchTo().window(x);
    				
    				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    				WebElement comments = driver.findElement(By.xpath("//textarea[@id='ENTRY_COMMENTS']"));
    				comments.sendKeys("testfazal");
    				
    				
    				driver.findElement(By.xpath("//div[@id='HTML']/table/tbody/tr[4]/td/input[@value='Add']")).click();
    				
    				Thread.sleep(2000);
    				
    			    				
    				
    				break;
    			}
    		}
    		
    		
    		
    		driver.switchTo().window(parentwindow);
    		Thread.sleep(2000);
    		
    		 driver.switchTo().frame(web);
    		 
    		//driver.close();
    		//driver.switchTo().window(parentwindow);
    		//driver.close();
            driver.findElement(By.xpath("//input[@id='CORRECTIVE_ACTION_BUTTON']")).click();
            
            //Add Corrective Actions comments
            String parentwindow1 = driver.getWindowHandle();
            Set<String> windows1 = driver.getWindowHandles();
    		//System.out.println(parentwindow);
    		//System.out.println(windows.size());
    		for(String x:windows1)
    		{
    			if(!x.equals(parentwindow1))
    			{
    				driver.switchTo().window(x);
    				
    				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
    				WebElement comments = driver.findElement(By.xpath("//textarea[@id='ENTRY_COMMENTS']"));
    				comments.sendKeys("testfazal123");
    				
    				
    				driver.findElement(By.xpath("//div[@id='HTML']/table/tbody/tr[4]/td/input[@value='Add']")).click();
    				
                    Thread.sleep(2000);
    				
    				break;
    			
    			}
    		}
		
    		Thread.sleep(2000);
    		//driver.close();
    		driver.switchTo().window(parentwindow);
    		//driver.close();
    		
    		driver.switchTo().frame(web);
    		
            driver.findElement(By.xpath("//input[@id='PREVENTIVE_ACTION_BUTTON']")).click();
            
    		//Add Preventive Actions comments
            String parentwindow2 = driver.getWindowHandle();
            Set<String> windows2 = driver.getWindowHandles();
    		//System.out.println(parentwindow);
    		//System.out.println(windows.size());
    		for(String x:windows2)
    		{
    			if(!x.equals(parentwindow2))
    			{
    				driver.switchTo().window(x);
    				
    				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
    				WebElement comments = driver.findElement(By.xpath("//textarea[@id='ENTRY_COMMENTS']"));
    				comments.sendKeys("testfazal321");
    				
    				
    				driver.findElement(By.xpath("//div[@id='HTML']/table/tbody/tr[4]/td/input[@value='Add']")).click();
    				
    				driver.switchTo().window(parentwindow);
    				driver.switchTo().frame(web);
    			}
    		}
		
    		driver.findElement(By.id("Update_Incident")).click();
            Alert alert2=driver.switchTo().alert();
            
            alert2.accept(); */
	        
		
          //--------------------------------------------------------------------------------------------//  
	        
	        
	        
	        driver.findElement(By.xpath("//img[@alt='Logout']")).click();
	        
	        // find user name
	        WebElement Uname = driver.findElement(By.id("loginId"));
	        
	        // insert user name
	        Uname.sendKeys("dvinod");
	        
	        // find user name
	        WebElement password = driver.findElement(By.id("password"));
	        
	        // insert password
	        password.sendKeys("test");
	       
	        // find login button
	        WebElement login = driver.findElement(By.id("authenticate"));
	        
	        //click on login
	        login.click();
	        
	        // find role drop down
	        WebElement Role = driver.findElement(By.id("userRoleId"));
	        
	        // click on value
	        Select opt = new Select(Role);
	        //List<WebElement> ls = opt.getOptions();
	        opt.selectByValue("3");
	        
	        // find continue button
	        WebElement continu = driver.findElement(By.id("proceedToHome"));
	        
	        //click on login
	        continu.click();
	        
	        // hold 
	        Thread.sleep(2000);
	        
            
	        


	        Actions actions1 = new Actions(driver);
            WebElement mainMenu1 = driver.findElement(By.xpath("//img[@id='4']"));
            
            WebElement subMenu1 = driver.findElement(By.xpath("//div[@id='demo-bar']/ul[2]/li/ul/li/a[@id='5']"));
            actions1.moveToElement(mainMenu1).click().build().perform();
            
            JavascriptExecutor js1 = (JavascriptExecutor)driver;
            js1.executeScript("arguments[0].click();", subMenu1);
            
            
            WebElement web=driver.findElement(By.id("centerFrame"));
            driver.switchTo().frame(web);
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[contains(text(),'3893')]")).click();
            driver.switchTo().defaultContent();
            
            driver.switchTo().frame(web);
            driver.findElement(By.xpath("//input[@id='Edit_Incident']")).click();
            
            new Select(driver.findElement(By.xpath("//select[@id='WORKFLOW_ID']"))).selectByVisibleText("Preventive Action In Place");
            
            driver.findElement(By.id("Update_Incident")).click();
            Thread.sleep(2000);
            
            Alert alert1=driver.switchTo().alert();
            
            alert1.accept();
            
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//input[@id='Edit_Incident']")).click();  
            
            new Select(driver.findElement(By.xpath("//select[@id='WORKFLOW_ID']"))).selectByVisibleText("Prevented");
            
            driver.findElement(By.id("Update_Incident")).click();
            Thread.sleep(2000);
            
            Alert alert2 = driver.switchTo().alert();
            
            alert2.accept();
            
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//input[@id='Edit_Incident']")).click();  
            
            new Select(driver.findElement(By.xpath("//select[@id='WORKFLOW_ID']"))).selectByVisibleText("Closed");
            
            driver.findElement(By.id("Update_Incident")).click();
            Thread.sleep(2000);
            
            Alert alert3=driver.switchTo().alert();
            
            alert3.accept();
	        
		
		}
}
