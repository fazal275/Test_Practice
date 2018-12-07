package training;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bing {

	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the search Keyword");
		String search_keyword = in.next();
		in.close();
		//Open the browser
		FirefoxDriver driver = new FirefoxDriver();
		//maximise
		driver.manage().window().maximize();
		//launch URL
		driver.get("http://www.bing.com");
		//find search textbox
		WebElement search_word = driver.findElement(By.id("sb_form_q"));
		//Enter value into the search textbox
		search_word.sendKeys(search_keyword);
		//find the search icon
		WebElement icon = driver.findElement(By.name("go"));
		//Click on the search icon
		icon.click();
		
		//find the result element
		WebElement result = driver.findElement(By.className("sb_count"));
		
		//Extract the number from the result 
		String count = result.getText();
		String actual = count.replace(" RESULTS", "");
		System.out.println("The number of result is "+ count);
		System.out.println("The actual result is "+ actual);
		
		driver.close();
	}

}
