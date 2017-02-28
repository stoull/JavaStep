public class StringBufferDemo {
	public static void main (String args[]){
		StringBuffer bufferStr = new StringBuffer("这个冬天不太冷");
		bufferStr.append("如果冷的话");
		bufferStr.append("/(我是被append进来的 /)");
		bufferStr.append("我就要给你写信！");
		System.out.println(bufferStr);		
	}
}
