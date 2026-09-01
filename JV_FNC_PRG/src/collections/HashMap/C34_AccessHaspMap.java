package collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class C34_AccessHaspMap 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> fruitMap = new HashMap<>();
		
		// isEmpty() - checks if the HashMap has any key-value pairs. returns true if it is empty.
		System.out.println("Is the fruitMap empty? :"+ fruitMap.isEmpty());
		
		fruitMap.put("Apple", 10);
		fruitMap.put("Banana", 20);
		fruitMap.put("Orange", 15);
		
		System.out.println("Is the fruitMap empty? :"+ fruitMap.isEmpty());
		
		// size() - Returns the total number of key-value pairs in the HashMap.
		System.out.println("Total fruits in inventory:"+ fruitMap.size());
		
		//containsKey() - Checks if a specific key is present in the HashMap. Returns true if it exists.
		if(fruitMap.containsKey("Banana"))
		{
			System.out.println("Key EXISTS");
		}
		else 
		{
			System.out.println("Key does NOT EXIST.");
		}
		
		
	}

}
