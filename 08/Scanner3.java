//Scanner3
import java.util.Scanner; 
public class Scanner3
{
	//main method
	public static void main (String args[])
	{
	Scanner input = new Scanner (System.in);
	System.out.println("Enter number ");

	int numb = input.nextInt();

	double sqrt =Math.sqrt(numb);

	System.out.println("Square root of given number= "+sqrt);
	
	

	

	}
}