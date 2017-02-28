public class Employee {
	private String name;
	private String address;
	private String number;
	public Employee(String name, String address, String number)
	{
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public void checkSalary()
	{	
		System.out.println(name + address);
	}
	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public String getNumber()
	{
		return number;
	}

}
