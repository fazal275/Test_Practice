package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clear_unionbank {

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		FirefoxDriver driver = new FirefoxDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		// launch URL
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		//hold for 10 secs
        Thread.sleep(3000);
       
        //find loan amount text box
        WebElement loanamount = driver.findElementByCssSelector("#loanamount");
        
        // clear text box
        loanamount.clear();
        
        // enter loan amount
        loanamount.sendKeys("100000");
        
        // find Interest Rate text box 
        WebElement InterestRate = driver.findElement(By.id("rate"));
        
        // clear text box
        InterestRate.clear();
        
        // enter loan amount
        InterestRate.sendKeys("12");
        
        // find tenure text box
        WebElement tenure = driver.findElement(By.id("pmonths"));
        
        // clear text box
        tenure.clear();
        
        // enter tenure
        tenure.sendKeys("60");
        
        // find calculate button
        WebElement calculate = driver.findElement(By.id("Button1"));
        
        // click on calculate Button
        calculate.click();
        
        //hold for 10 secs
        Thread.sleep(3000);
        
        //find EMI text box
        WebElement EMI = driver.findElement(By.id("EMI"));
        
      //Extract data from EMI text box
        String EMI_result = EMI.getAttribute("value");
        //System.out.println("The result is "+ EMI_result);
        
        
        //String[] array = EMI_result.split(" ");
       // System.out.println("The actual emi is "+ array[5]);
        
        
        String emi = EMI_result.split("") [2];
		System.out.println("The actual emi is "+ emi);
		//Close browser
		driver.close();
        
        
        
        
        
        
        
	}

}
