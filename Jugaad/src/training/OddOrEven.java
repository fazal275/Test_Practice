package training;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		int x;
		System.out.println("Enter a no. to check if it is odd or even");
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		
		if (x % 2 == 0)
			System.out.println("Entered No. is Even");
		else
			System.out.println("Entered No. is Odd");
			

	}

}
