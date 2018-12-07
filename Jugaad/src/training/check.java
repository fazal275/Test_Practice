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

public class check {

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
         
	}
}