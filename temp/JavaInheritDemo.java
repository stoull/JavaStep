public class JavaInheritDemo {
	public static void main(String args[])
	{
		Dog littleDog = new Dog();
		littleDog.showAgeInformation();	
	}	
}

 class Animal {
	public int age;
	public Animal(){
		this.age = 100;
	}
}

 class Dog extends Animal {
	public int age;
	public void setAge(int age){
		this.age = age;
	}
	public void showAgeInformation(){
		this.age = 50;
		System.out.println("This.age : " + this.age + " Super.age : " + super.age);
	}
}
