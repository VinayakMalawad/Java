import java.util.Scanner;

public class Vending {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Brand");
		String productCode=scan.next();
		getProduct(productCode);
		

	}
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "p01" : System.out.println("KingFisher");
		break;
		case "p02" : System.out.println("Budweiser");
		break;
		case "po3" : System.out.println("Magnum");
		break;
		default : System.out.println("Old Monk");
		}
	}

}
