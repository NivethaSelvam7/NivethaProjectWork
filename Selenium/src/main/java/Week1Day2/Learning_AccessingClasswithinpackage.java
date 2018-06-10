package Week1Day2;

public class Learning_AccessingClasswithinpackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learning_AccessingClass LAC= new Learning_AccessingClass();
		System.out.println(LAC.addition(4,7));
		System.out.println(LAC.subtraction(30,27));
		System.out.println(LAC.multiplication(34,2));
		//divide method is private . So cannot be accessed outside the class
		System.out.println(LAC.divide(72,5));
	}

}
