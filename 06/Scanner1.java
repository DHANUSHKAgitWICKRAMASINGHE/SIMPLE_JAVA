//scanner1
import java.util.Scanner; 
public class Scanner1
{
	//main method
	public static void main (String args[])
	{
	Scanner input = new Scanner (System.in);
	System.out.println("Enter temperture in Fahrenheit ");
	double Fahrenheit = input.nextDouble();
	double Celsius = (Fahrenheit-32)/1.8;
	
	System.out.println("Temperture in celsius = "+Celsius);
	

	

	}
}