package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class unionbank {

	public static void main(String[] args) throws InterruptedException {
		String expected = "222.44";
		//open the browser
        FirefoxDriver driver = new FirefoxDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //launch the URL
        driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
        //hold for 10 secs
        Thread.sleep(3000);
        //find loan amount text box 
        WebElement loanamount = driver.findElement(By.id("loanamount"));
        //enter loan amount
        loanamount.sendKeys("10000");
        // find Interest Rate text box 
        WebElement interestrate = driver.findElement(By.id("rate"));
        //enter interest rate 
        interestrate.sendKeys("12");
        // find Tenure text box 
        WebElement tenure = driver.findElement(By.id("pmonths"));
        //enter tenure
        tenure.sendKeys("60");
        //find calculate button
        WebElement calculate = driver.findElement(By.id("Button1"));
        //click on calculate button
        calculate.click();
        		
        //hold for 10 secs
        Thread.sleep(5000);
        
        //find EMI text box
        WebElement EMI = driver.findElement(By.id("EMI"));
        //Extract data from EMI text box
        String actual = EMI.getAttribute("value");
        //print emi
        System.out.println("The EMI is "  + actual);
        
       // validation
        if (actual.equals(expected))
        {
        	System.out.println("The test case has passed");
        }
        else
        {
        	System.out.println("The test case is failed");
        }
	    
        //close browser
        driver.close();
        
	}

}
