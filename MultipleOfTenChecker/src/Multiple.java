import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Multiple");
		int Multiple=scan.nextInt();
		checkMultiple(Multiple);
	}
	public static void checkMultiple(int Multiple)
	{
		if(Multiple%10==0)
		{
			System.out.println("It is a Multiple");
			
		}
		else
		{
			System.out.println("It is not a Multiple");
		}
	}

}
