package collections.TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class C52_AccessTreeMap 
{
	public static void main(String[] args) 
	{
		NavigableMap<String, Double> pp = new TreeMap();
		pp.put("Laptop", 80000.00);
		pp.put("Smartphone", 50000.00);
		pp.put("Tablet", 25000.00);
		pp.put("Monitor", 15000.00);
		
		System.out.println(pp);
		
		//Find the size of TreeMap
		System.out.println("Find the size of TreeMap:");
		System.out.println("Size of TreeMap: "+pp.size());
		
		//Check if a given key exists in a TreeMap.
		System.out.println("Check if a given key exists in a TreeMap");
		String key="Tablet";
		if(pp.containsKey(key))
		{
			System.out.println(key+" exists in the TreeMap");
		}
		else 
		{
			System.out.println(key+" does not exist in TreeMap");
		}
		
		//Retrieve the first entry in TreeMap
		System.out.println("Retrieve the first entry in TreeMap");
		Map.Entry<String, Double> fe = pp.firstEntry();
		System.out.println(fe);
		
		//Retrieve the last entry in the TreeMap
		System.out.println("Retrieve the last entry in the TreeMap");
		Map.Entry<String, Double> le = pp.lastEntry();
		System.out.println(le);
		
		//Retrieve the entry whose key is lower than the given key
		System.out.println("Retrieve the entry whose key is lower than the given key");
		Map.Entry<String, Double> low_k = pp.lowerEntry("Smartphone");
		System.out.println(low_k);
		
		//Retrieve the entry whose key is higher than the given key
		System.out.println("Retrieve the entry whose key is higher than the given key");
		Map.Entry<String, Double> high_k = pp.higherEntry("Smartphone");
		System.out.println(high_k);
		
		
	}

}
