package day1;

public class PrimitiveDataTypesDemo 
{
	public static void main(String[] args)
	{
		byte byteMax =127;
		byte byteMin =-128;
		System.out.println("Min range of byte is"+ byteMin+ "Max range of bytes is"+byteMax);
		
		short shortMax=32767;
		short shortMin=-32768;
		System.out.println("Minshort range of byte is"+shortMin+"Maxshort range of byte is"+shortMax);
		
		int maxint =2147483647;
		int minint=-2147483648;
		System.out.println("minint rangr of byte id"+minint+ "Maxint range of byte is"+maxint);
		
		long maxlong=9223372036854775807L;
		long minlong=-9223372036854775808L; 
		System.out.println("Minlong range of byte is"+minlong+"Maxlong range of byte is"+maxlong);
		
		float f=3234.141243278345f; 
		double d=3456.14124512345678902345678914f; 
		System.out.println("flot value is"+f+"double value is"+d);
		
		boolean flag=false;
		System.out.println("boolean value is"+flag);
	}

}
