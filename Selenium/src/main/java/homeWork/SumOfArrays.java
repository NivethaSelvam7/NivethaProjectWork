package homeWork;

import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		int sum=0;
		System.out.println("enter 10 elements");
	Scanner scanner=new Scanner(System.in);
	for (int i=0;i<10;i++)
	{
		a[i]=scanner.nextInt();
	}
	for (int i : a) {
		sum=sum+i;
		}
	System.out.println(sum);
	scanner.close();
		
	}

	


}
