import java.util.Scanner;

public class Divisibleby5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number till it has to be printed");
		int n=scan.nextInt();
		Divisible(n);
		

	}
	public static void Divisible(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
	
	count++;
			}
	}
	System.out.println("The number of numbers present between 0 and " +n+ " are " +count);
	}

	

}
