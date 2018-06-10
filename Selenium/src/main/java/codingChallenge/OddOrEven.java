package codingChallenge;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args)
	{
		int number;
		
		Scanner scobj=new Scanner(System.in);
		System.out.println("Enter the number");
		number=scobj.nextInt();
		if(number%2==0)
		{
			System.out.println("The entered number is even number");
		}
		else
			System.out.println("The entered number is odd number");
		
		
	}

}
