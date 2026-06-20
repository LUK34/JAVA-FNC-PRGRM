package collections.HashSet;

import java.util.HashSet;
import java.util.Set;

public class C19_AccessingHashSetElements 
{
	public static void main(String[] args) 
	{
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("1. Create a HashSet using the HashSet() constructor. HashSet does not maintain the Insertion Order.");
		Set<String> daysOfWeek = new HashSet<>();
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");
		System.out.println("OUTPUT:"+daysOfWeek);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("2. contains() -> Check if a specific elements exists in the HashSet or not");
		if(daysOfWeek.contains("Tuesday"))
		{
			System.out.println("Element exists.");
		}
		else 
		{
			System.out.println("Element does not exists.");
		}
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("3. size() -> Get the total number of elements in the HashSet.");
		int size = daysOfWeek.size();
		System.out.println("HashSet size:"+size);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("4. isEmpty() -> Check if the HashSet is empty.");
		if(daysOfWeek.isEmpty())
		{
			System.out.println("Hashset is EMPTY.");
		}
		else 
		{
			System.out.println("Hashset is NOT EMPTY.");
		}
		
		
		
	}

}
