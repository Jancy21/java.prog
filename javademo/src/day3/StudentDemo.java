package day3;

public class StudentDemo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Student s1=new Student ();
		s1.setSid(37);		
		s1.setScity("canada");
		s1.setSname("Jancy");
		System.out.println(s1);
		
		
		Student s2= new Student();
		s2.setSid(87);		
		s2.setScity("chennai");
		s2.setSname("Sanjana");
		System.out.println(s2);
		
		Student s3=new Student();
		s3.setSid(16);		
		s3.setScity("newyork");
		s3.setSname("janu");
		System.out.println(s3);

	}

}
