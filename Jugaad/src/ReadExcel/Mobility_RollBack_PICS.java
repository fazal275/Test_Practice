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


public class Mobility_RollBack_PICS {
	
	public String WriteExclData(String s0,String s1,String s2, String s3, String s4 , String s5) throws Exception
	{
		
	/*
	public String WriteExclData() throws Exception
	{
		
		data=new Mob_Rol_RED();   
 	   
  	  List<String> s2= data.ReadExcel();
  	  for(int i=0;i<5;i++)
  	  System.out.println("my excel data...."+s2.get(i));
     */
                              
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
      Thread.sleep(3000);
      //launch TimeCard test URL
      //driver.get("http://www.google.com");
      driver.get("http://10.75.162.162:93/Test_OTP_Upgrd/");
      Thread.sleep(3000);
      
      //Find User ID
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //find user name and insert userID
      //driver.findElement(By.cssSelector("#UserName")).sendKeys("076017");
      //driver.findElement(By.cssSelector("#UserName")).sendKeys("076017");
      
    WebElement Nomname = driver.findElement(By.cssSelector("#UserName"));
    Nomname.clear();
    Nomname.sendKeys(s0);
      
      
      Thread.sleep(3000);
      //click on login
      driver.findElement(By.cssSelector(".btn.btn-primary")).click();
      
      Thread.sleep(6000);
      
      //click on Create Request
      driver.findElement(By.cssSelector("#menu>li:nth-child(2)>a")).click();
      Thread.sleep(4000);
      
      //click on Mobility RollBack
      driver.findElement(By.linkText(s1)).click();
      //driver.findElement(By.cssSelector(".list-group>a:nth-child(4)>span.title-text")).click();
      
      Thread.sleep(3000);
      
      //insert Emp ID
      WebElement Uname = driver.findElement(By.cssSelector("#EmpID"));
      Uname.clear();
      Uname.sendKeys(s2);

      Thread.sleep(2000);
      
      //insert emp name
      driver.findElement(By.cssSelector("#Emp_Name")).click();
      Thread.sleep(5000);
      
      //Select nature of payment
      driver.findElement(By.cssSelector("#Payment_Deduction:nth-child(1)[value=D]")).click();
      
      
    //insert LOA number
      driver.findElement(By.cssSelector("#LOA_No_Ext[class=form-control]")).sendKeys(s3);
      
     
      //click on Submit
      driver.findElement(By.cssSelector(".btn.btn-info.col-xs-12")).click();
      
      
      Thread.sleep(4000);
      
      //Select Request ID
      driver.findElement(By.cssSelector("#optionPayment_0")).click();
      Thread.sleep(2000);
      
      //insert Amount to be considered
      driver.findElement(By.cssSelector("#txtRollback_Amount")).sendKeys("10");
      
      //insert comments
      driver.findElement(By.cssSelector("#MobilityRollbackForm_Remarks")).sendKeys("Test");
      
      //click on Submit
      driver.findElement(By.cssSelector("#btnSubmit")).click();
      
      Thread.sleep(5000);
     
      
      //capture request ID
      WebElement success = driver.findElement(By.cssSelector("#myModalSuccess>div>div>div.modal-body>div>div>div>p"));
      String successmsg = success.getText();
      System.out.println(successmsg);
     
      Thread.sleep(3000);
      
      //click on okay
      driver.findElement(By.cssSelector("#myModalSuccess>div>div>div.modal-footer>a")).click();
     
     
      String RequestID = successmsg.replaceAll("[^0-9]", "");
      
      System.out.println(RequestID);
      
      
      Thread.sleep(2000);
      // LogOut
      driver.findElement(By.cssSelector("#navbar-brand-centered>ul:nth-child(2)>li>form>.btn.btn-default")).click();
      
      
       Thread.sleep(3000);
       
       
    //   From here  *************************************
       
      
      //Find User ID
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //find user name and insert Approver 1
      driver.findElement(By.cssSelector("#UserName")).sendKeys(s4);
      
      Thread.sleep(3000);
      //click on login button
      driver.findElement(By.cssSelector(".btn.btn-primary")).click();
      Thread.sleep(6000);
      
      //find and click on Search requests
      driver.findElement(By.cssSelector("#menu>li:nth-child(3)>a")).click();
      Thread.sleep(2000);
      
    //find and enter request id
      driver.findElement(By.cssSelector("#txtRequestID")).sendKeys(RequestID);
      Thread.sleep(2000);
      
      
      // Select Request Type
      WebElement Request_Type = driver.findElement(By.cssSelector("#ddlRequestType>option[value='76']"));
      Thread.sleep(2000);
      Request_Type.click();
      
      //click on submit
      driver.findElement(By.cssSelector("#btnSubmit")).click();
      Thread.sleep(2000);
      
      //click on Request ID
      
      driver.findElement(By.cssSelector("#mytable>tbody>tr>td:nth-child(1)>a")).click();
      Thread.sleep(2000);
      
      //click on Approve
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
      
      Thread.sleep(3000);
      
      // LogOut
      driver.findElement(By.cssSelector("#navbar-brand-centered>ul:nth-child(2)>li>form>.btn.btn-default")).click();
      
      //Find User ID
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //find user name and insert Approver 2
      driver.findElement(By.cssSelector("#UserName")).sendKeys(s5);
      
      Thread.sleep(3000);
      //click on login
      driver.findElement(By.cssSelector(".btn.btn-primary")).click();
      Thread.sleep(6000);
      
      //find and click on Search requests
      driver.findElement(By.cssSelector("#menu>li:nth-child(5)>a")).click();
      Thread.sleep(2000);
      
    //find and enter request id
      driver.findElement(By.cssSelector("#txtRequestID")).sendKeys(RequestID);
      Thread.sleep(2000);
      
      
      // Select Request Type
      WebElement Request_Type1 = driver.findElement(By.cssSelector("#ddlRequestType>option[value='76']"));
      Thread.sleep(2000);
      Request_Type1.click();
      
    //click on submit
      driver.findElement(By.cssSelector("#btnSubmit")).click();
      Thread.sleep(2000);
      
    //click on Request ID
      
      driver.findElement(By.cssSelector("#mytable>tbody>tr>td:nth-child(1)>a")).click();
      Thread.sleep(2000);
      
       //click on Approve
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
      
      Thread.sleep(3000);
      
      
      //find and click on Search requests
      driver.findElement(By.cssSelector("#menu>li:nth-child(5)>a")).click();
      Thread.sleep(2000);
      
    //find and enter request id
      driver.findElement(By.cssSelector("#txtRequestID")).sendKeys(RequestID);
      Thread.sleep(2000);
      
      
      // Select Request Type
      WebElement Request_Type2 = driver.findElement(By.cssSelector("#ddlRequestType>option[value='76']"));
      Thread.sleep(2000);
      Request_Type2.click();
      
    //click on submit
      driver.findElement(By.cssSelector("#btnSubmit")).click();
      Thread.sleep(2000);
      
      
    //verify status
      WebElement Verify = driver.findElement(By.cssSelector("#mytable>tbody>tr>td:nth-child(7)"));
      String Verifytxt = Verify.getText();
      
      System.out.println("Status  =>   " + Verifytxt);
      
      

      Thread.sleep(5000);
      // LogOut
      driver.findElement(By.cssSelector("#navbar-brand-centered>ul:nth-child(2)>li>form>.btn.btn-default")).click();
      
      
      
      
      
      
      
      
      
      //Thread.sleep(10000);
      //driver.close();
      
       
		
		return RequestID;
	}
	
	/*
	 //private static  ReadExcelData data;
	private static Mob_Rol_RED data;
       public static void main(String[] args) throws Exception {
    	   
    	   Mobility_RollBack_PICS MRP = new Mobility_RollBack_PICS();
    	  String s =  MRP.WriteExclData();
    	   */
    	  
    	  
    	  
    	  public static void main(String[] args) throws Exception {
        	  //ReadExcelData data;
        	  Mob_Rol_RED data;
        	  //PICS9 p9 = new PICS9();
        	  Mobility_RollBack_PICS MRP = new Mobility_RollBack_PICS();
        	   
        	  
        	  
        	  //data=new ReadExcelData();   
        	   data = new Mob_Rol_RED();
          	  List<String> s2= data.ReadExcel();
          	  
          	  
          	File source = new File("D:\\Dektop backup 23 march 2016\\Selenium\\Excel_Data\\test_Excel.xlsx");
    		
    		FileInputStream fis = new FileInputStream(source);
    		
    		XSSFWorkbook wb = new XSSFWorkbook(fis);
    		
    	   wb.getSheetAt(1);
    	   XSSFSheet sheet1 = wb.getSheetAt(1);
          	  
          	  
          	  for(int k =0, counter =1;k<s2.size();counter++)
          	  {
          		  String RequestID = MRP.WriteExclData(s2.get(k),s2.get(k+1),s2.get(k+2),s2.get(k+3),s2.get(k+4),s2.get(k+5));
          		  
          		  
          		
        	  
        	   
        	   sheet1.getRow(counter).createCell(6).setCellValue(RequestID);
        	   
        	   FileOutputStream fout = new FileOutputStream(source);
        	   
        	   
        	   wb.write(fout);
          		  
          		  
          		  k= k+6;
          	  }
          	  
    	  
    	  
    	  
    	  
    	  
    	   
    /*    commented @ 5:38 	 
    	   data=new ReadExcelData();   
    	   
    	  List<String> s2= data.ReadExcel();
    	  for(int i=0;i<4;i++)
    	  System.out.println("my excel data...."+s2.get(i));
       
                                
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
        
        
    	   
        //Maximize window
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //launch TimeCard test URL
        //driver.get("http://www.google.com");
        driver.get("http://10.75.162.162:93/Test_OTP_Upgrd/");
        Thread.sleep(3000);
        
        //Find User ID
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //find user name and insert userID
        //driver.findElement(By.cssSelector("#UserName")).sendKeys("076017");
        //driver.findElement(By.cssSelector("#UserName")).sendKeys("076017");
        
      WebElement Nomname = driver.findElement(By.cssSelector("#UserName"));
      Nomname.clear();
      Nomname.sendKeys(s2.get(0));
        
        
        Thread.sleep(3000);
        //click on login
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        
        Thread.sleep(6000);
        
        //click on Create Request
        driver.findElement(By.cssSelector("#menu>li:nth-child(2)>a")).click();
        Thread.sleep(4000);
        
        //click on Forex Recovery
        driver.findElement(By.cssSelector(".list-group>a:nth-child(4)>span.title-text")).click();
        
        Thread.sleep(3000);
        
        //insert Emp ID
        WebElement Uname = driver.findElement(By.cssSelector("#EmpID"));
        Uname.clear();
        Uname.sendKeys(s2.get(2));
  
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
        driver.findElement(By.cssSelector("#UserName")).sendKeys(s2.get(3));
        
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
        
        //verify status
        WebElement Verify = driver.findElement(By.cssSelector("#mytable>tbody>tr>td:nth-child(7)"));
        String Verifytxt = Verify.getText();
        
        System.out.println("Status  =>   " + Verifytxt);
        
        

        Thread.sleep(2000);
        // LogOut
        driver.findElement(By.cssSelector("#navbar-brand-centered>ul:nth-child(2)>li>form>.btn.btn-default")).click();
        
        
        Thread.sleep(10000);
        driver.close();
        
        
             }*/
      // End @ 5:38

}

}
