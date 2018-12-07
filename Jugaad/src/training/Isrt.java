package training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Isrt {

	public static void main(String[] args) throws InterruptedException {
		       //open browser
				//FirefoxDriver driver = new FirefoxDriver ();
				
				//open Chrome browser
			    System.setProperty("webdriver.chrome.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				// maximize
				driver.manage().window().maximize();
				
				// launch URL
				//driver.get("http://10.51.14.184:8420/isrt/LOGIN_Page.htm");
				//driver.get("http://10.51.104.24:8282/isrt/LOGIN_Page.htm");
				//driver.get("http://10.51.14.184:8420/isrt/LOGIN_Page.htm");
				//driver.get("http://10.51.104.24:8282/isrt/LOGIN_Page.htm");
				driver.get("http://10.51.14.184:8420/isrt/LOGIN_Page.htm");
				// hold 
				Thread.sleep(2000);
				
				//find for partial link text
				//driver.findElementByPartialLinkText("")
				
				// find user name
		        WebElement Uname = driver.findElement(By.xpath("//*[@id='loginId']"));
		        
		        // insert user name
                Uname.sendKeys("702173");  
                
                // find user name
                WebElement password = driver.findElement(By.id("password"));
                
                // insert password
                password.sendKeys("test");
               
                // find login button
               driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
                
                //click on login
                //login.click();
		       
               
               
               //open new request page
               driver.findElement(By.xpath("//*[@id='creationPage']/a")).click();
               
               driver.findElement(By.xpath("//*[@id='nol1Radio']")).click();
               
               WebElement projectID = driver.findElement(By.xpath("//*[@id='projectID']"));
              new Select(projectID).selectByValue("IN_1699");
              
              
              // option.selectByValue("IN_1699");
               
               WebElement moduleID = driver.findElement(By.xpath("//select[@id='moduleID']")); 
               //WebElement moduleID = driver.findElement(By.id("moduleID"));
               Select option1 = new Select(moduleID);
               option1.selectByValue("9");
              
               driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Test Fazal; Please Do not touch");
               
               driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Test Fazal; Please Do not touch");
               
               driver.findElement(By.xpath("//select[@id='natureofRequirment']/option[2]")).click();
               
               driver.findElement(By.xpath("//select[@id='requirementCategory']/option[4]")).click();
               
               driver.findElement(By.xpath("//input[@id='wiz1']")).click();
               
               driver.findElement(By.xpath("//textarea [@id='benefitsGain']")).sendKeys("Test Fazal; Please Do not touch");
               
               driver.findElement(By.xpath("//textarea [@id='currentProcess']")).sendKeys("Test Fazal; Please Do not touch");
               
               driver.findElement(By.xpath("//textarea [@id='needChange']")).sendKeys("Test Fazal; Please Do not touch");
               
               driver.findElement(By.xpath("//input[@id='wiz2']")).click();
               
               driver.findElement(By.xpath("//input[@id='yesfunctional']")).click();
               
               driver.findElement(By.xpath("//textarea [@id='acceptanceCriteria']")).sendKeys("Test Fazal; Please Do not touch");
               
               driver.findElement(By.xpath("//textarea [@id='altWorkarounds']")).sendKeys("Test Fazal; Please Do not touch");
               
               driver.findElement(By.xpath("//input[@id='stackholders']")).sendKeys("82959");
               
               Thread.sleep(1000);
               
               List<WebElement> List = driver.findElements(By.xpath("//*[starts-with(@id,'ui-id-')]"));
               
                List.get(3).click();
             
               driver.findElement(By.xpath("//input[@id='testCaseRadio1']")).click();
               
               driver.findElement(By.xpath("//input[@id='UATDuration']")).sendKeys("1");
               
               driver.findElement(By.xpath("//input[@id='noIshelp']")).click();
               
               //driver.findElement(By.xpath("//input[@id='wiz3']")).click();
               driver.findElement(By.cssSelector("#wiz3"));
               
               Thread.sleep(2000);
               driver.findElement(By.xpath("//input[@id='noReport']")).click();
               
               driver.findElement(By.xpath("//input[@id='noExecuted']")).click();
               
               driver.findElement(By.xpath("//input[@id='noNotification']")).click();
               
               driver.findElement(By.xpath("//input[@id='noWorkflow']")).click();
               
               driver.findElement(By.xpath("//input[@id='noIntegration']")).click();
               
               driver.findElement(By.xpath("//input[@id='noExceptions']")).click();
               
               driver.findElement(By.xpath("//input[@id='noProvisions']")).click();
               
               driver.findElement(By.xpath("//input[@id='wiz4']")).click();
               Thread.sleep(2000);
               String s2= driver.findElement(By.xpath("//div[@class='noty_message']/span[@class='noty_text']")).getText();
               //String s2=driver.findElement(By.xpath("//div[@class='noty_bar']/div[@class='noty_message']/span[@class='noty_text']")).getText();//running fine 
               Thread.sleep(2000);
               System.out.println(s2);
               
               s2= s2.substring(s2.indexOf("(")+1, s2.indexOf(")"));
               System.out.println(""+s2);  
               
               driver.findElement(By.xpath("//li[@id='viewProject']/a")).click();
               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
               //driver.findElement(By.linkText(s2));
               driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
               driver.findElement(By.xpath("//td[1]/a/img")).click();
               
       //--------------------------------------------------------------------------------------//
               
               
               /*
               
               driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); // need to remove for integration
               
               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
               
               driver.findElement(By.xpath("//tr[@id='294']/td[1]/a/img")).click();
               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
               
               */
               
               
               //Request start date
               driver.findElement(By.xpath("//input[@id='requestPlannedStDt']")).click();
               driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a")).click();
               //request end date
               driver.findElement(By.xpath("//input[@id='requestPlannedEnDt']")).click();
               driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr[5]/td[5]/a")).click();
               //Estimation
               driver.findElement(By.xpath("//*[@id='1_PlannedStDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a")).click();
               driver.findElement(By.xpath("//*[@id='1_PlannedEnDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a")).click();
               driver.findElement(By.xpath("//input[@id='1_plannedHrId']")).sendKeys("2");
               
               //Requirement
               driver.findElement(By.xpath("//*[@id='3_PlannedStDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a")).click();
               driver.findElement(By.xpath("//*[@id='3_PlannedEnDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a")).click();
               driver.findElement(By.xpath("//input[@id='3_plannedHrId']")).sendKeys("2");
               //Re-Estimation
               driver.findElement(By.xpath("//*[@id='13_PlannedStDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a")).click();
               driver.findElement(By.xpath("//*[@id='13_PlannedEnDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")).click();
               driver.findElement(By.xpath("//input[@id='13_plannedHrId']")).sendKeys("2");
               //Design
               driver.findElement(By.xpath("//*[@id='4_PlannedStDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")).click();
               driver.findElement(By.xpath("//*[@id='4_PlannedEnDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")).click();
               driver.findElement(By.xpath("//input[@id='4_plannedHrId']")).sendKeys("2");
               //Coding
               driver.findElement(By.xpath("//*[@id='5_PlannedStDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")).click();
               driver.findElement(By.xpath("//*[@id='5_PlannedEnDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")).click();
               driver.findElement(By.xpath("//input[@id='5_plannedHrId']")).sendKeys("2");
               //Testing
               driver.findElement(By.xpath("//*[@id='6_PlannedStDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")).click();
               driver.findElement(By.xpath("//*[@id='6_PlannedEnDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")).click();
               driver.findElement(By.xpath("//input[@id='6_plannedHrId']")).sendKeys("2");
               //Additional Testing
               driver.findElement(By.xpath("//*[@id='12_PlannedStDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")).click();
               driver.findElement(By.xpath("//*[@id='12_PlannedEnDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")).click();
               driver.findElement(By.xpath("//input[@id='12_plannedHrId']")).sendKeys("2");
               //UAT
               driver.findElement(By.xpath("//*[@id='11_PlannedStDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a")).click();
               driver.findElement(By.xpath("//*[@id='11_PlannedEnDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")).click();
               driver.findElement(By.xpath("//input[@id='11_plannedHrId']")).sendKeys("2");
               //Release Activities
               driver.findElement(By.xpath("//*[@id='7_PlannedStDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[5]/a")).click();
               driver.findElement(By.xpath("//*[@id='7_PlannedEnDt']")).click();
               driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[5]/a")).click();
               driver.findElement(By.xpath("//input[@id='7_plannedHrId']")).sendKeys("2");
               
              // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
               
              //change status
              WebElement ele=  driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[2]"));
              
              WebDriverWait wait = new WebDriverWait(driver, 15);
              WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
    
              element.click();
              
               Alert alert=driver.switchTo().alert();
               alert.accept();
               
               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
               //Additional testing required
               driver.findElement(By.xpath("//input[@id='testingIsRequried']")).click();
               
               Thread.sleep(3000);
               
               //click submit
               driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();
               
               //Manager log out
               driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();
               
               
               // IS head log in
		       WebElement IShead = driver.findElement(By.xpath("//*[@id='loginId']"));
		        
		        // insert IShead name
		       IShead.sendKeys("560246");  
               
               // find IShead pwd name
               WebElement password1 = driver.findElement(By.id("password"));
               
               // insert password
               password1.sendKeys("test");
              
               // find login button
               driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
              
               driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
               
               driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
               //Thread.sleep(2000);
               driver.findElement(By.xpath("//td[1]/a/img")).click();
               
               
               //provide approval
               
              // WebElement ele1=  driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='4']"));
               
              // new WebDriverWait(driver, 15);
              // wait.until(ExpectedConditions.visibilityOf(ele1));
     
              // ele1.click();
         
               
               /*
               //provide approval
               WebElement provideapproval= driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='4']"));
               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
               provideapproval.click();
               
               */
               Thread.sleep(3000);
               //driver.findElement(By.xpath("//select[@id='workFlowStatusId']")).click();
               //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
               driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='4']")).click();
               
               Thread.sleep(3000);
           
               //click submit
               driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();
               //WebElement submit = driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']"));
               Thread.sleep(3000);
               //submit.click();
             
               //IShead log out
               driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();
               
               Thread.sleep(3000);
              
               // find Manager user name
		        WebElement Uname2 = driver.findElement(By.xpath("//*[@id='loginId']"));
		        
		       //insert user name
               Uname2.sendKeys("702173");  
               
               // find user name
               WebElement password2 = driver.findElement(By.id("password"));
               
               // insert password
               password2.sendKeys("test");
              
               // find login button
              driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
              
              driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
              driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
              
              driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
              //Thread.sleep(3000);
              driver.findElement(By.xpath("//td[1]/a/img")).click();
              
            //change status from Request Approved to Requirement Stage
              driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='5']")).click();
              
              //enter Actual Effort
              driver.findElement(By.xpath("//input[@id='1_actualHrId']")).sendKeys("2");
               
              //click submit
              driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();
              
       //-----------------------------------------------------------------------------------
              
              Thread.sleep(3000);
              //change status from Requirement Stage to Requirement Review
              driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='26']")).click();
              
              
              
              Thread.sleep(2000);
              //Reviewed By
              driver.findElement(By.xpath("//input[@id='reviewerName']")).sendKeys("701901");
              
              Thread.sleep(2000);
              
              List<WebElement> List1 = driver.findElements(By.xpath("//ul[@id='ui-id-5']/li[@class='ui-menu-item']/a[starts-with(@id,'ui-id-')]"));
              //Thread.sleep(2000);
              List1.get(0).click();
              
              //WebElement element= driver.findElement(By.name("datafile"));
              //element.sendKeys("C:\Users\Easy\Desktop\testfile.txt");
              
              //driver.findElement(By.xpath("//select[@id='attchmentCategoryTypeId']/option[@id='2']")).click();
              
             
              
             //WebElement ele11= driver.findElement(By.xpath("//input[@id='attachmentName']"));
             //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             
             //ele11.sendKeys("D:\\Fazal.docx");
             
             driver.findElement(By.xpath("//select[@id='attchmentCategoryTypeId']/option[@id='4']")).click();
             WebElement ele12= driver.findElement(By.xpath("//input[@id='attachmentName']"));
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             
             ele12.sendKeys("D:\\Fazal.docx");
             
             driver.findElement(By.xpath("//input[@name='activityPeriodRadio_1' and @id='radioNA']")).click();
             
             driver.findElement(By.xpath("//input[@name='activityPeriodRadio_2' and @id='radioNA']")).click();
             
             driver.findElement(By.xpath("//input[@name='activityPeriodRadio_3' and @id='radioNA']")).click();
             
             //driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();
             
             driver.findElement(By.id("editPageSaveBtnId")).click();
            
             //Manager log out
             driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();
             
             Thread.sleep(3000);
            
           
               // find Reviewer name
 		      WebElement Uname3 = driver.findElement(By.xpath("//*[@id='loginId']"));
 		        
 		      //insert user name
                Uname3.sendKeys("701901");  
             
               // find user name
                WebElement password3 = driver.findElement(By.id("password"));
             
               // insert password
                password3.sendKeys("test");
            
               // find login button
                driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
            
            driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            
            driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[1]/a/img")).click();
           
            Thread.sleep(2000);
            //change status Reviewed
            driver.findElement(By.xpath("//select[@id='reviewStatus']/option[@value='Reviewed']")).click();
            
            driver.findElement(By.xpath("//td[@id='checkListButton']/a/b")).click();
         
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[2]/td[2]/input[@name='checkList_108']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[3]/td[2]/input[@name='checkList_109']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[4]/td[2]/input[@name='checkList_110']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[5]/td[2]/input[@name='checkList_111']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[6]/td[2]/input[@name='checkList_112']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[7]/td[2]/input[@name='checkList_113']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[8]/td[2]/input[@name='checkList_114']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[9]/td[2]/input[@name='checkList_115']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[10]/td[2]/input[@name='checkList_116']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[11]/td[2]/input[@name='checkList_117']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[12]/td[2]/input[@name='checkList_118']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[13]/td[2]/input[@name='checkList_119']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[14]/td[2]/input[@name='checkList_120']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[15]/td[2]/input[@name='checkList_121']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[16]/td[2]/input[@name='checkList_122']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[17]/td[2]/input[@name='checkList_123']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[18]/td[2]/input[@name='checkList_124']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[19]/td[2]/input[@name='checkList_125']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[20]/td[2]/input[@name='checkList_126']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[21]/td[2]/input[@name='checkList_127']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[22]/td[2]/input[@name='checkList_128']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[23]/td[2]/input[@name='checkList_129']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[24]/td[2]/input[@name='checkList_130']")).click();
 		 driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr[25]/td[2]/input[@name='checkList_131']")).click();
 		 
 		 driver.findElement(By.xpath("//html/body/div[2]/div[3]/div/button[2]")).click();
 		 
 		 driver.findElement(By.xpath("html/body/form/div/div[3]/div[3]/div[2]/div[3]/table[3]/tbody/tr/td[2]/input[@id='editPageSaveBtnId']")).click();
 		 
 		 //Reviewer logout
 		 driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();
 		  
 		 
 		 
 		
 		
 		// find user name
         WebElement Uname21 = driver.findElement(By.xpath("//*[@id='loginId']"));
         
        //insert user name
       Uname21.sendKeys("702173");  
       
       // find user name
       WebElement password21 = driver.findElement(By.id("password"));
       
       // insert password
       password21.sendKeys("test");
      
       // find login button
      driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
      
      driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
      Thread.sleep(2000);
      driver.findElement(By.xpath("//td[1]/a/img")).click();
      
      
      //change status from Reviewed to Waiting for Requirement Approval
      Thread.sleep(3000);
      driver.findElement(By.xpath("//html/body/form/div/div[3]/div[3]/div[2]/div[3]/table[1]/tbody/tr[1]/td[2]/select/option[@id='6']")).click();
      
      driver.findElement(By.xpath("html/body/form/div/div[3]/div[3]/div[2]/div[3]/table[3]/tbody/tr/td[2]/input[@id='editPageSaveBtnId']")).click();	 
 		 
      //Manager logout
 	 driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();	 
 		
 	 
 		
 	
 	   // FC name
         WebElement Uname22 = driver.findElement(By.xpath("//*[@id='loginId']"));
         
        //insert user name
       Uname22.sendKeys("706060");  
       
       // find user name
       WebElement password22 = driver.findElement(By.id("password"));
       
       // insert password
       password22.sendKeys("test");
      
       // find login button
      driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
      
      driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
      Thread.sleep(2000);
      driver.findElement(By.xpath("//td[1]/a/img")).click();
      
      
      //change status 
      Thread.sleep(3000);
      driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='7']")).click();
      
      Thread.sleep(2000);
      driver.findElement(By.xpath("html/body/form/div/div[3]/div[3]/div[2]/div[3]/table[3]/tbody/tr/td[2]/input[@id='editPageSaveBtnId']")).click();	 
 		 
      // FC logout
    	 driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();	
 		
    	 Thread.sleep(3000);
 		
 		// find Manager user name
         WebElement Uname23 = driver.findElement(By.xpath("//*[@id='loginId']"));
         
        //insert user name
       Uname23.sendKeys("702173");  
       
       // find pwd
       WebElement password23 = driver.findElement(By.id("password"));
       
       // insert password
       password23.sendKeys("test");
      
       // find login button
      driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
      
      driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
      Thread.sleep(2000);
      driver.findElement(By.xpath("//td[1]/a/img")).click();
      
    
      
      //change status from Requirement Approved to Waiting for Re-Estimation Stage 
      Thread.sleep(3000);
      driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='39']")).click();
      
      //Insert Actual hours
      driver.findElement(By.xpath("//input[@id='3_actualHrId']")).sendKeys("2");
      
      //submit
      driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();	
      
      
      
      //change status from Re-Estimation Stage to Design
      Thread.sleep(4000);
      driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='9']")).click();
      
      //Attachment type
      driver.findElement(By.xpath("//select[@id='attchmentCategoryTypeId']/option[@id='1']")).click();
      
      //Upload doc
      WebElement ele111= driver.findElement(By.xpath("//input[@id='attachmentName']"));
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      ele111.sendKeys("D:\\rummi teams.xlsx");
    
    // click Assign Button  
   driver.findElement(By.xpath("//div[@id='showCount']/b[@class='Assign_button']")).click();
   
   // Select a Resource
   driver.findElement(By.xpath("//div[@id='show_resources_dialog_message']/table[@id='resourcetable']/tbody/tr[@id='resourcesList']/tr/td[@id='resourcesName']/input[@id=811322]")).click();
    
   //click OK
   driver.findElement(By.xpath("html/body/div[2]/div[3]/div/button[1]")).click();
   
   //Insert Actual Hours
   driver.findElement(By.xpath("//input[@id='13_actualHrId']")).sendKeys("2");
   
   // Click Submit
   driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();	 
   
      //change status from Design to Design Review 
      Thread.sleep(3000);
      driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='27']")).click();
      
      Thread.sleep(2000);
      //Reviewed By
      driver.findElement(By.xpath("//input[@id='reviewerName']")).sendKeys("701901");
      
      Thread.sleep(2000);
      
      List<WebElement> List3 = driver.findElements(By.xpath("//ul[@id='ui-id-5']/li[@class='ui-menu-item']/a[starts-with(@id,'ui-id-')]"));
      //Thread.sleep(2000);
      List3.get(0).click(); 
      

      Thread.sleep(2000);
      
   //Upload TDD doc

    driver.findElement(By.xpath("//select[@id='attchmentCategoryTypeId']/option[@id='14']")).click();
    WebElement TDDdoc= driver.findElement(By.xpath("//input[@id='attachmentName']"));
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    TDDdoc.sendKeys("D:\\Fazal.docx");
  
   //submit
   driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();	
      
      //Manager logout
 	 driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();	
      
 	Thread.sleep(2000);
      
   // find Reviewer name
      WebElement Uname24 = driver.findElement(By.xpath("//*[@id='loginId']"));
        
      //insert user name
       Uname24.sendKeys("701901");  
    
      // find user name
       WebElement password24 = driver.findElement(By.id("password"));
    
      // insert password
       password24.sendKeys("test");
   
      // find login button
       driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
   
   driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
   driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
   Thread.sleep(2000);
   driver.findElement(By.xpath("//td[1]/a/img")).click();
  
   Thread.sleep(2000);
   //change status Reviewed
   driver.findElement(By.xpath("//select[@id='reviewStatus']/option[@value='Reviewed']")).click();
   
   
   driver.findElement(By.xpath("//td[@id='checkListButton']/a/b")).click();
   
   Thread.sleep(1000);
   
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[2]/td[2]/input[@name='checkList_217']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[3]/td[2]/input[@name='checkList_218']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[4]/td[2]/input[@name='checkList_219']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[5]/td[2]/input[@name='checkList_220']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[6]/td[2]/input[@name='checkList_221']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[7]/td[2]/input[@name='checkList_222']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[8]/td[2]/input[@name='checkList_223']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[9]/td[2]/input[@name='checkList_224']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[10]/td[2]/input[@name='checkList_225']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[11]/td[2]/input[@name='checkList_226']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[12]/td[2]/input[@name='checkList_227']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[13]/td[2]/input[@name='checkList_228']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[14]/td[2]/input[@name='checkList_229']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[15]/td[2]/input[@name='checkList_230']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[16]/td[2]/input[@name='checkList_231']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[17]/td[2]/input[@name='checkList_232']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[18]/td[2]/input[@name='checkList_233']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[19]/td[2]/input[@name='checkList_234']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[20]/td[2]/input[@name='checkList_235']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[21]/td[2]/input[@name='checkList_236']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[22]/td[2]/input[@name='checkList_237']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[23]/td[2]/input[@name='checkList_238']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[24]/td[2]/input[@name='checkList_239']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[25]/td[2]/input[@name='checkList_240']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[26]/td[2]/input[@name='checkList_241']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[27]/td[2]/input[@name='checkList_242']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[28]/td[2]/input[@name='checkList_243']")).click();
 	 
 	 
 	 Thread.sleep(3000);
 	 
 	 driver.findElement(By.xpath("//html/body/div[2]/div[3]/div/button[2]")).click();
   
 	 Thread.sleep(3000);
 	 
 	//submit
 	  driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();	
      
     
   // Reviewer logout
   driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();	
   
    
   Thread.sleep(3000);
   
 		// find user name
         WebElement Uname25 = driver.findElement(By.xpath("//*[@id='loginId']"));
         
        //insert user name
       Uname25.sendKeys("702173");  
       
       // find user name
       WebElement password25 = driver.findElement(By.id("password"));
       
       // insert password
       password25.sendKeys("test");
      
       // find login button
      driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
      
      driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
      Thread.sleep(2000);
      driver.findElement(By.xpath("//td[1]/a/img")).click();
      

      
      //change status from Design Review to Coding Stage
      Thread.sleep(3000);
      driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='10']")).click();
      
      driver.findElement(By.xpath("//input[@id='4_actualHrId']")).sendKeys("2");
     
      driver.findElement(By.xpath("html/body/form/div/div[3]/div[3]/div[2]/div[3]/table[3]/tbody/tr/td[2]/input[@id='editPageSaveBtnId']")).click();	 
 	
      
      //change status from Coding Stage  to Coding Review
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id='workFlowStatusId']/option[@id='11']")).click();
      
      Thread.sleep(2000);
      //Reviewed By
      driver.findElement(By.xpath("//input[@id='reviewerName']")).sendKeys("701901");
      
      Thread.sleep(2000);
      
      List<WebElement> List4 = driver.findElements(By.xpath("//ul[@id='ui-id-5']/li[@class='ui-menu-item']/a[starts-with(@id,'ui-id-')]"));
      //Thread.sleep(2000);
      List4.get(0).click(); 
      
      
      driver.findElement(By.xpath("html/body/form/div/div[3]/div[3]/div[2]/div[3]/table[3]/tbody/tr/td[2]/input[@id='editPageSaveBtnId']")).click();	 
      
      //Manager logout
 	 driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();
 	 

 	 Thread.sleep(3000);
 	 
 	 
 	 
 	 //find Reviewer name
      WebElement Uname31 = driver.findElement(By.xpath("//*[@id='loginId']"));
        
      //insert user name
       Uname31.sendKeys("701901");  
    
      // find user name
       WebElement password31 = driver.findElement(By.id("password"));
    
      // insert password
       password31.sendKeys("test");
   
      // find login button
       driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
   
   driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
   driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
   Thread.sleep(2000);
   driver.findElement(By.xpath("//td[1]/a/img")).click();
  
   Thread.sleep(2000);
   //change status to Code Reviewed
   driver.findElement(By.xpath("//select[@id='reviewStatus']/option[@value='Reviewed']")).click();
   
   
   driver.findElement(By.xpath("//td[@id='checkListButton']/a/b")).click();
   
   Thread.sleep(1000);
   
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[2]/td[2]/input[@name='checkList_548']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[3]/td[2]/input[@name='checkList_549']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[4]/td[2]/input[@name='checkList_550']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[5]/td[2]/input[@name='checkList_551']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[6]/td[2]/input[@name='checkList_552']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[7]/td[2]/input[@name='checkList_553']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[8]/td[2]/input[@name='checkList_554']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[9]/td[2]/input[@name='checkList_555']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[10]/td[2]/input[@name='checkList_556']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[11]/td[2]/input[@name='checkList_557']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[12]/td[2]/input[@name='checkList_558']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[13]/td[2]/input[@name='checkList_559']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[14]/td[2]/input[@name='checkList_560']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[15]/td[2]/input[@name='checkList_561']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[16]/td[2]/input[@name='checkList_562']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[17]/td[2]/input[@name='checkList_563']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[18]/td[2]/input[@name='checkList_564']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[19]/td[2]/input[@name='checkList_565']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[20]/td[2]/input[@name='checkList_566']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[21]/td[2]/input[@name='checkList_567']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[22]/td[2]/input[@name='checkList_568']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[23]/td[2]/input[@name='checkList_569']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[24]/td[2]/input[@name='checkList_570']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[25]/td[2]/input[@name='checkList_571']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[26]/td[2]/input[@name='checkList_572']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[27]/td[2]/input[@name='checkList_573']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[28]/td[2]/input[@name='checkList_574']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[29]/td[2]/input[@name='checkList_575']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[30]/td[2]/input[@name='checkList_576']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[31]/td[2]/input[@name='checkList_577']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[32]/td[2]/input[@name='checkList_578']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[33]/td[2]/input[@name='checkList_579']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[34]/td[2]/input[@name='checkList_580']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[35]/td[2]/input[@name='checkList_581']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[36]/td[2]/input[@name='checkList_582']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[37]/td[2]/input[@name='checkList_583']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[38]/td[2]/input[@name='checkList_584']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[39]/td[2]/input[@name='checkList_585']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[40]/td[2]/input[@name='checkList_586']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[41]/td[2]/input[@name='checkList_587']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[42]/td[2]/input[@name='checkList_588']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[43]/td[2]/input[@name='checkList_589']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[44]/td[2]/input[@name='checkList_590']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[45]/td[2]/input[@name='checkList_591']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[46]/td[2]/input[@name='checkList_592']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[47]/td[2]/input[@name='checkList_593']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[48]/td[2]/input[@name='checkList_594']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[49]/td[2]/input[@name='checkList_595']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[50]/td[2]/input[@name='checkList_596']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[51]/td[2]/input[@name='checkList_597']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[52]/td[2]/input[@name='checkList_598']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[53]/td[2]/input[@name='checkList_599']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[54]/td[2]/input[@name='checkList_600']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[55]/td[2]/input[@name='checkList_601']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[56]/td[2]/input[@name='checkList_602']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[57]/td[2]/input[@name='checkList_603']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[58]/td[2]/input[@name='checkList_604']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[59]/td[2]/input[@name='checkList_605']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[60]/td[2]/input[@name='checkList_606']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[61]/td[2]/input[@name='checkList_607']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[62]/td[2]/input[@name='checkList_608']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[63]/td[2]/input[@name='checkList_609']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[64]/td[2]/input[@name='checkList_610']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[65]/td[2]/input[@name='checkList_611']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[66]/td[2]/input[@name='checkList_612']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[67]/td[2]/input[@name='checkList_613']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[68]/td[2]/input[@name='checkList_614']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[69]/td[2]/input[@name='checkList_615']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[70]/td[2]/input[@name='checkList_616']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[71]/td[2]/input[@name='checkList_617']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[72]/td[2]/input[@name='checkList_618']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[73]/td[2]/input[@name='checkList_619']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[74]/td[2]/input[@name='checkList_620']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[75]/td[2]/input[@name='checkList_621']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[76]/td[2]/input[@name='checkList_622']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[77]/td[2]/input[@name='checkList_623']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[78]/td[2]/input[@name='checkList_624']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[79]/td[2]/input[@name='checkList_625']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[80]/td[2]/input[@name='checkList_626']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[81]/td[2]/input[@name='checkList_627']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[82]/td[2]/input[@name='checkList_628']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[83]/td[2]/input[@name='checkList_629']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[84]/td[2]/input[@name='checkList_630']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[85]/td[2]/input[@name='checkList_631']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[86]/td[2]/input[@name='checkList_632']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[87]/td[2]/input[@name='checkList_633']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[88]/td[2]/input[@name='checkList_634']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[89]/td[2]/input[@name='checkList_635']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[90]/td[2]/input[@name='checkList_636']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[91]/td[2]/input[@name='checkList_637']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[92]/td[2]/input[@name='checkList_638']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[93]/td[2]/input[@name='checkList_639']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[94]/td[2]/input[@name='checkList_640']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[95]/td[2]/input[@name='checkList_641']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[96]/td[2]/input[@name='checkList_642']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[97]/td[2]/input[@name='checkList_643']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[98]/td[2]/input[@name='checkList_644']")).click();
 	 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[99]/td[2]/input[@name='checkList_645']")).click();
 	 
 	 
 	 Thread.sleep(2000);
 	 
 	 driver.findElement(By.xpath("//html/body/div[2]/div[3]/div/button[2]")).click();
   
 	 Thread.sleep(2000);
 	 
 	//submit
 	  driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();	
      
     
   // Reviewer logout
   driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();	
 	 
   Thread.sleep(3000); 
 	 
 		
 		// find user name
         WebElement Uname32 = driver.findElement(By.xpath("//*[@id='loginId']"));
         
        //insert user name
       Uname32.sendKeys("702173");  
       
       // find user name
       WebElement password32 = driver.findElement(By.id("password"));
       
       // insert password
       password32.sendKeys("test");
      
       // find login button
      driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
      
      driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
      Thread.sleep(2000);
      driver.findElement(By.xpath("//td[1]/a/img")).click();
      
      
      //change status from Coding Review  to Testing Stage	
      Thread.sleep(3000);
      driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='12']")).click();
      
      driver.findElement(By.xpath("//input[@id='5_actualHrId']")).sendKeys("2");
     
      driver.findElement(By.xpath("html/body/form/div/div[3]/div[3]/div[2]/div[3]/table[3]/tbody/tr/td[2]/input[@id='editPageSaveBtnId']")).click();	 
 	
      Thread.sleep(3000);
      
      
      
      
      //change status from Testing Stage  to Testing Review
      Thread.sleep(3000);
      driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='28']")).click();
      
      Thread.sleep(2000);
      //Reviewed By
      driver.findElement(By.xpath("//input[@id='reviewerName']")).sendKeys("701901");
      
      Thread.sleep(2000);
      
      List<WebElement> List5 = driver.findElements(By.xpath("//ul[@id='ui-id-5']/li[@class='ui-menu-item']/a[starts-with(@id,'ui-id-')]"));
      //Thread.sleep(2000);
      List5.get(0).click(); 
      
      //Upload Unit test doc
      driver.findElement(By.xpath("//select [@id='attchmentCategoryTypeId']/option[@id='19']")).click();
      
      driver.findElement(By.xpath("//input[@id='attachmentName']")).sendKeys("D:\\rummi teams.xlsx");
 	 
      //submit
 	 driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();	
   
 	 //Manager logout
      driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();	
      
      Thread.sleep(2000);
      
      
 //-----------------------------------------------------------------------------------------------------------------//
 		
 		//Reviewer Testing Review 
 		
 		//find Reviewer name
 	     WebElement Uname33 = driver.findElement(By.xpath("//*[@id='loginId']"));
 	       
 	     //insert user name
 	      Uname33.sendKeys("701901");  
 	   
 	     // find user name
 	      WebElement password33 = driver.findElement(By.id("password"));
 	   
 	     // insert password
 	      password33.sendKeys("test");
 	  
 	     // find login button
 	      driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
 	  
 	  driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
 	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	  
 	  driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("//td[1]/a/img")).click();
 	 
 	  Thread.sleep(2000);
 	  //change status to Code Reviewed
 	  driver.findElement(By.xpath("//select[@id='reviewStatus']/option[@value='Reviewed']")).click();
 	  
 	  
 	  driver.findElement(By.xpath("//td[@id='checkListButton']/a/b")).click();
 	  
 	  Thread.sleep(1000);
 	  
 	  //Write Xpath for Testing Review Checklist
 	  
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[2]/td[2]/input[@name='checkList_298']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[3]/td[2]/input[@name='checkList_299']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[4]/td[2]/input[@name='checkList_300']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[5]/td[2]/input[@name='checkList_301']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[6]/td[2]/input[@name='checkList_302']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[7]/td[2]/input[@name='checkList_303']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[8]/td[2]/input[@name='checkList_304']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[9]/td[2]/input[@name='checkList_305']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[10]/td[2]/input[@name='checkList_306']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[11]/td[2]/input[@name='checkList_307']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[12]/td[2]/input[@name='checkList_308']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[13]/td[2]/input[@name='checkList_309']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[14]/td[2]/input[@name='checkList_310']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[15]/td[2]/input[@name='checkList_311']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[16]/td[2]/input[@name='checkList_312']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[17]/td[2]/input[@name='checkList_313']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[18]/td[2]/input[@name='checkList_314']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[19]/td[2]/input[@name='checkList_315']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[20]/td[2]/input[@name='checkList_316']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[21]/td[2]/input[@name='checkList_317']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[22]/td[2]/input[@name='checkList_318']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[23]/td[2]/input[@name='checkList_319']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[24]/td[2]/input[@name='checkList_320']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[25]/td[2]/input[@name='checkList_321']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[26]/td[2]/input[@name='checkList_322']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[27]/td[2]/input[@name='checkList_323']")).click();
 		 driver.findElement(By.xpath("//table[@id='reviewChecklistTable']/tbody/tr[28]/td[2]/input[@name='checkList_324']")).click();
 		
 		 
 		 Thread.sleep(2000);
 		 
 		 driver.findElement(By.xpath("//html/body/div[2]/div[3]/div/button[2]")).click();
 	  
 		 Thread.sleep(2000);
 		 
 		//submit
 		  driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();	
 	     
 	    
 	  // Reviewer logout
 	  driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();
 	 Thread.sleep(2000);
      
   // find user name
      WebElement Uname7 = driver.findElement(By.xpath("//*[@id='loginId']"));
      
     //insert user name
    Uname7.sendKeys("702173");  
    
    // find user name
    WebElement password7 = driver.findElement(By.id("password"));
    
    // insert password
    password7.sendKeys("test");
   
    // find login button
   driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
   
   driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
   driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
   Thread.sleep(2000);
   driver.findElement(By.xpath("//td[1]/a/img")).click();
   
   //change status from Testing Review  to  Additional Testing	
   Thread.sleep(3000);
   driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='29']")).click();
   
   driver.findElement(By.xpath("//input[@id='6_actualHrId']")).sendKeys("2");
  
   driver.findElement(By.xpath("html/body/form/div/div[3]/div[3]/div[2]/div[3]/table[3]/tbody/tr/td[2]/input[@id='editPageSaveBtnId']")).click();	 
    
  //Manager logout
  driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();	
  
  
 		
 //---------------------------------------------------------------------------------------------------//		
 	
 		
 		
  //Raise defects in Additional Testing Stage
 		
 		// find Tester user name
 	     WebElement Uname27 = driver.findElement(By.xpath("//*[@id='loginId']"));
 	     
 	    //insert user name
 	   Uname27.sendKeys("829593");  
 	   
 	   // find user name
 	   WebElement password27 = driver.findElement(By.id("password"));
 	   
 	   // insert password
 	   password27.sendKeys("test");
 	  
 	   // find login button
 	  driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
 	  
 	  driver.findElement(By.xpath("//div[@id='menu']/ul/li[5]/a")).click(); 
 	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	  
 	  
 	   //Raised Defect Against (L2/L3) 
 	     driver.findElement(By.xpath("//input[@id='getreqdata']")).sendKeys(s2);	     
 	     Thread.sleep(2000);
 	     
 	     List<WebElement> List6 = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']/a[starts-with(@id,'ui-id-')]"));
 	     //Thread.sleep(2000);                                   
 	     List6.get(0).click(); 
 	  
 	   // Defect type
 	     driver.findElement(By.xpath("//select[@id='detectedtype']/option[@value='9']")).click();
 	     
 	   //Severity
 	     driver.findElement(By.xpath("//select[@id='severity']/option[@value='1']")).click();
 	  	
 	   //Assign To
 	     driver.findElement(By.xpath("//input[@id='assignto']")).sendKeys("811322");	     
 	     Thread.sleep(2000);
 	     
 	     List<WebElement> List7 = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li[@class='ui-menu-item']/a[starts-with(@id,'ui-id-')]"));
 	     //Thread.sleep(2000);                                 
 	     List7.get(0).click();
 	 
 	   //Defect Title
 	     driver.findElement(By.xpath("//input [@id='defectTitle']")).sendKeys("Test Defect Title");
 	     
 	   //Defect Description
 	     driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Test Defect Description"); 
 	     
 	   //Defect Attachment 
 	     driver.findElement(By.xpath("//input[@id='defectAttachment']")).sendKeys("D:\\Fazal.docx");
 	    
 	   //Testing Browser 
 	     driver.findElement(By.xpath("//table[@id='browserTd']/tbody/tr/td/button")).click();
 	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	     
 	     driver.findElement(By.xpath("//input[@id='ui-dropselect-browserval-option-1']")).click();
 	   
 	     //submit defect
 		 driver.findElement(By.xpath("//input [@id='saveTR']")).click();	
 	   
 		 //Tester logout
 		 driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();
 		 
 		 Thread.sleep(2000);	
 		 
 	   //Developer user name
 	     WebElement Uname8 = driver.findElement(By.xpath("//*[@id='loginId']"));
 	     
 	   //insert user name
 	   Uname8.sendKeys("811322");  
 	   
 	   // find user name
 	   WebElement password9 = driver.findElement(By.id("password"));
 	   
 	   // insert password
 	   password9.sendKeys("test");
 	  
 	   // find login button
 	  driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
 	  
 	  //Find defect
 	  driver.findElement(By.xpath("//div[@id='menu']/ul/li[5]/a")).click(); 
 	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	 
 		
 	  //Find view defect
 	  driver.findElement(By.xpath("//form[@id='createisrtdefect']/div[1]/div[1]/div[3]/div[3]/div[1]/a[2]")).click();	
 		
 	  //Raised Defect Against (L2/L3)
 	  driver.findElement(By.xpath("//input [@id='getreqdata']")).sendKeys(s2);	     
 	  Thread.sleep(2000);
 	  
 	  List<WebElement> List8 = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']/a[starts-with(@id,'ui-id-')]"));
 	   //Thread.sleep(2000);                                 
 	   List8.get(0).click();
 	   
 	  //select defect id
 	   driver.findElement(By.xpath("//table[@id='list']//tr[2]//img")).click();
 	   Thread.sleep(2000); 
 	   
 	   //Comments
 	   driver.findElement(By.xpath("//textarea [@id='comments']")).sendKeys("Test Comments1");
 	   
 	   // Status
 	   driver.findElement(By.xpath("//select[@id='status']/option[@value='33']")).click();
 	   
 	   //update defect WIP
 	   driver.findElement(By.xpath("//span[@id='UpdateTR']")).click();
 	   
 	   
 	 //Raised Defect Against (L2/L3)
 		  driver.findElement(By.xpath("//input [@id='getreqdata']")).sendKeys(s2);	     
 		  Thread.sleep(2000);
 		  
 		  List<WebElement> List9 = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']/a[starts-with(@id,'ui-id-')]"));
 		   //Thread.sleep(2000);                                 
 		   List9.get(0).click();
 		   
 		  //select defect id
 		   driver.findElement(By.xpath("//table[@id='list']//tr[2]//img")).click();
 		   Thread.sleep(2000); 
 	
 		 //Comments
 		   driver.findElement(By.xpath("//textarea [@id='comments']")).sendKeys("Test Comments2");
 		   
 		   // Status
 		   driver.findElement(By.xpath("//select[@id='status']/option[@value='34']")).click();
 		   
 		   //update defect WIP
 		   driver.findElement(By.xpath("//span[@id='UpdateTR']")).click();
 	   
 		   //Developer logout
 		   driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();
 		  Thread.sleep(2000); 
 	     
 	   
 		// find Tester user name
 	     WebElement Uname37 = driver.findElement(By.xpath("//*[@id='loginId']"));
 	     
 	    //insert user name
 	   Uname37.sendKeys("829593");  
 	   
 	   // find user name
 	   WebElement password37 = driver.findElement(By.id("password"));
 	   
 	   // insert password
 	   password37.sendKeys("test");
 	  
 	   // find login button
 	  driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
 	  
 	  
 	  
 	 //Find defect
 	  driver.findElement(By.xpath("//div[@id='menu']/ul/li[5]/a")).click(); 
 	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	 
 		
 	  //Find view defect
 	  driver.findElement(By.xpath("//form[@id='createisrtdefect']/div[1]/div[1]/div[3]/div[3]/div[1]/a[2]")).click();
 	  
 	//Raised Defect Against (L2/L3)
 	  driver.findElement(By.xpath("//input [@id='getreqdata']")).sendKeys(s2);	     
 	  Thread.sleep(2000);
 	     
 	     List<WebElement> List10 = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']/a[starts-with(@id,'ui-id-')]"));
 	     //Thread.sleep(2000);                                   
 	     List10.get(0).click(); 
 	   
 	     
 	   //select defect id
 		   driver.findElement(By.xpath("//table[@id='list']//tr[2]//img")).click();
 		   Thread.sleep(2000); 
 	
 		 //Comments
 		   driver.findElement(By.xpath("//textarea [@id='comments']")).sendKeys("Test Comments3");
 		   
 		   // Status
 		   driver.findElement(By.xpath("//select[@id='status']/option[@value='38']")).click();
 		   
 		   //update defect Close
 		   driver.findElement(By.xpath("//span[@id='UpdateTR']")).click();
 		   Thread.sleep(3000); 
 		   
 		   
 		  //change status from Additional Testing to Testing Approved
 		   //find view projects
 		   driver.findElement(By.xpath("//li[@id='viewProject']")).click(); 
 		   Thread.sleep(2000);
 		   
 		  //select project id 
 		    driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
 		     Thread.sleep(1000);
 		     driver.findElement(By.xpath("//td[1]/a/img")).click();
 		     Thread.sleep(1000);
 		     
 		     //project Status
 		     driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='13']")).click();
 		     
 		     //Attachment Type Test Report
 		     driver.findElement(By.xpath("//select[@id='attchmentCategoryTypeId']/option[@id='36']")).click();
 		     
 		    //upload file      
 		     driver.findElement(By.xpath("//input [@id='attachmentName']")).sendKeys("D:\\Review.msg");
 		     Thread.sleep(2000);
 		     
 		   //Attachment Type IVV TestReview Report       
 		     driver.findElement(By.xpath("//select[@id='attchmentCategoryTypeId']/option[@id='17']")).click();
 		     Thread.sleep(2000);
 		     
 		    //upload file
 		     driver.findElement(By.xpath("//input[@id='attachmentName_F1']")).sendKeys("D:\\rummi teams.xlsx");
 		    
 		     /*
 		     
 		  // verify that the “Milestone button” is displayed and enabled
              boolean MilestoneIconPresence = driver.findElement(By.id("12_mileStoneImg")).isDisplayed();
              boolean MilestoneIconEnabled = driver.findElement(By.id("12_mileStoneImg")).isEnabled();

              if (MilestoneIconPresence==true && MilestoneIconEnabled==true)
              {
                     // click on the Milestone button
                     WebElement MilestoneIcon = driver.findElement(By.id("12_mileStoneImg"));
                     MilestoneIcon.click();
              }
 		     
 		
 		     // Additional Testing Milestone Missed Reason
 		     //driver.findElement(By.xpath("//img[@id='12_mileStoneImg']")).click();
 		     
 		     // Reason for delay: 	
 		     driver.findElement(By.xpath("//select[@id='12_reasonDelaySelect']/option[@value='1']")).click();
 		     
 		     // Delay Comments
 		     driver.findElement(By.xpath("//textarea [@id='12_mileStoneComments']")).sendKeys("test reason");
 		     
 		     //submit Delay Comments
 		     driver.findElement(By.xpath("html/body/div[3]/div[3]/div/button[1]")).click();
 		     
 		     */
 		     
 		     
 		     //Actual hours
 		     driver.findElement(By.xpath("//input[@id='12_actualHrId']")).sendKeys("2");
 		     
 		     //submit
 		     driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();
 		     
 		    //Tester logout
 			 driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();
 			 
 			 Thread.sleep(2000);
 			 
 			 
 			
 		
 		
 		
 		// find Manager user name
         WebElement Uname11 = driver.findElement(By.xpath("//*[@id='loginId']"));
         
        //insert user name
       Uname11.sendKeys("702173");  
       
       // find user name
       WebElement password11 = driver.findElement(By.id("password"));
       
       // insert password
       password11.sendKeys("test");
      
       // find login button
      driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
      
      driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
      Thread.sleep(2000);
      driver.findElement(By.xpath("//td[1]/a/img")).click();
      
      Thread.sleep(2000);
      
      //change status from Testing Approved to UAT Stage
      driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='15']")).click();
      
     //submit
      driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();
      
     //Manager logout
 	 driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();
 	
 	 Thread.sleep(2000);
 	 
 	 
 	 
 	 
 		
 	// find FC user name
      WebElement Uname12 = driver.findElement(By.xpath("//*[@id='loginId']"));
      
     //insert FC user name
    Uname12.sendKeys("706060");  
    
    // find FC pwd
    WebElement password12 = driver.findElement(By.id("password"));
    
    // insert password
    password12.sendKeys("test");
   
    // find login button
   driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
   
   driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
   driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
   Thread.sleep(2000);
   driver.findElement(By.xpath("//td[1]/a/img")).click();
   
   Thread.sleep(2000);
   
   //change status from UAT Stage to UAT Approved
   driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='16']")).click();
   
 //Attachment Type UAT Report       
   driver.findElement(By.xpath("//select[@id='attchmentCategoryTypeId']/option[@id='20']")).click();
   Thread.sleep(2000);
   
  //upload file
   driver.findElement(By.xpath("//input[@id='attachmentName']")).sendKeys("D:\\rummi teams.xlsx");
   
   
   
   
 //verify that the “Milestone button” is displayed and enabled
   //boolean MilestoneIconPresence1 = driver.findElement(By.id("11_mileStoneImg")).isDisplayed();
   boolean MilestoneIconEnabled1 = driver.findElement(By.xpath("//img[@id='11_mileStoneImg']")).isEnabled();
   
   System.out.println(MilestoneIconEnabled1);

   if (MilestoneIconEnabled1==false)
   {
          // click on the search button
          WebElement MilestoneIcon1 = driver.findElement(By.id("11_mileStoneImg"));
          MilestoneIcon1.click();
          
          
       // Reason for delay: 	
          WebElement ee1=driver.findElement(By.xpath("//select[@id='11_reasonDelaySelect']/option[@value='1']"));
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        		  ee1.click();
         
          // Delay Comments
          WebElement ee=driver.findElement(By.xpath("//textarea [@id='11_mileStoneComments']"));
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          ee.sendKeys("test reason 123");

          
          
          WebDriverWait wait1 = new WebDriverWait(driver, 40);
          
          wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[3]//button[1]")))).click();;
          
          //submit Delay Comments
         // WebElement DelayComments = 
          
         // DelayComments.click();

         //submit
          driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();
       
        	 Thread.sleep(2000);
   }
  
   
   else{
 	//submit
       driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();
   }
 	
 		 //------------

   /*  
    
    
   ((JavascriptExecutor)driver).executeScript("scroll(0,650)");

   
 //verify that the “Milestone button” is displayed and enabled
   boolean MilestoneIconPresence11 = driver.findElement(By.id("11_mileStoneImg")).isDisplayed();
   boolean MilestoneIconEnabled11 = driver.findElement(By.id("11_mileStoneImg")).isEnabled();

   if (MilestoneIconPresence11==true && MilestoneIconEnabled11==true)
   {
          // click on the search button
          WebElement MilestoneIcon11 = driver.findElement(By.id("11_mileStoneImg"));
          MilestoneIcon11.click();
   }
   
   // Additional Testing Milestone Missed Reason
   //driver.findElement(By.xpath("//img[@id='12_mileStoneImg']")).click();
   
   // Reason for delay: 	
   driver.findElement(By.xpath("//select [@id='11_reasonDelaySelect']/option[@value='13']")).click();
   
   // Delay Comments
   //driver.findElement(By.xpath("//textarea [@id='11_mileStoneComments']")).sendKeys("test reason 1");
   driver.findElement(By.xpath("//table[@id='milestoneComments']/tbody/tr[2]/td[2]/textarea[@id='11_mileStoneComments']")).sendKeys("test reason 1");
   
   
   Thread.sleep(2000);
   
   //submit Delay Comments
   //driver.findElement(By.xpath("//div[contains(text(),'OK')]")).click();
   
   
   //driver.findElement(By.xpath("//button[@type='button']")).click();

   
   //WebElement OKClick = driver.findElement(By.xpath("//div[3]/div[11]/div/button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']/span[@class='ui-button-text'][contains(text(),'OK')]"));
   //Thread.sleep(2000);
   //OKClick.click();
   
   WebDriverWait wait2 = new WebDriverWait(driver, 40);
   
   wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[3]/div[3]/div[1]/button[1]")))).click();
   
   Thread.sleep(2000);
   
 		     
 //submit
 driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();
 	
 	*/ 
   
 		     
 //FC logout
 driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();	     

 Thread.sleep(2000);

 		
 		// find Manager user name
         WebElement Uname13 = driver.findElement(By.xpath("//*[@id='loginId']"));
         
        //insert user name
       Uname13.sendKeys("702173");  
       
       // find user name
       WebElement password13 = driver.findElement(By.id("password"));
       
       // insert password
       password13.sendKeys("test");
      
       // find login button
      driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
      
      driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
      Thread.sleep(2000);
      driver.findElement(By.xpath("//td[1]/a/img")).click();
    
      //change status from UAT Approved to Ready To Deploy	
      Thread.sleep(3000);
      driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='18']")).click();
      
      driver.findElement(By.xpath("//input [@id='11_actualHrId']")).sendKeys("2");
     
    //Attachment Type
      driver.findElement(By.xpath("//select[@id='attchmentCategoryTypeId']/option[@id='21']")).click();
      
    //upload file      
      driver.findElement(By.xpath("//input [@id='attachmentName']")).sendKeys("D:\\Fazal.docx");
      Thread.sleep(2000); 
      
      //submit
      driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();
 			
    //Manager logout
      driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();	
      
    Thread.sleep(2000);
      
 		// find Deployment Manager user name
         WebElement Uname14 = driver.findElement(By.xpath("//*[@id='loginId']"));
         
        //insert user name
       Uname14.sendKeys("500660");  
       
       // find user name
       WebElement password14 = driver.findElement(By.id("password"));
       
       // insert password
       password14.sendKeys("test");
      
       // find login button
      driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
      
      driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
      Thread.sleep(2000);
      driver.findElement(By.xpath("//td[1]/a/img")).click();
    
      //change status from Ready To Deploy to Production Released
      Thread.sleep(3000);
      driver.findElement(By.xpath("//select[@id='workFlowStatusId']/option[@id='19']")).click();
      	   
    //Attachment Type
      driver.findElement(By.xpath("//select[@id='attchmentCategoryTypeId']/option[@id='23']")).click();
      
    //upload file      
      driver.findElement(By.xpath("//input [@id='attachmentName']")).sendKeys("D:\\Fazal.docx");
      Thread.sleep(2000); 
      
      
      driver.findElement(By.xpath("//input [@id='7_actualHrId']")).sendKeys("2");	
      
      //submit
      driver.findElement(By.xpath("//input[@id='editPageSaveBtnId']")).click();
 			
    //Deployment Manager logout
      driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();	 
      
      Thread.sleep(2000);
    
       
 		   
 		// find Manager user name
 	     WebElement Uname15 = driver.findElement(By.xpath("//*[@id='loginId']"));
 	     
 	    //insert FC user name
 	   Uname15.sendKeys("702173");  
 	   
 	   // find FC pwd
 	   WebElement password15 = driver.findElement(By.id("password"));
 	   
 	   // insert password
 	   password15.sendKeys("test");
 	  
 	   // find login button
 	  driver.findElement(By.xpath("//*[@id='login']/div[4]/input[@id='login']")).click();
 	  
 	  driver.findElement(By.xpath("//li[@id='viewProject']/a")).click(); 
 	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("//select[@id='filterRequest']/option[@value='5']")).click();
 	  
 	  driver.findElement(By.xpath("//input[@id='gs_REQUEST_ID']")).sendKeys(s2);
 	  Thread.sleep(2000);
 	  driver.findElement(By.xpath("//td[1]/a/img")).click();
 	  
 	  Thread.sleep(20000);
 	
      //Manager logout
 	 //driver.findElement(By.xpath("//div[@id='header']/div[4]/p/a")).click();	 
 	
 		
	}

 }
