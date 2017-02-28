import java.util.*;
public class ArrayListTest
{
	public static void main(String[] args)
	{
		List books = new ArrayList();
		books.add(new String("<<Object-c>>"));
		books.add(new String("<<Swift>>"));
		books.add(new String("Learn Java"));
		books.add(new String("How to pursue a Girl"));
		System.out.println(books);
		
		// insert a book
		System.out.println("Now insert a book at index 1");
		books.add(1, new String("Google Code"));
		for (int i=0; i < books.size(); i++)
		{
			System.out.println(books.get(i));
		}

		// delete the element at index three
		System.out.println("Delete the element at index three");
		books.remove(2);
		System.out.println(books);

		System.out.println("Show the elemet's index in the list");
		System.out.println(books.indexOf(new String("<<Swift>>")));
		
		System.out.println(books.indexOf(new String("<<Object-c>>")));
		books.add(3,new String("I Love her so much"));
		System.out.println(books.subList(1,2));	
	}
}
