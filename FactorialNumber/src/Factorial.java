import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the factorial number");
		int N=scan.nextInt();
		int Multiplication=1;
	for(int i=1;i<=N;i++)
	{
		Multiplication=Multiplication*i;
		}
	System.out.println(" Factorial is " + Multiplication);
	}

}
