import java.util.Scanner;

public class Divisibleby2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number till which it has to be printed");
		int n=scan.nextInt();
		Divisible(n);
		
	}
	public static void Divisible(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}

}
