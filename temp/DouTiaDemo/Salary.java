public class Salary extends Employee {
	private double salary;
	public Salary(String name, String address, String number, double salary)
	{
		super(name,address,number);
		this.salary = salary;		
	}

	public void checkSalary()
	{
		System.out.println("邮寄支票给： " + getName() + getAddress() + "工资为: " + salary);
	}
	
	public void setSalary(double salary)
	{
		salary = salary;
	}

	public double getSalary()
	{
		return salary;
	}
	public void computerSalary()
	{
		System.out.println(getName() + "工资为：" + getSalary());
	}
}
