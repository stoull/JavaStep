import java.util.BitSet;
public class BitSetDemo 
{
	public static void main(String args[])
	{
		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(22);
		
		for (int i = 0; i < 16; i++)
		{
			if((i%2) == 0) bits1.set(i);
		//	if((i%3) == 0) bits2.set(i);
		}
		for (int i = 0; i<22; i++)
		{
			if(i%2 == 0) bits2.set(i);
		}	
		System.out.println("Initial pattern in bits1 : ");
		System.out.println(bits1);
		System.out.println("Initial pattern in bits2 : ");
		System.out.println(bits2);
		
		BitSetDemo.printBitSet(bits1);
		System.out.println("======= Bit2 ========");
		BitSetDemo.printBitSet(bits2);
 	}		
	
	public static void printBitSet(BitSet bs)
	{
		StringBuffer but = new StringBuffer();
		but.append("\n");
		for (int i = 0; i<bs.size(); i++)
		{
			if(i<bs.size() - 1)
			{
				but.append(BitSetDemo.getBitTo10(bs.get(i)) + ",");
			}else{
				but.append(BitSetDemo.getBitTo10(bs.get(i)));
			}
			if ((i+1)%8 == 0 && i!=0)
			{
				but.append("\n");
			}
		}
		but.append("\n");
		System.out.println(but.toString());
	}
	public static String getBitTo10(boolean flag)
	{
		String a="";
		if(flag == true)
		{
			return "1"; 
		}else{
			return "0";
		}	
	}	

}
