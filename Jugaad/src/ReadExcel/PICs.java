package ReadExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PICs {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//Open in Firefox
        //FirefoxDriver driver = new FirefoxDriver();
        
        
        //Open in Chrome
        //System.setProperty("webdriver.chrome.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		
		//DesiredCapabilities caps = DesiredCapabilities.edge();
        caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
        caps.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        caps.setCapability("nativeEvents",false);
        caps.setCapability("ignoreProtectedModeSettings", true);
        
        caps.setBrowserName("Internet Explorer");
        caps.setCapability(CapabilityType.VERSION,"11.0.9600.17843IS");
        caps.setPlatform(Platform.WINDOWS);
        
        //DesiredCapabilities capabilities = DesiredCapabilities.edge();
        
        
      //Open in IE
      //System.setProperty("webdriver.ie.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\IE2531\\IEDriverServer.exe");
      System.setProperty("webdriver.ie.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\IEDriverServer.exe");
      //System.setProperty("webdriver.ie.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\IE23900\\IEDriverServer.exe");
      //System.setProperty("webdriver.edge.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\IEDriverServer.exe");
                                                                                                
        WebDriver driver = new InternetExplorerDriver(caps);
        
        //WebDriver driver = new EdgeDriver(caps);
         
        Thread.sleep(3000);
        
        //Maximize window
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //launch TimeCard test URL
        //driver.get("http://www.google.com");
        driver.get("http://10.75.162.162:93/Test_OTP_Upgrd/");
        Thread.sleep(6000);
        
        //Find User ID
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //find user name and insert userID
     driver.findElement(By.cssSelector("#UserName")).sendKeys("076017");
     //driver.findElement(By.cssSelector(".form-control")).sendKeys("076017");
     
        //driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("076017");
       // driver.findElement(By.id("UserName")).sendKeys("076017");
        //WebElement Uname = driver.findElement(By.cssSelector("#UserName"));
        //Uname.sendKeys("076017");
        Thread.sleep(3000);
        //click on login
        //driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        driver.findElement(By.cssSelector("input[type='submit'][value='Log in']")).click();
        
        Thread.sleep(8000);
        
        //click on Create Request
        WebElement Create_Request = driver.findElement(By.cssSelector("#menu>li:nth-child(2)>a"));
        Thread.sleep(9000);
    	Create_Request.click();
        Thread.sleep(4000);
        
        //click on Forex Recovery
        driver.findElement(By.cssSelector(".list-group>a:nth-child(4)>span.title-text")).click();
        
        Thread.sleep(3000);
        
        //insert Emp ID
        driver.findElement(By.cssSelector("#EmpID")).sendKeys("061636");
        Thread.sleep(2000);
        
        //insert emp name
        driver.findElement(By.cssSelector("#Emp_Name")).click();
        Thread.sleep(3000);
        
        //insert amount to be deducted
        driver.findElement(By.cssSelector("#Recovery_Amount")).sendKeys("500");
        
        //insert recovery reason
        driver.findElement(By.cssSelector("#Recovery_Reason")).sendKeys("Test");
        
        //click on Submit
        driver.findElement(By.cssSelector("#btnSubmitToggle")).click();
        
        Thread.sleep(3000);
        
        //capture request ID
        WebElement success = driver.findElement(By.cssSelector("#myModalSuccess>div>div>div.modal-body>div>div>div>p"));
        String successmsg = success.getText();
        System.out.println(successmsg);
       
        Thread.sleep(3000);
        
        //click on okay
        driver.findElement(By.cssSelector("#myModalSuccess>div>div>div.modal-footer>button")).click();
       
       
        String RequestID = successmsg.replaceAll("[^0-9]", "");
        
        System.out.println(RequestID);
        
        
        Thread.sleep(2000);
        // LogOut
        driver.findElement(By.cssSelector("#navbar-brand-centered>ul:nth-child(2)>li>form>.btn.btn-default")).click();
        
        
         Thread.sleep(3000);
        
        //Find User ID
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //find user name and insert userID
        driver.findElement(By.cssSelector("#UserName")).sendKeys("akeshri");
        
        Thread.sleep(3000);
        //click on login
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        
        Thread.sleep(6000);
        //find and click on Approve requests
        driver.findElement(By.cssSelector("#menu>li:nth-child(2)>a")).click();
        
        //Find and click on Forex Request
        driver.findElement(By.cssSelector(".list-group>a:nth-child(3)")).click();
        
        
        //find search and insert Request ID 
        driver.findElement(By.cssSelector("#txtSearch")).sendKeys(RequestID);
        
        Thread.sleep(2000);
        
        
        //find search and click on it
        driver.findElement(By.cssSelector("#btnHeaderSearch")).click();
        
        Thread.sleep(2000);
        
        //find Request ID and click on it
        driver.findElement(By.cssSelector("#mytable>tbody>tr>td:nth-child(1)>a")).click();
        
        
        Thread.sleep(3000);
        
        //find approve Button and click on it
        driver.findElement(By.cssSelector("#btnApprove")).click();
        
        
        Thread.sleep(2000);
        
        //find approver comments and insert comments then click
        driver.findElement(By.cssSelector("#txtApproveComments")).sendKeys("Approved");
        Thread.sleep(2000);
        
        //click on submit
        driver.findElement(By.cssSelector("#myModalApprove>div>div>div:nth-child(3)>button.btn.btn-info")).click();
        
        
        Thread.sleep(2000);
        
        //click on Okay
        driver.findElement(By.cssSelector("#myModalSuccess>div>div>div.modal-footer>a")).click();
        
        
        Thread.sleep(2000);
        
        //click on Search Request
        driver.findElement(By.cssSelector("#menu>li:nth-child(3)>a")).click();
        
        Thread.sleep(2000);
        //insert Request ID
        driver.findElement(By.cssSelector("#txtRequestID")).sendKeys(RequestID);
        
        Thread.sleep(2000);
        //click on Submit
        driver.findElement(By.cssSelector("#btnSubmit")).click();
        
        
        Thread.sleep(5000);
        //verify status
        WebElement Verify = driver.findElement(By.cssSelector("#mytable>tbody>tr>td:nth-child(7)"));
        String Verifytxt = Verify.getText();
        
        System.out.println("Status  =>   " + Verifytxt);
        
        

        Thread.sleep(10000);
        // LogOut
        driver.findElement(By.cssSelector("#navbar-brand-centered>ul:nth-child(2)>li>form>.btn.btn-default")).click();
        
        
        Thread.sleep(15000);
        driver.close();
        
         
	}

}
