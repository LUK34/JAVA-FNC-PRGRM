package collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class C35_RemoveKeysFromHashMap 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> fruitMap = new HashMap<>();
		
		fruitMap.put("Apple", 10);
		fruitMap.put("Banana", 20);
		fruitMap.put("Orange", 15);
		
		System.out.println(fruitMap);
		
		// remove(Object key) - Removes the key and its associated value from the HashMap. 
		// Return the value that was removed, or null if the key does not exist.
		Integer removedValue = fruitMap.remove("Apple");
		System.out.println("Removed value: "+removedValue);
		System.out.println("After remove 'Apple': "+ fruitMap);
		System.out.println(fruitMap.remove("Mango"));
		
		// remove(Object key, Object value) - Remove the key from the HashMap only if it is associated with the specified value.
		// Returns true if the key-value pair was removed. false otherwise.
		boolean isRemoved = fruitMap.remove("Banana", 20);
		System.out.println("was Banana removed? "+ isRemoved);
		System.out.println("after remove 'Banana'"+fruitMap);
		
		System.out.println("Is Orange removed? "+ fruitMap.remove("Orange", 25));
		
		
		
		
		
	}

}
