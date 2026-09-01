package collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C39_IteratorOverHashMap
{
	public static void main(String[] args) 
	{
			// Creating a HashMap and adding key-value pairs
			Map<String, Integer> fruitMap = new HashMap<>();
			fruitMap.put("Apple", 10);
			fruitMap.put("Banana", 20);
			fruitMap.put("Orange", 30);
			fruitMap.put("Mango", 25);
				
			System.out.println(fruitMap);
				
			
			System.out.println("##############################################################################");
			// 1. Iterating using Java 8 forEach and lambda expression:
			System.out.println("1. Iterating using Java 8 forEach and lambda expression:");
			fruitMap.forEach((key,value) -> System.out.println(key+" -> "+value));
			System.out.println("##############################################################################");
			
			System.out.println("##############################################################################");
			// 2. Iterating over the hashMap's entrySet using iterator()
			System.out.println("2. Iterating over the hashMap's entrySet using iterator():");
			Iterator<Map.Entry<String, Integer>> iterator = fruitMap.entrySet().iterator();
			while(iterator.hasNext())
			{
				Map.Entry<String, Integer> entry = iterator.next();
				System.out.println(entry.getKey()+" -> "+entry.getValue());
			}
			System.out.println("##############################################################################");
			// 3. Iterating over HashMaps entrySet using Java 8 forEach and lambda expression
			System.out.println("3. Iterating over HashMaps entrySet using Java 8 forEach and lambda expression");
			fruitMap.entrySet().forEach((entry) -> System.out.println(entry.getKey()+" -> "+entry.getValue()));
			System.out.println("##############################################################################");
			// 4. Iterating over HashMaps entrySet using simple for-each loop
			System.out.println("4.Iterating over HashMaps entrySet using simple for-each loop");
			for(Map.Entry<String, Integer> entry : fruitMap.entrySet())
			{
				System.out.println(entry.getKey()+" -> "+entry.getValue());
			}
			System.out.println("##############################################################################");
			
			
			System.out.println("##############################################################################");
			// 5. Iterating over HashMap's keySet
			System.out.println("5. Iterating over HashMap's keySet");
			fruitMap.keySet().forEach((k) -> {
				System.out.println(k+" -> "+fruitMap.get(k));
			});
			
			System.out.println("##############################################################################");
			
			
			
	}

}
