package collections.HashSet;

import java.util.HashSet;
import java.util.Set;

public class C17_CreateHashSetExample 
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
		System.out.println("2. It will handle duplicate values. Meaning Duplicate values are ignored. Hash Set is case sensitive");
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("wednesday");
		System.out.println("OUTPUT:"+daysOfWeek);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("3. It will allow NULL values");
		daysOfWeek.add(null);
		daysOfWeek.add(null);
		System.out.println("OUTPUT:"+daysOfWeek);
		System.out.println("--------------------------------------------------------------------------------");
		
	}

}
