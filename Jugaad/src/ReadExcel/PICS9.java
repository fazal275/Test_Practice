package ReadExcel;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import   org.testng.*;
import org.testng.annotations.Test;

import com.google.common.base.Verify;
import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;
;public class PICS9 {
	               
	@Test
	
	public String WriteExclData(String s0,String s1,String s2, String s3) throws Exception
	{
	                        
     //Open in Firefox
     //FirefoxDriver driver = new FirefoxDriver();
     
     //Open in Chrome
     System.setProperty("webdriver.chrome.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
      
  	  /*
      DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
      caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
      caps.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
      caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
      caps.setCapability("ignoreProtectedModeSettings", true);
      
      //Open in IE
      System.setProperty("webdriver.ie.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\IEDriverServer.exe");
      WebDriver driver = new InternetExplorerDriver(); 
      */
  	   
      //Maximize window
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //launch PICS test URL
      driver.get("http://10.75.162.162:93/Test_OTP_Upgrd/");
     
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
      
     
      Assert.assertEquals("Login",driver.findElement(By.cssSelector("body>div.container-fluid>div.row.page-title>h3")).getText()," ==>>   1.  Login Page Loaded :  FAIL...") ;
      //org.testng.Assert.assertTrue(!driver.findElement(By.cssSelector("#UserName")), message);
      //System.out.println(driver.findElement(By.cssSelector("body>div.container-fluid>div.row.page-title>h3")).getText()+ "     1. Login Page Loaded :  PASS");
      
      //org.testng.Assert.assertEquals("Login",driver.findElement(By.cssSelector("body>div.container-fluid>div.row.page-title>h3")).getText(),"Passed..");
      //Assert.assertEquals("Login",driver.findElement(By.cssSelector("body>div.container-fluid>div.row.page-title>h3")).getText(),"PASS...") ;
      //Assert.assertEquals("Login1",driver.findElement(By.cssSelector("body>div.container-fluid>div.row.page-title>h3")).getText(),"FAIL...") ;
     
      //find Nominator Name and insert NominatorID
      WebElement Nominatorname = driver.findElement(By.cssSelector("#UserName"));
      Nominatorname.clear();
      Nominatorname.sendKeys(s0);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //click on login
      driver.findElement(By.cssSelector(".btn.btn-primary")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Assert.assertEquals("Welcome,", driver.findElement(By.cssSelector(".col-md-8.welcome>h5>em")).getText()," ==>>   2.  Home Page Loaded :  FAIL...");
      
      //click on Create Request
      driver.findElement(By.cssSelector("#menu>li:nth-child(2)>a")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Assert.assertEquals("Create Requests1", driver.findElement(By.cssSelector(".active>a")).getText(), " ==>>   3.  Create Requests Displayed :  FAIL...");
      
      //click on Forex Recovery
      driver.findElement(By.linkText(s1)).click();
      //driver.findElement(By.cssSelector(".list-group>a:nth-child(4)>span.title-text")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //Insert Emp ID
      WebElement Uname = driver.findElement(By.cssSelector("#EmpID"));
      Uname.clear();
      Uname.sendKeys(s2);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //Insert Emp name
      driver.findElement(By.cssSelector("#Emp_Name")).click();
      Thread.sleep(3000);
      
      //Insert amount to be deducted
      driver.findElement(By.cssSelector("#Recovery_Amount")).sendKeys("500");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //Insert recovery reason
      driver.findElement(By.cssSelector("#Recovery_Reason")).sendKeys("Test");
      
      //Click on Submit
      driver.findElement(By.cssSelector("#btnSubmitToggle")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //capture request ID
      WebElement success = driver.findElement(By.cssSelector("#myModalSuccess>div>div>div.modal-body>div>div>div>p"));
      String successmsg = success.getText();
      System.out.println(successmsg);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //click on okay
      driver.findElement(By.cssSelector("#myModalSuccess>div>div>div.modal-footer>button")).click();
     
      String RequestID = successmsg.replaceAll("[^0-9]", "");
      
      System.out.println(RequestID);
      Thread.sleep(2000);
      
      // LogOut
      driver.findElement(By.cssSelector("#navbar-brand-centered>ul:nth-child(2)>li>form>.btn.btn-default")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      
      //find Approver Name and Insert ApproverID
      driver.findElement(By.cssSelector("#UserName")).sendKeys(s3);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //click on login button
      driver.findElement(By.cssSelector(".btn.btn-primary")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
     //find and click on Search requests
      driver.findElement(By.cssSelector("#menu>li:nth-child(3)>a")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //find and enter request id
      driver.findElement(By.cssSelector("#txtRequestID")).sendKeys(RequestID);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
      // Select Request Type
      WebElement Request_Type = driver.findElement(By.cssSelector("#ddlRequestType>option[value='77']"));
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Request_Type.click();
      
      //click on submit
      driver.findElement(By.cssSelector("#btnSubmit")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
     //click on Request ID
      
      driver.findElement(By.cssSelector("#mytable>tbody>tr>td:nth-child(1)>a")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //find approve Button and click on it
      driver.findElement(By.cssSelector("#btnApprove")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //find approver comments and insert comments then click
      driver.findElement(By.cssSelector("#txtApproveComments")).sendKeys("Approved");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //click on submit
      driver.findElement(By.cssSelector("#myModalApprove>div>div>div:nth-child(3)>button.btn.btn-info")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //click on Okay
      driver.findElement(By.cssSelector("#myModalSuccess>div>div>div.modal-footer>a")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //click on Search Request
      driver.findElement(By.cssSelector("#menu>li:nth-child(3)>a")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //insert Request ID
      driver.findElement(By.cssSelector("#txtRequestID")).sendKeys(RequestID);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //click on Submit
      driver.findElement(By.cssSelector("#btnSubmit")).click();
      
      //verify status
      WebElement Verify = driver.findElement(By.cssSelector("#mytable>tbody>tr>td:nth-child(7)"));
      String Verifytxt = Verify.getText();
      
      System.out.println("Status  =>   " + Verifytxt);
      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      // LogOut
      driver.findElement(By.cssSelector("#navbar-brand-centered>ul:nth-child(2)>li>form>.btn.btn-default")).click();
      
      Thread.sleep(2000);
      driver.close();
      
      return RequestID;
	}
	
	
	private boolean isElementPresent(By linkText) {
		// TODO Auto-generated method stub
		return false;
	}


	//  private static  ReadExcelData data;
       public static void main(String[] args) throws Exception {
    	  ReadExcelData data;
    	  PICS9 p9 = new PICS9();
    	
    	 
    	  data=new ReadExcelData();   
    	   
      	  List<String> s2= data.ReadExcel();
      	  
      	  
      	File source = new File("D:\\Dektop backup 23 march 2016\\Selenium\\Excel_Data\\test_Excel.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
	    wb.getSheetAt(0);
	    XSSFSheet sheet1 = wb.getSheetAt(0);
      	  
      	  
      	  for(int k =0, counter =1;k<s2.size();counter++)
      	  {
      		  String RequestID = p9.WriteExclData(s2.get(k),s2.get(k+1),s2.get(k+2),s2.get(k+3));
      		  
      	 
    	   sheet1.getRow(counter).createCell(4).setCellValue(RequestID);
    	   
    	   FileOutputStream fout = new FileOutputStream(source);
    	   
    	   
    	   wb.write(fout);
      		  
      		  
      		  k= k+4;
      	  }
    
}
       
}