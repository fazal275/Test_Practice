package ReadExcel;

import java.util.Scanner;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Method {
	public void  m1(int a)
	{
		System.out.println("Without argument method " +a);
	}
	static int interest(int a,int b,int c)
	{
		int result =  a*b*c/100;
		return result;
	}
	public static void main(String[] args) {
	
		
		//FirefoxDriver driver = new FirefoxDriver();
		Method m = new Method();
		int x = 55;
		m.m1(x);
		int p,r,t,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter P R T");
		p =  sc.nextInt();
		r = sc.nextInt();
		t =  sc.nextInt();
		
		i = interest(p,r,t);
		System.out.println("interest "+i);
	
		
		

	}

}
