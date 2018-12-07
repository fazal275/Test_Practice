package ReadExcel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class TimeCard {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//Open in Firefox
        //FirefoxDriver driver = new FirefoxDriver();
        
        
        //Open in Chrome
        //System.setProperty("webdriver.chrome.driver", "D:\\Dektop backup 23 march 2016\\Selenium\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        
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
        driver.get("http://10.75.162.162:98/(S(lwdfswcendtmmug5gkn0amxn))/Account/FrmLogin.aspx");
        Thread.sleep(3000);
        
        //Find User ID
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[6]/td/input")).sendKeys("sapancha");
        //driver.findElement(By.cssSelector("#txtUserID")).sendKeys("sapancha");
        driver.findElement(By.id("txtUserID")).sendKeys("sapancha");
        
        //Click on portal button
        driver.findElement(By.cssSelector("#btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Click on Finance
        //driver.findElement(By.cssSelector("li.static:nth-child(5)>a:nth-child(1)")).click();
        driver.findElement(By.xpath("html/body/form/div[3]/div[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div[1]/ul/li[5]/a")).click();
                                     
        //MouseHover on TimeCard
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = driver.findElement(By.linkText("Timecard"));
		Thread.sleep(3000);
		
		//MouseHover on Timecard
		actions.moveToElement(menuHoverLink).perform();
		//WebElement subLink = driver.findElement(By.cssSelector("li.static:nth-child(5) > ul > li:nth-child(5)>a"));
		WebElement subLink = driver.findElement(By.xpath("html/body/form/div[3]/div[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div[1]/ul/li[5]/ul/li[5]/a"));
		Thread.sleep(2000);
		
		//MouseHover on TimeCard Summary
		actions.moveToElement(subLink).perform();
		//WebElement subLink1 = driver.findElement(By.cssSelector("li.static:nth-child(5) > ul > li:nth-child(5)>ul>li:nth-child(1)>a"));
		WebElement subLink1 = driver.findElement(By.xpath("html/body/form/div[3]/div[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div[1]/ul/li[5]/ul/li[5]/ul/li[1]/a"));
		//WebElement subLink1 = driver.findElement(By.cssSelector("#Menu_CAP/:submenu/:95>li:nth-child(1)>a:nth-child(1)"));
		//WebElement subLink1 = driver.findElement(By.cssSelector("#Menu_CAP/:submenu/:95>li:nth-child(1)>a:nth-child(1)"));
		//.click().build().perform()
		Thread.sleep(2000);
		actions.moveToElement(subLink1).click().build().perform();
		Thread.sleep(2000);
		
		//Switch to frame
		driver.switchTo().frame(driver.findElement(By.id("frmapplications")));
		
	
		Thread.sleep(3000);
	
		Robot robot = new Robot();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_ALT);
		 robot.delay(400);
		Thread.sleep(3000);
		
		
		//Select period
		WebElement period = driver.findElement(By.cssSelector("#ddlMonths"));
		Select option = new Select(period);
		option.selectByValue("6");
	
		Thread.sleep(3000);
		
		
		//Find New and click
		//driver.findElement(By.cssSelector("#grvTimecardSummary_ctl06_lnkTimevcardID")).click();
					//						 #grvTimecardSummary_ctl01_lnkTimevcardID
		
		
		
		for(int i=2;i<=6;i++)
		{
			Thread.sleep(3000);
			
			String TimeCard = driver.findElement(By.cssSelector("#grvTimecardSummary_ctl0"+i+"_lnkTimevcardID")).getText();
		 System.out.println("in for loop...."+TimeCard);
		 Thread.sleep(3000);
		
		if (TimeCard.equals("NEW"))
		{
			driver.findElement(By.cssSelector("#grvTimecardSummary_ctl0"+i+"_lnkTimevcardID")).click();
			
			Thread.sleep(3000);
			
			//Search for project
			driver.findElement(By.cssSelector("#grvTimeCard_ctl02_txtProject")).sendKeys("100223709" + Keys.ENTER);
		
		//driver.findElement(By.linkText("NEW")).click();
		
		//List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "NEW" + "')]"));
		//Assert.assertTrue("Text not found!", list.size() > 0);
		
			Thread.sleep(3000);
		
	// Check if MonthDateMon is displayed on the WebPage
		WebElement MonthDateMon = driver.findElement(By.id("grvTimeCard_ctl02_txtMonday"));

		Boolean MonthDateMonIsDisplayed = MonthDateMon.isDisplayed();

		if (MonthDateMonIsDisplayed == true) {
		System.out.println("MonthDate Mon is displayed");
		
		}

		// Check if MonthDateMon is not enabled on the WebPage

		Boolean MonthDateMonIsEnabled = MonthDateMon.isEnabled();

		if (MonthDateMonIsEnabled == true) {
		System.out.println("MonthDate Mon is enabled");
		MonthDateMon.sendKeys("9");
		}
		else{}
		
		
	// Check if MonthDateTues is displayed on the WebPage
				WebElement MonthDateTues = driver.findElement(By.id("grvTimeCard_ctl02_txtTuesday"));

				Boolean MonthDateTuesIsDisplayed = MonthDateTues.isDisplayed();

				if (MonthDateTuesIsDisplayed == true) {
				System.out.println("MonthDate Tues is displayed");
				
				}

				// Check if MonthDateTues is not enabled on the WebPage

				Boolean MonthDateTuesIsEnabled = MonthDateTues.isEnabled();

				if (MonthDateTuesIsEnabled == true) {
				System.out.println("MonthDate Tues is enabled");
				MonthDateTues.sendKeys("9");
				}
				else{}
				
		
	// Check if MonthDateWed is displayed on the WebPage
				WebElement MonthDateWed = driver.findElement(By.id("grvTimeCard_ctl02_txtWednesday"));

				Boolean MonthDateWedIsDisplayed = MonthDateWed.isDisplayed();

				if (MonthDateWedIsDisplayed == true) {
				System.out.println("MonthDate Wed is displayed");
				}
				
	            // Check if MonthDateWed is not enabled on the WebPage

				Boolean MonthDateWedIsEnabled = MonthDateWed.isEnabled();

				if (MonthDateWedIsEnabled == true) {
				System.out.println("MonthDate Wed is enabled");
				MonthDateWed.sendKeys("9");
				}
				else {}
				
				
	// Check if MonthDateThurs is displayed on the WebPage
				WebElement MonthDateThurs = driver.findElement(By.id("grvTimeCard_ctl02_txtThursday"));

				Boolean MonthDateThursIsDisplayed = MonthDateThurs.isDisplayed();

				if (MonthDateThursIsDisplayed == true) {
				System.out.println("MonthDate Thurs is displayed");
				}
				
	            // Check if MonthDateThurs is not enabled on the WebPage

				Boolean MonthDateThursIsEnabled = MonthDateThurs.isEnabled();

				if (MonthDateThursIsEnabled == true) {
				System.out.println("MonthDate Thurs is enabled");
				MonthDateThurs.sendKeys("9");
				}
				else {}			
		
		
	// Check if MonthDateFri is displayed on the WebPage
				WebElement MonthDateFri = driver.findElement(By.id("grvTimeCard_ctl02_txtFriday"));

				Boolean MonthDateFriIsDisplayed = MonthDateFri.isDisplayed();

				if (MonthDateFriIsDisplayed == true) {
				System.out.println("MonthDate Fri is displayed");
				}
				
	            // Check if MonthDateFri is not enabled on the WebPage

				Boolean MonthDateFriIsEnabled = MonthDateFri.isEnabled();

				if (MonthDateFriIsEnabled == true) {
				System.out.println("MonthDate Fri is enabled");
				MonthDateFri.sendKeys("9");
				}
				else {}			
		
		
		
		/*
		//Insert Working Hours for first day of the week
		driver.findElement(By.cssSelector("#grvTimeCard_ctl02_txtMonday")).sendKeys("9");
		
		//Insert Working Hours for second day of the week
		driver.findElement(By.cssSelector("#grvTimeCard_ctl02_txtTuesday")).sendKeys("9");
		
		//Insert Working Hours for third day of the week
		driver.findElement(By.cssSelector("#grvTimeCard_ctl02_txtWednesday")).sendKeys("9");
		
		//Insert Working Hours for fourth day of the week
		driver.findElement(By.cssSelector("#grvTimeCard_ctl02_txtThursday")).sendKeys("9");
		
		//Insert Working Hours for fifth day of the week
		driver.findElement(By.cssSelector("#grvTimeCard_ctl02_txtFriday")).sendKeys("9");
		
		*/
		
		Thread.sleep(3000);
		
		//Click on Submit
		driver.findElement(By.cssSelector("#btnSubmit")).click();
		/*}
		
		else{
			
			System.out.println("new Not found....");
		}
		}*/
		Thread.sleep(5000);
		
		
		//Capture TimeCard Number
		String TCID = driver.findElement(By.cssSelector("#grvTimecardSummary_ctl0"+i+"_lnkTimevcardID")).getText();
														 
		Thread.sleep(2000);
        System.out.println("MY Ticket id...."+TCID);
        
        Thread.sleep(2000);
		driver.switchTo().defaultContent();
	
		//Log Out
		driver.findElement(By.xpath("//a[@id='btnlogout']")).click();
        
        
        //login with approver
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[6]/td/input")).sendKeys("Kukamat");
        //driver.findElement(By.cssSelector("#txtUserID")).sendKeys("Kukamat");
        driver.findElement(By.id("txtUserID")).sendKeys("Kukamat");
        
        //Click on portal button
        driver.findElement(By.cssSelector("#btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        //Click on Finance
        //driver.findElement(By.cssSelector("li.static:nth-child(5)>a:nth-child(1)")).click();
        driver.findElement(By.xpath("html/body/form/div[3]/div[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div[1]/ul/li[5]/a")).click();
                                     
        //MouseHover on TimeCard
		Actions actions1 = new Actions(driver);
		WebElement menuHoverLink1 = driver.findElement(By.linkText("Timecard"));
		Thread.sleep(3000);
		
		//MouseHover on Timecard
		actions1.moveToElement(menuHoverLink1).perform();
		//WebElement subLink = driver.findElement(By.cssSelector("li.static:nth-child(5) > ul > li:nth-child(5)>a"));
		WebElement subLink3 = driver.findElement(By.xpath("html/body/form/div[3]/div[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div[1]/ul/li[5]/ul/li[5]/a"));
		Thread.sleep(2000);
		
		//MouseHover on TimeCard Summary
		actions.moveToElement(subLink3).perform();
		//WebElement subLink1 = driver.findElement(By.cssSelector("li.static:nth-child(5) > ul > li:nth-child(5)>ul>li:nth-child(2)>a"));
		WebElement subLink11 = driver.findElement(By.xpath("html/body/form/div[3]/div[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div[1]/ul/li[5]/ul/li[5]/ul/li[2]/a"));
		//WebElement subLink1 = driver.findElement(By.cssSelector("#Menu_CAP/:submenu/:95>li:nth-child(1)>a:nth-child(1)"));
		//WebElement subLink1 = driver.findElement(By.cssSelector("#Menu_CAP/:submenu/:95>li:nth-child(1)>a:nth-child(1)"));
		//.click().build().perform()
		Thread.sleep(2000);
		actions.moveToElement(subLink11).click().build().perform();
		Thread.sleep(2000);
		
		//Switch to frame
		driver.switchTo().frame(driver.findElement(By.id("frmapplications")));
		Thread.sleep(4000);
		
		
		 robot = new Robot();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_ALT);
		 robot.delay(400);
		Thread.sleep(3000);
		
        
		//find TCID
		//String Timecard1=driver.findElement(By.cssSelector("#grvTimecardSummary_ctl0"+i+"_lnkTimevcardID")).getText();
		
        driver.findElement(By.linkText(TCID)).click();
        
        
        Thread.sleep(3000);
        //Click on Approve
        driver.findElement(By.cssSelector("#btnApprove")).click();
	
		
		Thread.sleep(15000);
		driver.switchTo().defaultContent();
		
		//Log Out
		driver.findElement(By.xpath("//a[@id='btnlogout']")).click();
		
		
		//aGAIN lOGIN
		Thread.sleep(5000);
		 //Find User ID
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[6]/td/input")).sendKeys("sapancha");
        //driver.findElement(By.cssSelector("#txtUserID")).sendKeys("sapancha");
        driver.findElement(By.id("txtUserID")).sendKeys("sapancha");
        
        //Click on portal button
        driver.findElement(By.cssSelector("#btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Click on Finance
        //driver.findElement(By.cssSelector("li.static:nth-child(5)>a:nth-child(1)")).click();
        driver.findElement(By.xpath("html/body/form/div[3]/div[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div[1]/ul/li[5]/a")).click();
                                     
        //MouseHover on TimeCard
		Actions actions2 = new Actions(driver);
		WebElement menuHoverLink2 = driver.findElement(By.linkText("Timecard"));
		Thread.sleep(3000);
		
		//MouseHover on Timecard
		actions2.moveToElement(menuHoverLink2).perform();
		//WebElement subLink = driver.findElement(By.cssSelector("li.static:nth-child(5) > ul > li:nth-child(5)>a"));
		WebElement subLink2 = driver.findElement(By.xpath("html/body/form/div[3]/div[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div[1]/ul/li[5]/ul/li[5]/a"));
		Thread.sleep(2000);
		
		//MouseHover on TimeCard Summary
		actions.moveToElement(subLink2).perform();
		//WebElement subLink1 = driver.findElement(By.cssSelector("li.static:nth-child(5) > ul > li:nth-child(5)>ul>li:nth-child(1)>a"));
		WebElement subLink4 = driver.findElement(By.xpath("html/body/form/div[3]/div[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div[1]/ul/li[5]/ul/li[5]/ul/li[1]/a"));
		//WebElement subLink1 = driver.findElement(By.cssSelector("#Menu_CAP/:submenu/:95>li:nth-child(1)>a:nth-child(1)"));
		//WebElement subLink1 = driver.findElement(By.cssSelector("#Menu_CAP/:submenu/:95>li:nth-child(1)>a:nth-child(1)"));
		//.click().build().perform()
		Thread.sleep(2000);
		actions.moveToElement(subLink4).click().build().perform();
		Thread.sleep(2000);
		
		//Switch to frame
		driver.switchTo().frame(driver.findElement(By.id("frmapplications")));
		
	
		Thread.sleep(3000);
	
		 robot = new Robot();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_ALT);
		 robot.delay(400);
		Thread.sleep(3000);
		
		
		//Select period
		WebElement period1 = driver.findElement(By.cssSelector("#ddlMonths"));
		Select option1 = new Select(period1);
		option1.selectByValue("6");
		
		Thread.sleep(3000);
		
		
		//Find New and click
		//driver.findElement(By.cssSelector("#grvTimecardSummary_ctl06_lnkTimevcardID")).click();
					//						 #grvTimecardSummary_ctl01_lnkTimevcardID
		
		}
		
		else{
			
			System.out.println("new Not found....");
			
			Thread.sleep(3000);
			
			driver.switchTo().defaultContent();
			//Log Out
			driver.findElement(By.xpath("//a[@id='btnlogout']")).click();
		}
		}
		
		
		
        
        
        
        
        
        
        
        
        
        
        
		
		
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
