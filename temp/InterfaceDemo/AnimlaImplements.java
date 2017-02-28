public class AnimlaImplements implements Animal{
	private int age;
	private String style;
	private int leg;
	
	public AnimlaImplements(int age, String style, int leg)
	{
		this.age = age;
		this.style = style;
		this.leg = leg;
	}	

	public void eat()
	{
		System.out.println("Eat");
	}
	
	public void run ()
	{
		System.out.println("It's have " + " legs " + "and run now!");
	}	
}
