import java.io.*;
public class BDReaderLines{
	public static void main(String args[]) throws IOException   
	{
		String readStr;
		BufferedReader BR = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.println("Enter 'end' to quit");
		do{
			readStr = BR.readLine();
			System.out.println(readStr);
		}while(!readStr.equals("end"));		
	}
}
