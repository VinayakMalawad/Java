import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Grade");
		int Grade=scan.nextInt();
		checkGrade(Grade);
	}
	public static void checkGrade(int Grade)
	{
		if(Grade>50)
		{
			System.out.println("Student is Passed");
		}
		else
		{
			System.out.println("Student is Failed");
		}
	}
}
