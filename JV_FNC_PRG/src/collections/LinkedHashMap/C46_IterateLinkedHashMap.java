package collections.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class C46_IterateLinkedHashMap 
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
		
			// Iterate over a LinkedHashMap using Java 8 forEach and lambda expression.
			System.out.println("Iterate over a LinkedHashMap using Java 8 forEach and lambda expression.");
			wordNumberMapping.forEach((key,value) -> {System.out.println(key+" -> "+ value);});
			
			// Iterate over a LinkedHashMap entrySet using Java 8 forEach and lambda expression.
			System.out.println("Iterate over a LinkedHashMap entrySet using Java 8 forEach and lambda expression.");
			wordNumberMapping.entrySet().forEach((e) -> {System.out.println(e.getKey()+" -> "+ e.getValue());});

			//Iterate over a LinkedHashMap entrySet using iterator().
			System.out.println("Iterate over a LinkedHashMap entrySet using iterator().");
			Iterator<Map.Entry<String, Integer>> i = wordNumberMapping.entrySet().iterator();
			while(i.hasNext())
			{
				Map.Entry<String, Integer> entry = i.next();
				System.out.println(entry.getKey()+" -> "+entry.getValue());
			}
			
			
			
			
			
				
				
	}

}
