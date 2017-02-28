import java.util.*;
enum Season
{
	SPRING,
	SUMMER,
	FALL,
	WINTER
}

public class EnumSetTest
{
	public static void main(String[] args)
	{
		EnumSet es1 =  EnumSet.allOf(Season.class);
		System.out.println(es1);
		
		EnumSet es2 =  EnumSet.noneOf(Season.class);
		System.out.println("Now There empty es2" + es2);
		es2.add(Season.SUMMER);
		es2.add(Season.SPRING);
		System.out.println("es2 add Two Elements: " + es2);
		
		EnumSet es3 =  EnumSet.of(Season.SPRING, Season.FALL);
		System.out.println("Init in two Elements: " + es3);
		
		EnumSet es4 =  EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println("Enumset.range :" + es4);
		
		EnumSet es5 =  EnumSet.complementOf(es4);
		System.out.println(es5);
	}
}
