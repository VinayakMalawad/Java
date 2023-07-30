import java.util.Scanner;

public class FactorNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the factor number");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			
		System.out.println(" Factor is " +i);
			}

	}

	}
}
