import java.util.Scanner;

public class Piya {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Breed");
		String Character=scan.next();
		getCharacter(Character);
		

	}
	public static void getCharacter(String Character)
	{
		switch(Character)
		{
		case "p01" : System.out.println("Piya is Dumbo");
		break;
		case "p02" : System.out.println("Piya is Shit");
		break;
		case "po3" : System.out.println("Piya is Asshole");
		break;
		default : System.out.println("Piya is Dog");
		}
	}

}

