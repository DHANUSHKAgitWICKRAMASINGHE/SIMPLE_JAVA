//TypeCasting
public class TypeCasting
{
	//main method
	public static void main (String args[])
	{
	//Data tyeps

	System.out.println("Variables");
	char c = 'a';
	byte b = 50;
	short s = 2012;
	long l = 123456789876543L;
	int i = 123456789;
	float f = 3.14F;
	double d = 0.000001;

	System.out.println("c="+c);
	System.out.println("b="+b);
	System.out.println("s="+s);
	System.out.println("i="+i);
	System.out.println("l="+l);
	System.out.println("f="+f);
	System.out.println("d="+d);

	//Type Casting
	short s1 = (short)b;
	short s2 = (short)i; //incorrect result

	int m1 = (int)f; //fractional part is lost

	}
}
