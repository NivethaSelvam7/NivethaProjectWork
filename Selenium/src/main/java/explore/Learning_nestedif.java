package explore;

public class Learning_nestedif {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int character='G';
		char c=(char) character;
		if ((character>=65 && character<=90) && (character>=97 && character<=122))
		{
			if((character>=65 && character<=90))
				System.out.println("the character is Uppercase Alphabet"+c);
			else
				System.out.println("the character is Lowercase Alphabet"+c);
		}
		System.out.println(character);
		
	}

}
