package collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class C33_ModifyndRetrieveValues 
{
	public static void main(String[] args) {
		
		Map<String, Integer> fruitMap = new HashMap<>();
		
		// isEmpty() - checks if the HashMap has any key-value pairs. returns true if it is empty.
		System.out.println("Is the fruitMap empty? :"+ fruitMap.isEmpty());
		
		fruitMap.put("Apple", 10);
		fruitMap.put("Banana", 20);
		fruitMap.put("Orange", 15);
		
		System.out.println("Is the fruitMap empty? :"+ fruitMap.isEmpty());
		
		// containsValue() - checks if a specific value is present in the HashMap. Returns true if it exists.
		if(fruitMap.containsValue(20))
		{
			System.out.println("There is fruit containing value = 20");
		}
		else 
		{
			System.out.println("There is no fruit containing value = 20.");
		}
		
		// get() - Retrieve the value associate with a specific key in the HashMap. eturns null if the key is not found.
		Integer value = fruitMap.get("Apple");
		System.out.println("Apple value = "+value);
		System.out.println("Mango value = "+fruitMap.get("Mango"));
		
		// put() - Adds a key and its value to the HashMap. If the key already exists, it updates the value
		fruitMap.put("Banana", 25);
		System.out.println("updated Banana value:"+fruitMap.get("Banana"));
		
	}
	
	
	

}
