package codingChallenge;

import java.util.Scanner;

public class Reverse_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number,temp = 0,rem;
		Scanner scobj=new Scanner(System.in);
		System.out.println("Enter the number to find reverse of the number");
		number= scobj.nextInt();
		while(number!=0)
		{
			rem = number%10;
			number=number/10;
			temp=temp*10 +rem;
			
		}
		
System.out.println("The Reverse of the number is :   "+temp);
	}

}
