public class AbstractDemo
{
	public static void main(String args[])
	{
		Salary salary = new Salary("AChang","ShenZhen","0023",5346.23);
		salary.checkMail();
		
		String des = salary.getDescrible();
		System.out.println(des);
	}
}
