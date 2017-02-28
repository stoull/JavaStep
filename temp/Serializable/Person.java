import java.util.*;

public class Person implements Serializable{
	private String name = null;
	private Integer age = null;
	private Gender gender = null;
	
	public Person(){
		System.out.println("none-arg constructor");
	}

	public Person(String name, Integer age, Gender gender)
	{
		System.out.println("have-arg constructor");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}
	public Integer getAge()
	{
		return age;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
	public Gender getGender()
	{
		return gender;
	}
	
	@Override
	public String toString()
	{
		return "[" + name + "," + age + "," + gender + "]";
	}
}
