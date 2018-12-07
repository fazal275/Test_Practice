package training;

import java.util.Scanner;

public class FrnhtToClcs {

	public static void main(String[] args) {
		float temperature ;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Frnht");
		temperature = in.nextInt();
		
		temperature = ((temperature -32)*5)/9;
		
		System.out.println("Temperature in Clcs= " + temperature);

	}

}
