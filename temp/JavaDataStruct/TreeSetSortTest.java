import java.util.*;
class M
{
	int age;
	public M(int age)
	{
		this.age = age;
	}
	
	public String toString()
	{
		return "M[age:" + age+ "]";
	}
}

public class TreeSetSortTest
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet(new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				M m1 = (M)o1;
				M m2 = (M)o2;
				return m1.age>m2.age ? -1 : m1.age < m2.age ? 1 : 0;
			}
		});

		ts.add(new M(5));
		ts.add(new M(-3));
		ts.add(new M(83));
		ts.add(new M(34));
		ts.add(new M(2));

		System.out.println(ts);
	}
}
