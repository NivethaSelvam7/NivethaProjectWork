package codingChallenge;

import java.util.Scanner;

public class MutiplicationTable {
	public static void main (String[] args)
	{
	
		int n1,n2;
		Scanner scobj=new Scanner(System.in);
		System.out.println("Enter the Multiplication table Number"+"\n");
		n1= scobj.nextInt();
		System.out.println("Enter nth number of table");
		n2= scobj.nextInt();
		for(int i=1;i<=n2;i++)
		{
			System.out.println(n1+"*"+i+"="+(n1*i));
		}
		
		 
	}

}
