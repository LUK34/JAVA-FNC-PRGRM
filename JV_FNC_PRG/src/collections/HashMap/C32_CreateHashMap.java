package collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class C32_CreateHashMap 
{
	public static void main(String[] args) 
	{
		//Creating a HashMap
		Map<String, Integer> numberMapping = new HashMap<>();
		
		// put() - Add key-value pairs to the HashMap.
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		
		// If the key already exist, the new value will replace the old value.
		numberMapping.put("One", 5);
		
		//HashMap will allow null values and single null keys
		numberMapping.put(null, null);
		numberMapping.put("Five", null);
		
		//putIfabsent() - Add a new key-value pair only if the key does not already exist in the HashMap or is mapped to null.
		numberMapping.putIfAbsent("Four", 4);
		
		// Printing the entire HashMap
		System.out.println(numberMapping);
		
		
		
		
		
	}

}
