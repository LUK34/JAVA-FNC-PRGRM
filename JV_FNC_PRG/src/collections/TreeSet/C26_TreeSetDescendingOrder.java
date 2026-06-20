package collections.TreeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class C26_TreeSetDescendingOrder 
{
	public static void main(String[] args) 
	{
		System.out.println("--------------------------------------------------------------------------------");
		SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());
		System.out.println("1. Comparator.reverseOrder() -> To display the data in reverse order");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		System.out.println(fruits);
		System.out.println("--------------------------------------------------------------------------------");
		
	}

}
