import java.util.Scanner;
public class EX_01
{
	static double length, width;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_01 calculate = new EX_01();

		System.out.println ("Please enter length:");
		
		length = keyboard.nextFloat();
		
		String place1 = keyboard.nextLine();
		
		System.out.println ("Please enter width:");
		
		width = keyboard.nextFloat();
		
		String place2 = keyboard.nextLine();
	

		calcP();
		print();
		
	}
	
	public static void calcP ()
	{
		perimeter = 2*length + 2* width;
	
	}
	
	public static void print ()
	{
		System.out.printf("Your rectangle is %10.5f sq ft around. \n", perimeter);
	}
	
	
}
	
	
	
	
