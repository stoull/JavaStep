import java.util.*;
public class GenericExtends{
	
	// compare three value and reture the max value
	public static <T extends Comparable<T>> T maximum(T x, T y, T z)
	{
		T max = x;
		if (y.compareTo( max ) > 0)
		{
			max = y;
		}
		
		if (z.compareTo(max) > 0 )
		{
			max = z;
		}
		return max;
	}
	
	
	public static void main(String[] args)
	{
		System.out.printf("%d, %d,and %d the max is :%d\n\n",3,4,5,maximum(3,4,5));
		System.out.printf("%.1f, %.1f and %.1f the max is: %.1f\n\n",3.5,5.3,6.8,maximum(3.5,5.3,6.8));
		System.out.printf("%s, %s, %s the max is %s\n\n","Apple","Orange","Pear",maximum("Apple","Orange","Pear"));		
	}
}
