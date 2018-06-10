package Week1Day2;

public class Learning_WhileLoopSumOfdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit=238723;
		int quotient,remainder,sum=0;
		while(digit>0)
		{
			quotient=digit/10;
			remainder=digit%10;
			sum=sum+remainder;
			digit=quotient;
			
		}
		System.out.println(sum);

	}

}
