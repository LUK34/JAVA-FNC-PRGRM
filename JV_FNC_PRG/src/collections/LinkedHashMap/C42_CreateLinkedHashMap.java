package collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class C42_CreateLinkedHashMap 
{
	public static void main(String[] args) 
	{
		//Creating a LinkedHashMap
		Map<String, Integer> wordNumberMapping = new LinkedHashMap<>();
		
		// put() - Add new key-value pairs to the LinkedHashMap
		wordNumberMapping.put("one", 1);
		wordNumberMapping.put("two", 2);
		wordNumberMapping.put("three", 3);
		wordNumberMapping.put("four", 4);
		wordNumberMapping.put("five", 5);
		
		// putIfAbsent() - Add a new key-value pair only if the key does not exist in the LinkedHashMap or is mapped to null
		wordNumberMapping.putIfAbsent("six", 6);
		wordNumberMapping.putIfAbsent("five", 6);
		
		// Printing the LinkedHashMap
		System.out.println(wordNumberMapping);
		
	
		
		
	}

}
