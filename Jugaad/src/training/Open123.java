package training;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Open123 {

	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		FirefoxDriver driver = new FirefoxDriver();
		//maximize the browser
		driver.manage().window().maximize();
		// launch the URL
		driver.get("https://www.google.co.in");
		
		//wait for page to load
		Thread.sleep(5000);
		
		//close the browser
		driver.close();
		
	}
}