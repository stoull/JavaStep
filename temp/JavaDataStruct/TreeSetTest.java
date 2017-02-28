import java.util.*;
public class TreeSetTest
{
	public static void main(String[] args)
	{
		TreeSet nums = new TreeSet();
		nums.add(5);
		nums.add(3);
		nums.add(-5);
		nums.add(23);

		System.out.println(nums);
		System.out.println("The First nums :" + nums.first());
		System.out.println("The last nums :" + nums.last());
		System.out.println("Return number less than 4" + nums.headSet(4));
		System.out.println("Number more than 5" + nums.tailSet(5));
		System.out.println("Number between -3 to 10" + nums.subSet(-3, 10));
	}
}
