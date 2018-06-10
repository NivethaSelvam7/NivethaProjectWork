package codingChallenge;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,rem,actual,temp = 0;
		Scanner scobj=new Scanner(System.in);
		System.out.println("Enter the number to check the number is palindrome");
		number= scobj.nextInt();
		actual=number;
		
		while(number!=0)
		{
			rem=number%10;
			number=number/10;
			temp=temp*10 +rem;
			
		}
		
		if(temp==actual)
		{
			System.out.println("The Entered number is Palindrome");
		}
		else
			System.out.println("The Entered number is not a palindrome");

	}

}
