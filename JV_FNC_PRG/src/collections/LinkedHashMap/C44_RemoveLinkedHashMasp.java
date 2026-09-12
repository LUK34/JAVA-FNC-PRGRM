package collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class C44_RemoveLinkedHashMasp 
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
		
		//remove(Object key) - Remove a key from the LinkedHashMap
		wordNumberMapping.remove("two");
		System.out.println("After removing key 'two' "+wordNumberMapping);
		
		//remove(Object key, Object value) - Remove a key only if it is associated with the specified value
		wordNumberMapping.remove("three",3);
		System.out.println("After removing three-3: "+wordNumberMapping);
		
		//clear = Removes all of the mappings from this map.
		wordNumberMapping.clear();
		System.out.println(wordNumberMapping);
		
		
		
	}
	

}
