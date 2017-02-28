public class Salary extends Employee
{
	private double salary;
	public Salary(String name, String address, String jobNumber, double salary)
	{
		super(name, address, jobNumber);
		setSalary(salary);
	}
	
	public void setSalary(double newSalary)
	{
		if (newSalary > 0)
		{
		        System.out.println("Before set Salary:" + newSalary);
			salary = newSalary;
		        System.out.println("After set Salary:" + this.salary);
		}
	}	
	public void checkMail()
	{
		System.out.println("这个员工的名字： " + getName() + "邮件：" + getAddress() + "工号： " + getJobNumber() + "工资：" + this.salary);
	}
	public String getDescrible()
	{
		String des = String.format("我叫： " + "%s 我的工号是： " + "%s", getName(), getJobNumber());
		return des;	
	}
}
