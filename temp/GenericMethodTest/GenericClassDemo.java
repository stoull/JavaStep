import java.util.*;
public class GenericClassDemo<T>
{
	public static void main(String[] args)
	{
		GenericClassDemo<Integer> integerBox = new GenericClassDemo<Integer>();
		GenericClassDemo<String> stringBox = new GenericClassDemo<String>();

		integerBox.add(new Integer(10));
		stringBox.add(new String("La La Land"));

		System.out.printf("Integer is :%d\n\n", integerBox.get());
		System.out.printf("String is :%s\n\n", stringBox.get());
	}
	
	private T t;
	public void add(T t){
		this.t = t;
	}

	public T get()
	{
		return t;
	}
}
