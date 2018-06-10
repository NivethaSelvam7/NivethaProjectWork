package explore;

public class Learning_switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String  operation="multiply";
int n1=257;
float n2=56.f;
switch(operation)
{
case "add":
	System.out.println("Addition"+(n1+n2));
	break;
case "Sub":
	System.out.println("Sub"+(n1-n2));
	break;
case "multiply":
	System.out.println("Multiply:"+"\t"+(n1*n2));
	break;
case "Divide":
	System.out.println("Division"+(n1/n2));
	break;
case "Modulo":
	System.out.println("Modulus"+(n1%n2));
	break;
default:
	System.out.println("invalid operation.");
}
	}

}
