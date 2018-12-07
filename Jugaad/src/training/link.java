package training;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class link {

	public static void main(String[] args) throws InterruptedException {
		/*
			//Open in Firefox
	        FirefoxDriver driver = new FirefoxDriver();
	      
	        //Maximize window
	        driver.manage().window().maximize();
	        
	        //launch TimeCard test URL
	        driver.get("http://www.seleniumhq.org/");
	        Thread.sleep(5000);
	        
	        driver.findElement(By.partialLinkText("Download ")).click();
	        */
	        
	    List<String> valArray = new ArrayList<String>();
	        
	        valArray.add("NEW");
	        valArray.add("IN03 - 11142663");
	        valArray.add("NEW");
	        valArray.add("IN03 - 11142664");
	        
	        int max = 0;
	        
	        //String [] strArr = valArray.get(0).trim().split("-");
		    //String val1 = strArr[1].trim();

	        //int max = Integer.parseInt(val1); 
	        
	        for(int i=0; i<valArray.size(); i++){
	        	if(valArray.get(i).trim().contains("-")){
	        	String [] strArray = valArray.get(i).trim().split("-");
	        	int num = Integer.parseInt(strArray[1].trim());
	        		if(num>max){
	        			max = num;
	        		}
	        	}
	        	
	        }
	        

	        System.out.println("Max Value >>>>"+max);
	        
	        
	        
	    
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
