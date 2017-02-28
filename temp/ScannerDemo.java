import java.util.Scanner;
public class ScannerDemo{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		// 从键盘接收数据
		System.out.println("hasNext 接收数据");
		if(scanner.hasNext()){
			String inStr = scanner.next();
			System.out.println("inputData :" + inStr);
		}
		
		System.out.println("hasNextLine 接收数据");
		if (scanner.hasNextLine()){
			String inLineStr = scanner.nextLine();
			System.out.println("输入的数据为:" + inLineStr);
		}
		
	}
}
