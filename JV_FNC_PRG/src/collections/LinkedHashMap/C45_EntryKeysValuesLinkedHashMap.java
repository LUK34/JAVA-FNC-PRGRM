package collections.LinkedHashMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class C45_EntryKeysValuesLinkedHashMap 
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

		System.out.println(wordNumberMapping);
		
		//entrySet()
		Set<Map.Entry<String, Integer>> entries = wordNumberMapping.entrySet();
		System.out.println("Entries"+entries);
		
		// keySet()
		Set<String> keys = wordNumberMapping.keySet();
		System.out.println("Keys: "+keys);
		
		//values()
		Collection<Integer> values = wordNumberMapping.values();
		System.out.println("Values: "+values);
		
		
		
		
		
		
	}

}
