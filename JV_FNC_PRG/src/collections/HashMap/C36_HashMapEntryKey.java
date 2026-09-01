package collections.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C36_HashMapEntryKey 
{
	public static void main(String[] args) 
	{
		// Creating a HashMap and adding key-value pairs
		Map<String, Integer> fruitMap = new HashMap<>();
		fruitMap.put("Apple", 10);
		fruitMap.put("Banana", 20);
		fruitMap.put("Orange", 30);
		fruitMap.put("Mango", 25);
		
		// entrySet() - Get a set of all Key-value pairs (entries) from the HashMap.
		Set<Map.Entry<String, Integer>> entries =fruitMap.entrySet();
		System.out.println("entrySet() OUTPUT: "+ entries);
		
		// keySet() - Get  set of all keys from the HashMap.
		Set<String> keys = fruitMap.keySet();
		System.out.println("keySet() OUTPUT:"+keys);
		
		//values() - Get a collection of all values from the HashMap
		Collection<Integer> values = fruitMap.values();
		System.out.println("values() OUTPUT:"+values);
		
		
		
		
		
	}

}
