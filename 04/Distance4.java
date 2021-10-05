//Distance04
public class Distance4
{
	//main method
	public static void main (String args[])
	{
	int mile = 26, yard = 385;
	double kilometer;
	final double 	M_KM = 1.609;
	final double 	MY= 1760.0;

	double M_in_KM = (mile*M_KM); //Mile in kelometer
	double Y_in_KM = (yard/MY*M_KM); //Yard in kelometer
	kilometer = (M_in_KM+Y_in_KM);
	


	
	System.out.println("Distance in kilometer = "+kilometer);
	

	

	}
}