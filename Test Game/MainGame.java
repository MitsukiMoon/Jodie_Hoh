import java.util.Scanner;
public class MainGame
{
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ("Please enter a sentence");
		d
		sentence = keyboard.nextLine();
		
		replace();
	
		System.out.println (sentence);
		
		
	}
	
	public static void replace()
	{
		while(sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a") + 1);
		}
		
	}
	
	
}
	