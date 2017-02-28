import java.util.*;
public class LinkedHashSetTest
{
	public static void main(String[] args)
	{
		LinkedHashSet books = new LinkedHashSet();
		books.add("Object-C");
		books.add("Java");
		
		books.add("Java");
		System.out.println(books);
		
		books.remove("Java");
		books.add("Java");
		System.out.println(books);
	}
}
