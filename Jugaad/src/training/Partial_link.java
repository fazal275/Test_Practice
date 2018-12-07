package training;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Partial_link {

	public static void main(String[] args) throws InterruptedException {
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
        //Thread.sleep(3000);
        
        
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
        // find CreateIncident button
        
        //WebElement CreateIncident = driver.findElement(By.id("proceedToHome"));
        //WebElement CreateIncident = driver.findElementByPartialLinkText("javascript:menuURLRedirect(17)");
        //driver.findElement(By.linkText("javascript:menuURLRedirect(17)")).click();
        
        WebElement CreateIncident = driver.findElement(By.id("17"));
        
        
        //click on CreateIncident
        CreateIncident.click();
        
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
        

        // find ImpactedLocation Multi Select
        WebElement web=driver.findElement(By.id("centerFrame"));
        driver.switchTo().frame(web);
        WebElement combo =  driver.findElement(By.id("CITY_ID"));
        Select Selection = new Select(combo);
        Selection.selectByValue("1");
        driver.switchTo().defaultContent();
     
        driver.switchTo().frame(web);
       // WebElement combo =  driver.findElement(By.id("CITY_ID"));
        /*driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select Selection = new Select(combo);
        Selection.selectByIndex(2);
        
        Select objselect = new Select(driver.findElement(By.id("CITY_ID")));
        objselect.selectByVisibleText(" Bangalore ");*/
      
      
      
        
       // driver.findElement(By.xpath("//select[@id='CITY_ID']/option[3]")).click();
        
        // find CityId drop down
        // WebElement CityId = driver.findElement(By.id("CITY_ID")); 
        //WebElement CityId = driver.findElementByClassName("LOCATION_ID");
        //WebElement CityID = driver.findElementByClassName("_LOCATION_ID");
        
        
        //click on value
       // Select Cityopt = new Select(CityId);
        //List<WebElement> ls1 = Cityopt.getOptions();
        
       
        //Cityopt.selectByValue("1");
        
        
        /*Select select = new Select(driver.findElement(By.xpath(".//*[@id='CITY_ID']")));
        select.deselectAll();
        select.selectByVisibleText("Value1");*/
       
        
        
     // find building drop down
        WebElement building = driver.findElement(By.id("buildingId"));
        Select opt1 = new Select(building);
        //List<WebElement> ls = opt.getOptions();
        opt1.selectByValue("0");
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(web);
        
     // find Floor drop down
        WebElement floor = driver.findElement(By.id("floor"));
        Select opt2 = new Select(floor);
        //List<WebElement> ls = opt.getOptions();
        opt2.selectByValue("0");
        driver.switchTo().defaultContent(); 
        driver.switchTo().frame(web);
        
       // find CategoryofIncident drop down
        WebElement CategoryofIncident = driver.findElement(By.id("CATEGORY_ID"));
        Select opt3 = new Select(CategoryofIncident);
        //List<WebElement> ls = opt.getOptions();
        opt3.selectByValue("10");
        driver.switchTo().defaultContent(); 
        driver.switchTo().frame(web);
        
        // find SeverityofIncident drop down
         WebElement SeverityofIncident = driver.findElement(By.id("SEVERITY_ID"));
         Select opt4 = new Select(SeverityofIncident);
         //List<WebElement> ls = opt.getOptions();
         opt4.selectByValue("1");
         driver.switchTo().defaultContent(); 
         driver.switchTo().frame(web);
         
         
      // find ImpactofIncident drop down
         WebElement ImpactofIncident = driver.findElement(By.id("IMPACT_ID"));
         Select opt5 = new Select(ImpactofIncident);
         //List<WebElement> ls = opt.getOptions();
         opt5.selectByValue("1");
         driver.switchTo().defaultContent(); 
         driver.switchTo().frame(web);
         
         // find Sensitive Radio Button
         WebElement radioBtn = driver.findElement(By.id("IS_SENSITIVE"));
         radioBtn.click();
         
                

         // find ActualDate datepicker
         WebElement ActualDate = driver.findElement(By.id("actualDateID"));
         ActualDate.click();
         
         // select a date
         WebElement datepicker = driver.findElement(By.id("ui-datepicker-div"));
         datepicker.click();
         
        // find IncidentDescription text box
         WebElement IncidentDescription = driver.findElement(By.id("INCIDENT_DESCRIPTION"));
         
        // enter IncidentDescription
         IncidentDescription.sendKeys("Testfazal");
         
         // find submit button
         WebElement Submit = driver.findElement(By.id("iSubmit"));
         
         // click on Submit
         
         Submit.click();
         
         
        Thread.sleep(2000);
         
        //find ExistingIncidents
        
        driver.switchTo().defaultContent(); 
        
       // WebElement ExistingIncidents = driver.findElement(By.xpath("//img[@id='4']"));
        
      //  WebElement open = driver.findElement(By.xpath("(//a[contains(text(),'Open')])"));
        
     
     /* 
        //click on open
        WebElement open = driver.findElement(By.xpath("(//a[contains(text(),'Open')])"));

       // Declare Action object
        Actions actions = new Actions(driver);
        
        //mouse hover on a menu item
        actions.moveToElement(ExistingIncidents).perform();
        
        // hold fo 2 sec
       
        
        //click on open
       actions.click().perform();
        
        driver.quit();*/
        
        
        
        Actions actions = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath("//img[@id='4']"));
        
        WebElement subMenu = driver.findElement(By.xpath("//div[@id='demo-bar']/ul[2]/li/ul/li/a[@id='5']"));
        actions.moveToElement(mainMenu).click().build().perform();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", subMenu);
        
        
       // actions.click().build().perform();
       //
       // WebDriverWait wait = new WebDriverWait(driver, 30); //here, wait time is 20 seconds

        //wait.until(ExpectedConditions.visibilityOf(subMenu));
        
        //actions.moveToElement(subMenu);
       // actions.click().build().perform();
        
        //driver.quit();
        
        /*Actions actions = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.linkText("Existing Incidents"));
        actions.moveToElement(mainMenu);

        WebElement subMenu = driver.findElement(By.cssSelector("{#6"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();*/
        
        // driver.findElement(By.xpath("(//a[contains(text(),'Open')])[2]")).click();
        
        
        //click on latest incident
        
        //driver.findElement(By.id("proceedToHome")).click();
        //driver.findElement(By.xpath("(//a[contains(text(),'Open')])[2]")).click(); //for tulu
        
       // WebElement element1=driver.findElement(By.name("listForm"));
        
        
        
        driver.switchTo().frame(web);

        //driver.findElement(By.xpath("//a[contains(text(),'3906')]")).click();  //for hardcoded values
        
        driver.findElement(By.xpath("//*[@id='All Incidents_row1']/td[1]/a")).click(); // for dynamic value (latestone)
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(web);
        driver.findElement(By.xpath("//input[@id='Edit_Incident']")).click();
        //driver.switchTo().defaultContent();
        
        //driver.switchTo().frame(web);
        new Select(driver.findElement(By.xpath("//select[@id='WORKFLOW_ID']"))).selectByVisibleText("Assigned");
        //driver.switchTo().defaultContent();
        
        
        //driver.findElement(By.xpath("Update_Incident")).click();
        
        //driver.findElement(By.xpath(".//*[@id='CUSTOMER_GROUP']")).click();
        
        //new Select(driver.findElement(By.xpath(".//*[@id='CUSTOMER_GROUP']"))).selectByVisibleText("2E2 UK LIMITED");
        
       
        //driver.findElement(By.cssSelector("option[value=\"2E2 UK LIMITED\"]")).click();
        driver.findElement(By.xpath("//select[@id='CUSTOMER_GROUP']/option[2]")).click();
        
        
        // find BCA_INFORMED Radio Button
        WebElement radioBtn1 = driver.findElement(By.id("BCA_INFORMED"));
        radioBtn1.click();
        
        
        driver.findElement(By.xpath("//select[@id='DEPT_ID']/option[2]")).click();
        
        driver.findElement(By.xpath("//select[@id='ASSIGNED_TO']/option[2]")).click();
        
        driver.findElement(By.id("Update_Incident")).click();
        
        
        Thread.sleep(3000);
        
        Alert alert=driver.switchTo().alert();
        
        alert.accept();
         
        driver.switchTo().defaultContent();  
        Thread.sleep(3000);
        driver.findElementByXPath("//img[@alt='Logout']").click(); 
        
        //driver.findElement(By.linkText("Logout")).click();
        
        
     // hold 
     		Thread.sleep(1000);
     		
     		//find for partial link text
     		//driver.findElementByPartialLinkText("")
     		
     		// find user name
             WebElement Uname1 = driver.findElement(By.id("loginId"));
             
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
             WebElement Role3 = driver.findElement(By.id("userRoleId"));
             
             // click on value
             Select opt6 = new Select(Role3);
             //List<WebElement> ls = opt.getOptions();
             opt6.selectByValue("2");
             
             // find continue button
             WebElement continu1 = driver.findElement(By.id("proceedToHome"));
             
             //click on login
             continu1.click();
        

             Thread.sleep(4000);
             
             Actions actions1 = new Actions(driver);
             WebElement mainMenu1 = driver.findElement(By.xpath("//img[@id='4']"));
             
             WebElement subMenu1 = driver.findElement(By.xpath("//div[@id='demo-bar']/ul[2]/li/ul/li/a[@id='5']"));
             actions1.moveToElement(mainMenu1).click().build().perform();
             
             JavascriptExecutor js1 = (JavascriptExecutor)driver;
             js1.executeScript("arguments[0].click();", subMenu1);
             
             /*Actions actions1 = new Actions(driver);
             WebElement mainMenu1 = driver.findElement(By.xpath("//img[@id='4']"));
            
             WebElement subMenu1 = driver.findElement(By.xpath("//div[@id='demo-bar']/ul[2]/li/ul/li/a[@id='5']"));
             actions1.moveToElement(mainMenu1).click().build().perform();
            
             JavascriptExecutor js1 = (JavascriptExecutor)driver;
             js1.executeScript("arguments[0].click();", subMenu1);
            
             WebElement web=driver.findElement(By.id("centerFrame"));
             driver.switchTo().frame(web);
            
             driver.findElement(By.xpath("//a[contains(text(),'3876')]")).click();
             driver.switchTo().defaultContent(); */
             
             WebElement web1 =driver.findElement(By.id("centerFrame"));
             driver.switchTo().frame(web1);
             
             
             driver.findElement(By.xpath("//a[contains(text(),'3906')]")).click();
             driver.switchTo().defaultContent();
        
             driver.switchTo().frame(web1);
             driver.findElement(By.xpath("//input[@id='Edit_Incident']")).click();
             
             new Select(driver.findElement(By.xpath("//select[@id='WORKFLOW_ID']"))).selectByVisibleText("Work In Progress");
             
             driver.findElement(By.id("Update_Incident")).click();
             
             Thread.sleep(3000);
             
             Alert alert1=driver.switchTo().alert();
             
             alert1.accept();
             
             driver.findElement(By.xpath("//input[@id='Edit_Incident']")).click();  
             
             new Select(driver.findElement(By.xpath("//select[@id='WORKFLOW_ID']"))).selectByVisibleText("Completed");
             
             driver.findElement(By.xpath("//select[@id='ROOTCAUSE_ID']/option[2]")).click();
             
             // driver.findElementByXPath("//input [@id='ROOT_CAUSE_ANALYSIS_BUTTON']");
             //driver.findElementsByXPath("//input [@id='ROOT_CAUSE_ANALYSIS_BUTTON']");
             
             driver.findElement(By.xpath("//input [@id='ROOT_CAUSE_ANALYSIS_BUTTON']")).click();
             
             
             
             //-----------------------------------------------------------------------------------------//
             
             
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
     		
     		driver.switchTo().frame(web1);
     		 
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
     		
     		driver.switchTo().frame(web1);
     		
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
     				driver.switchTo().frame(web1);
     			}
     		}
 		
     		driver.findElement(By.id("Update_Incident")).click();
     		
     		Thread.sleep(3000);
     		
            Alert alert2=driver.switchTo().alert();
             
            alert2.accept();
            
             
            driver.switchTo().defaultContent();
            
            
	        driver.findElement(By.xpath("//img[@alt='Logout']")).click();
	        
	        // find user name
	        WebElement Uname4 = driver.findElement(By.id("loginId"));
	        
	        // insert user name
	        Uname4.sendKeys("dvinod");
	        
	        // find user name
	        WebElement password3 = driver.findElement(By.id("password"));
	        
	        // insert password
	        password3.sendKeys("test");
	       
	        // find login button
	        WebElement login2 = driver.findElement(By.id("authenticate"));
	        
	        //click on login
	        login2.click();
	        
	        // find role drop down
	        WebElement Role4 = driver.findElement(By.id("userRoleId"));
	        
	        // click on value
	        Select opt7 = new Select(Role4);
	        //List<WebElement> ls = opt.getOptions();
	        opt7.selectByValue("3");
	        
	        // find continue button
	        WebElement continu6 = driver.findElement(By.id("proceedToHome"));
	        
	        //click on login
	        continu6.click();
	        
	        // hold 
	        Thread.sleep(4000);
	        
	        driver.switchTo().defaultContent(); //for 3898
	        //driver.switchTo().frame(web);
             
	        //---------------------------------------------------------------

	        Actions actions3 = new Actions(driver);
            WebElement mainMenu3 = driver.findElement(By.xpath("//img[@id='4']"));
            
            WebElement subMenu3 = driver.findElement(By.xpath("//div[@id='demo-bar']/ul[2]/li/ul/li/a[@id='5']"));
            actions3.moveToElement(mainMenu3).click().build().perform();
            
            JavascriptExecutor js3 = (JavascriptExecutor)driver;
            js3.executeScript("arguments[0].click();", subMenu3);
            
            
            WebElement web2=driver.findElement(By.id("centerFrame"));
            driver.switchTo().frame(web2);
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[contains(text(),'3906')]")).click();
            driver.switchTo().defaultContent();
            
            driver.switchTo().frame(web2);
            driver.findElement(By.xpath("//input[@id='Edit_Incident']")).click();
            
            new Select(driver.findElement(By.xpath("//select[@id='WORKFLOW_ID']"))).selectByVisibleText("Preventive Action In Place");
            
            driver.findElement(By.id("Update_Incident")).click();
            Thread.sleep(2000);
            
            Alert alert3=driver.switchTo().alert();
            
            alert3.accept();
            
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//input[@id='Edit_Incident']")).click();  
            
            new Select(driver.findElement(By.xpath("//select[@id='WORKFLOW_ID']"))).selectByVisibleText("Prevented");
            
            driver.findElement(By.id("Update_Incident")).click();
            Thread.sleep(2000);
            
            Alert alert4 = driver.switchTo().alert();
            
            alert4.accept();
            
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//input[@id='Edit_Incident']")).click();  
            
            new Select(driver.findElement(By.xpath("//select[@id='WORKFLOW_ID']"))).selectByVisibleText("Closed");
            
            driver.findElement(By.id("Update_Incident")).click();
            Thread.sleep(2000);
            
            Alert alert5=driver.switchTo().alert();
            
            alert5.accept();
            
            Thread.sleep(6000);
            
            driver.close();
        
        
		
	}

	
}
