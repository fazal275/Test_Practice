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


public class lap_Recov_Pics {
	
	public String WriteExclData(String s0,String s1,String s2, String s3, String s4 , String s5) throws Exception
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
	      
	      //find Nominator Name and insert NominatorID
	      WebElement Nominatorname = driver.findElement(By.cssSelector("#UserName"));
	      Nominatorname.clear();
	      Nominatorname.sendKeys(s0);
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      
	      //click on login
	      driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //click on Create Request
	      driver.findElement(By.cssSelector("#menu>li:nth-child(2)>a")).click();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //click on Laptop Recovery link
	      driver.findElement(By.linkText(s1)).click();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //insert Emp ID
	      WebElement Uname = driver.findElement(By.cssSelector("#EmpID"));
	      Uname.clear();
	      Uname.sendKeys(s2);
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //insert emp name
	      driver.findElement(By.cssSelector("#Emp_Name")).click();
	      Thread.sleep(3000);
	      
	      //Insert Project Code
	      driver.findElement(By.cssSelector("#txtProject_ID")).sendKeys("100264030");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      
	      //select Task
	      driver.findElement(By.cssSelector("#IsBillable[value=False]")).click();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      
	      // insert Recovery Amount
	      driver.findElement(By.cssSelector("#Amount[type=text]")).sendKeys("500");
	      
	      //insert Reason for Recovery
	      driver.findElement(By.cssSelector("#Allowance_Comments")).sendKeys("Test");
	      
	      //click on Submit
	      driver.findElement(By.cssSelector("#btnSubmitToggle")).click();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //capture request ID
	      WebElement success = driver.findElement(By.cssSelector("#myModalSuccess>div>div>div.modal-body>div>div>div>p"));
	      String successmsg = success.getText();
	      System.out.println(successmsg);
	      
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //click on okay
	      driver.findElement(By.cssSelector("#myModalSuccess>div>div>div.modal-footer>a")).click();
	                                         
	      String RequestID = successmsg.replaceAll("[^0-9]", "");
	      
	      System.out.println(RequestID);
	      
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      // LogOut
	      driver.findElement(By.cssSelector("#navbar-brand-centered>ul:nth-child(2)>li>form>.btn.btn-default")).click();
	      Thread.sleep(2000);
	      
	       
	       //Find User ID
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //find user name and insert Approver 1
	       driver.findElement(By.cssSelector("#UserName")).sendKeys(s3);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //click on login button
	       driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //find and click on Search requests
	       driver.findElement(By.cssSelector("#menu>li:nth-child(5)>a")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //find and enter request id
	       driver.findElement(By.cssSelector("#txtRequestID")).sendKeys(RequestID);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       
	       // Select Request Type
	       WebElement Request_Type = driver.findElement(By.cssSelector("#ddlRequestType>option[value='22']"));
	       Thread.sleep(1000);
	       Request_Type.click();
	       
	       //click on submit
	       driver.findElement(By.cssSelector("#btnSubmit")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //click on Request ID
	       driver.findElement(By.cssSelector("#mytable>tbody>tr>td:nth-child(1)>a")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //click on Approve
	       driver.findElement(By.cssSelector(".btn.btn-info.col-xs-12")).click();
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
	       
	       // LogOut
	       driver.findElement(By.cssSelector("#navbar-brand-centered>ul:nth-child(2)>li>form>.btn.btn-default")).click();
	       
	      
	       
	       
	       //Find User ID
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //find user name and insert Approver 2
	       driver.findElement(By.cssSelector("#UserName")).sendKeys(s4);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //click on login
	       driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //find and click on Search requests
	       driver.findElement(By.cssSelector("#menu>li:nth-child(3)>a")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //find and enter request id
	       driver.findElement(By.cssSelector("#txtRequestID")).sendKeys(RequestID);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       
	       // Select Request Type
	       WebElement Request_Type1 = driver.findElement(By.cssSelector("#ddlRequestType>option[value='22']"));
	       Thread.sleep(1000);
	       Request_Type1.click();
	       
	     //click on submit
	       driver.findElement(By.cssSelector("#btnSubmit")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	     //click on Request ID
	       
	       driver.findElement(By.cssSelector("#mytable>tbody>tr>td:nth-child(1)>a")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        //click on Approve
	       driver.findElement(By.cssSelector(".btn.btn-info.col-xs-12")).click();
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
	          
	       // LogOut
	       driver.findElement(By.cssSelector("#navbar-brand-centered>ul:nth-child(2)>li>form>.btn.btn-default")).click();
	       
	       
	       
	       
	       //Find User ID
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //find user name and insert Approver 3
	       driver.findElement(By.cssSelector("#UserName")).sendKeys(s5);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //click on login
	       driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //find and click on Search requests
	       driver.findElement(By.cssSelector("#menu>li:nth-child(3)>a")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //find and enter request id
	       driver.findElement(By.cssSelector("#txtRequestID")).sendKeys(RequestID);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       
	       //Select Request Type
	       WebElement Request_Type2 = driver.findElement(By.cssSelector("#ddlRequestType>option[value='22']"));
	       Thread.sleep(1000);
	       Request_Type2.click();
	       
	       //click on submit
	       driver.findElement(By.cssSelector("#btnSubmit")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //click on Request ID
	       driver.findElement(By.cssSelector("#mytable>tbody>tr>td:nth-child(1)>a")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        //click on Approve
	       driver.findElement(By.cssSelector(".btn.btn-info.col-xs-12")).click();
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
	       
	      
	       //find and click on Search requests
	       driver.findElement(By.cssSelector("#menu>li:nth-child(3)>a")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       //find and enter request id
	       driver.findElement(By.cssSelector("#txtRequestID")).sendKeys(RequestID);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       
	       // Select Request Type
	       WebElement Request_Type3 = driver.findElement(By.cssSelector("#ddlRequestType>option[value='22']"));
	       Thread.sleep(1000);
	       Request_Type3.click();
	       
	       //click on submit
	       driver.findElement(By.cssSelector("#btnSubmit")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       
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
		
		
		   //private static  ReadExcelData data;
	       public static void main(String[] args) throws Exception {
	    	  
	    	 Lap_Recov_RED data;
	    	 lap_Recov_Pics LAPRECOV = new lap_Recov_Pics();
	    	
	    	 data= new Lap_Recov_RED();   
	    	   
	      	 List<String> s2= data.ReadExcel();
	      	  
	      	  
	      	File source = new File("D:\\Dektop backup 23 march 2016\\Selenium\\Excel_Data\\test_Excel.xlsx");
			
			FileInputStream fis = new FileInputStream(source);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
		   wb.getSheetAt(3);
		   XSSFSheet sheet1 = wb.getSheetAt(3);
	      	  
	      	  
	      	  for(int k =0, counter =1;k<s2.size();counter++)
	      	  {
	      	   String RequestID = LAPRECOV.WriteExclData(s2.get(k),s2.get(k+1),s2.get(k+2),s2.get(k+3),s2.get(k+4),s2.get(k+5));
	      	  
	      		
	    	   
	    	   sheet1.getRow(counter).createCell(6).setCellValue(RequestID);
	    	   
	    	   FileOutputStream fout = new FileOutputStream(source);
	    	   
	    	   
	    	   wb.write(fout);
	      		  
	      		  
	      		  k= k+6;
	      	  }
	
	       }
}



