
//Scanner2
import java.util.Scanner; 
public class Scanner2
{
	//main method
	public static void main (String args[])
	{
	Scanner input = new Scanner (System.in);
	System.out.println("Enter integer number ");

	int numb = input.nextInt();
	int hundreds =numb/100;
	System.out.println("Hundreds = "+hundreds);
	int t10z =numb%100/10 ;
	System.out.println("Tens = "+t10z);
	int o01z =numb%100%10 ;
	System.out.println("Ones = "+o01z);
	

	

	}
}