import java.util.*;
public class GenericMethodTest{
	public static void main(String[] args)
	{
		// Create different type Array
		Integer[] intArray = {1,2,3,4,5,9};
		Double[] doubleArray = {1.1,3.2,4.5,8.0};
		Character[] charArray = {'H','E','L','L','O'};
		
		System.out.println("Integer element:");
		printArray(intArray);
		
		System.out.println("Double element");
		printArray(doubleArray);
		
		System.out.println("character element");
		printArray(charArray);	
	}
	
	public static < E > void printArray(E[] inputArray)
	{
		for (E element : inputArray)
		{
			System.out.printf("%s",element);
		}
		System.out.println();	
	}	
}
