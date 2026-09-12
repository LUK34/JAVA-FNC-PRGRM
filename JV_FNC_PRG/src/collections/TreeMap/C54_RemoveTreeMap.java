package collections.TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class C54_RemoveTreeMap 
{
	public static void main(String[] args) 
	{
		NavigableMap<String, Double> pp = new TreeMap();
		pp.put("Laptop", 80000.00);
		pp.put("Smartphone", 50000.00);
		pp.put("Tablet", 25000.00);
		pp.put("Monitor", 15000.00);
		
		// Remove a key from a TreeMap using remove() method
		System.out.println("Remove a key from a TreeMap using remove() method");
		pp.remove("Laptop");
		System.out.println("After Laptop removed: "+pp);
	
		// Remove a key from a TreeMap only if it is associated with a given value using remove(Object key, Object value)
		System.out.println("Remove a key from a TreeMap only if it is associated with a given value using remove(Object key, Object value)");
		pp.remove("Smartphone", 50000.00);
		System.out.println("After Smartphone removed: "+pp);
		
		// Remove the first entry of the TreeMap using pollFirstEntry() method
		System.out.println("Remove the FIRST entry of the TreeMap using pollFirstEntry() method");
		Map.Entry<String, Double> firstEntry = pp.pollFirstEntry();
		System.out.println(firstEntry);
		System.out.println("After pollFirstEntry(): " + pp);
		
		// Remove the last entry of the TreeMap using pollLastEntry() method
		System.out.println("Remove the LAST entry of the TreeMap using pollLastEntry() method");
		Map.Entry<String, Double> lastEntry = pp.pollLastEntry();
		System.out.println(lastEntry);
		System.out.println("After pollLastEntry(): " + pp);

	
	}

}
