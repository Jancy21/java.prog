package day3;

public class OopsConceptDemo 
{
		private int SerialNum;
		private String name;
		private int age;
		public int getSerialNum()
		{
			return SerialNum;
		}
		public void setSerialNum(int SerialNum)
		{
			this.SerialNum=SerialNum;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setAge(int age)
		{
			this.age=age;
		}
		public String toString() {
			return "OopsConceptDemo [Serial Number="+SerialNum+",name="+name+",age="
+age+"]";
			}
		
	

}
