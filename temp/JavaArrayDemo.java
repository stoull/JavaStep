public class JavaArrayDemo{
	public static void main (String args[]){
		float[] floatArray = {2.5f, 3.9f, 4.4f, 8.1f, 1.3f, 2.3f};
		
		// 这里打印数组元素
		for (int i = 0; i < floatArray.length; i++){
			float element = floatArray[i];
			System.out.printf("floatArray [" + "%d] :" + "%.2f",i,element);
			System.out.println("");
		}	
		
		// 计算所有元素总和 
		float total = 0;
		for (float element: floatArray){
			total += element;
		}
		System.out.println("The total Value :" + total);

		// 查找最大值
		float maxValue = floatArray[0];
		for (float element: floatArray){
			if (element > maxValue){
				maxValue = element;
			}
		}
		System.out.println("The maxValue is :" + maxValue);
	}
}
