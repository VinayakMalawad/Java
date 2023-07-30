import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number till which it as to be printed");
		int n=scan.nextInt();
		Divisible(n);
		
	}
	public static void Divisible(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)
				System.out.println(i);
		}
	}

}
