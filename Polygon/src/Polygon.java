import java.util.Scanner;
public class Polygon {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("The Polygon sides are");
		int sides=scan.nextInt();
		identifyPolygon(sides);
		
	}
	public static void identifyPolygon(int sides)
	{
		if(sides==3)
			System.out.println("It is a Triangle");
	

		else if(sides==4)
			System.out.println("It is a Square or Rectangle");
		
		else if(sides==5)
			System.out.println("It is a Pentagon");
		else if(sides==6)
			System.out.println("It is a Hexagon");
		else
			System.out.println("It is a Quadrilateral");
		}
		

}
