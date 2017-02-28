import java.io.*;
public class BRRead {
	public static void main(String args[]) throws IOException
	 {
		char c;
		// User System.in Create BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入字符，按下‘q‘退出");
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != 'q');	
	}
}
