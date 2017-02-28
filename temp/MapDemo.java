import java.util.*;
public class MapDemo{
	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<String, String>();
		map.put("1","value1");
		map.put("2","value2");
		map.put("3","value3");
		
		System.out.println("Though Map.keySet get Elemets:");
		for(String key : map.keySet())
		{
			System.out.println("Key =" + key + "add value" + map.get(key));
		}
		
		System.out.println("Trough Map.entrySet user iterator accesss every element:");
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, String> entry = it.next();
			System.out.println("key" + entry.getKey() + "and value" + entry.getValue());
		}
			
		System.out.println("Thourgh Map.entrySet access key and value");
		for (Map.Entry<String, String> entry:map.entrySet())
		{
			System.out.println("key =" +entry.getKey() + "and value=" + entry.getValue());
		}
	}
}
