// 下面是一个演示 InputStream 和 OutputStream 用法的例子
import java.io.*;
public class FileStreamTest {
	public static void main(String args[])
	{
		try{
			byte[] bWrite = {11, 12, 34, 56, 72};
			OutputStream os = new FileOutputStream("filestream.txt");
			for (int x = 0; x < bWrite.length; x++){
				System.out.println(bWrite[x]);
				os.write(bWrite[x]);
			}
			os.close();
			
			InputStream is = new FileInputStream("filestream.txt");
			int size = is.available();

			for (int i=0; i < size ; i++)
			{
				System.out.print((char)is.read() + " ");
			}
			is.close();

			
		}catch (IOException e){
			System.out.print("Exception");
		}
	}
}
