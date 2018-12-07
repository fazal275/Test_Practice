package training;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calcxml_absolutecss {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//Open the browser
				FirefoxDriver driver = new FirefoxDriver();
				
				//Launch the browser
				driver.get("http://www.calcxml.com/calculators/mortgage-calculator?");
				//maximize
				driver.manage().window().maximize();
				//Find the loan amount
				WebElement loan = driver.findElement(By.cssSelector("html body.pure-skin-cx.hom03 div#wrapper.pure-g-r div#main.pure-u-1 div.content form.pure-form.pure-form-aligned div.pure-g-r div.pure-u-3-5 fieldset div.pure-control-group input#loanAmount"));
				//Enter the loan amount 
				loan.clear();
				loan.sendKeys("100000");
				//Find the the interest 
				WebElement interest = driver.findElement(By.cssSelector("html body.pure-skin-cx.hom03 div#wrapper.pure-g-r div#main.pure-u-1 div.content form.pure-form.pure-form-aligned div.pure-g-r div.pure-u-3-5 fieldset div.pure-control-group input#interestRate"));
				//Enter the interest
				interest.clear();
				interest.sendKeys("12");
				
				//find the tenure
				WebElement tenure = driver.findElement(By.cssSelector("html body.pure-skin-cx.hom03 div#wrapper.pure-g-r div#main.pure-u-1 div.content form.pure-form.pure-form-aligned div.pure-g-r div.pure-u-3-5 fieldset div.pure-control-group input#termMonths"));
				//Enter the tenure
				tenure.clear();
				tenure.sendKeys("60");
				//Find the Submit button
				WebElement submit = driver.findElement(By.cssSelector("html body.pure-skin-cx.hom03 div#wrapper.pure-g-r div#main.pure-u-1 div.content form.pure-form.pure-form-aligned div.pure-g-r div.pure-u-3-5 div.btnLine a button.pure-button.pure-button-primary"));
				//Click on the submit button
				submit.click();	
				
				Thread.sleep(4000);
				//Find the result element
				WebElement result = driver.findElement(By.cssSelector("html body.pure-skin-cx.hom03 div#wrapper.pure-g-r div#main.pure-u-1 div.content form.pure-form.pure-form-aligned div.pure-g-r div.pure-u-3-5 p.resultText"));
				//Extract the emi out of the result
				String emi_result = result.getText();
				System.out.println("The result is "+emi_result);
				//String[] array = emi_result.split(" ");
				//System.out.println("The actual emi is "+ array[5]);
				
				String emi = emi_result.split(" ")[5];
				System.out.println("The actual emi is "+ emi);
				//Close browser
				driver.close();
				
	    }
	}