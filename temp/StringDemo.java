public class StringDemo {
	public static void main(String args[]){
		char[] hi = {'H','e','l','l','o',',','G','u','n'};
		String Gun = new String(hi);
		System.out.println("GunHello is : " + Gun);

		int GunLenth = Gun.length();
		System.out.println("GunHello.leght() is int value : " + GunLenth);
		String Zi = "Gun is a nickname";
		System.out.println("There another String Zi :" + Zi);
		System.out.println("Let's concat String GunHello and Zi");
		String CGunZi = Gun.concat(Zi);
		System.out.println("GunHello.concat(Zi) is : " + CGunZi);
		
		float floatVar = 2.4f;
		int intVar = 5;
		String stringVar = "StringValue";
		String formatStr = String.format("floatValue is" + "%.2f intVaule is" + "%d stringValue is" + " %s",floatVar,intVar,stringVar);
		System.out.println("The formate value : " + formatStr);	
	}
}
