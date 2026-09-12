package collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class C43_AccessLinkedHashMap 
{
	public static void main(String[] args) 
	{
		// Creating a LinkedHashMap
		Map<String, Integer> wordNumberMapping = new LinkedHashMap<>();

		// put() - Add new key-value pairs to the LinkedHashMap
		wordNumberMapping.put("one", 1);
		wordNumberMapping.put("two", 2);
		wordNumberMapping.put("three", 3);
		wordNumberMapping.put("four", 4);
		wordNumberMapping.put("five", 5);

		
		//containsKey() - Check if a specific key exists in the LinkedHashmap
		String key = "two";
		if(wordNumberMapping.containsKey(key)) 
		{
			System.out.println(key + " -> exists in LinkedHashMap");
		}
		else 
		{
			
			System.out.println(key+" -> does not present in the LinkedHashMap");
		}
		
		//containsValue() - Check if a specific valie exists in the LinkedHashMap
		int value = 3;
		if(wordNumberMapping.containsValue(value)) 
		{
			System.out.println(value + " -> exists in the LinkedHashMap");
		}
		else 
		{
			System.out.println(value + " -> does not exists in the LinkedHashMap");
		}
		
		// put() -> Modify the value associated with a given key in the LinkedHashMap
		wordNumberMapping.put("three", 33);
		System.out.println(wordNumberMapping);
		
		
	}

}
