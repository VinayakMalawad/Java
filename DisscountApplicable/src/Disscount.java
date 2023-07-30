import java.util.Scanner;

public class Disscount {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Disscount amount");
		double purchaseAmount=scan.nextDouble();
		checkDisscount(purchaseAmount);

	}
	public static void checkDisscount(double purchaseAmount)
{
	if(purchaseAmount>100)
	{
	System.out.println("Disscount Applicable");
	}
	else
	{
		System.out.println("Disscount not Applicable");
	}
}
}
