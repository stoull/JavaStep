public class JavaConstructorDemo{
	public static void main(String args[])
	{
		SubClass subClass = new SubClass();
		SubClass sub2Class = new SubClass(23);	
	}
}

class SuperClass{
	private int a;
	SuperClass(){
		System.out.println("SuperClass()");
	}	
	SuperClass(int a) {
		this.a = a;
		System.out.println("SuperClass(int a)");
	}
}

class SubClass extends SuperClass {
	private int a;
	public SubClass() {
		super(22);
		System.out.println("SubClass()");
	}
	public SubClass(int a){
		this.a = a;
		System.out.println("SubClass(int a)");
	}
}
