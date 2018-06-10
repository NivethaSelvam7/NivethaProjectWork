package codingChallenge;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact=1, number;
		Scanner scobj= new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		number=scobj.nextInt();
		for(int i=number;i>=1;i--)	
		{  
		fact=fact*i;
		}
		//System.out.println(fact);
		System.out.println("The factorial of "+ number+ " is    "+fact);
	}

}
