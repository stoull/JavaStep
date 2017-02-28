public abstract class Employee{
	private String name;
	private String address;
	private String jobNumber;
	
	public Employee(String name, String address, String jobNumber)
	{
		System.out.println("Constructing a Employee");
		this.name = name;
		this.address = address;
		this.jobNumber = jobNumber;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getAddress()
	{
		return address;
	}

	public void setJobNumber(String jobNumber)
	{
		this.jobNumber = jobNumber; 
	}
	public String getJobNumber()
	{
		return jobNumber;
	}
	
	public abstract String getDescrible();
}
