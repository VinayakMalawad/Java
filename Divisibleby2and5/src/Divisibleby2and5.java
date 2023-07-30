import java.util.Scanner;

public class Divisibleby2and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers to be printed");
		int n=scan.nextInt();
		Divisible(n);
	}
	public static void Divisible(int n)
	{
		int count=0;
		for(int i=0;i<=n;i++)
		{
			if(i%2==0 && i%5==0)
			{
				System.out.println(i);
			count++;
		}
		}
		System.out.println("The count that printed between 0 and "+n+" are " +count);
	
}
}