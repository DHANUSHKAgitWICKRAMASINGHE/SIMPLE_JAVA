//Scanner4
import java.util.Scanner; 
public class Scanner4
{
	//main method
	public static void main (String args[])
	{
	String fname, lname;
	Scanner input = new Scanner (System.in);

	System.out.println("Enter your first name ");

	fname= input.nextLine();

	System.out.println("Enter your last name ");

	lname= input.nextLine();

	System.out.println("Hi,  "+fname+" "+lname+" "+"Welcome to java");
	
	

	

	}
}