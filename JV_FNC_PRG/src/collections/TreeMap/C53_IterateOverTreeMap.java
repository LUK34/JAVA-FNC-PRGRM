package collections.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class C53_IterateOverTreeMap 
{
	public static void main(String[] args) 
	{
		NavigableMap<String, Double> pp = new TreeMap();
		pp.put("Laptop", 80000.00);
		pp.put("Smartphone", 50000.00);
		pp.put("Tablet", 25000.00);
		pp.put("Monitor", 15000.00);
		
		System.out.println(pp);
		
		// Iterate over a TreeMap using Java 8 forEach and lambda expression.
		System.out.println("Iterate over a TreeMap using Java 8 forEach and lambda expression.");
		pp.forEach((k,v) -> {System.out.println(k +" -> "+v);});
		
		// Iterate over a TreeMap's entrySet using iterator().
		System.out.println("Iterate over a TreeMap's entrySet using iterator().");
		Iterator<Map.Entry<String, Double>> entryIterator = pp.entrySet().iterator();
		while(entryIterator.hasNext())
		{
			Map.Entry<String, Double> e = entryIterator.next();
			System.out.println(e.getKey()+" -> "+e.getValue());
		}
		
		// Iterate over a TreeMap's keySet to access keys.
		System.out.println("Iterate over a TreeMap's keySet to access keys.");
		for(String p:pp.keySet())
		{
			System.out.println("Product Key:"+p);
		}
		
		
		// Iterate over a TreeMap's values to access values.
		System.out.println("Iterate over a TreeMap's values to access values.");
		for(Double p:pp.values())
		{
			System.out.println("Product Value:"+p);
		}
		
		
		
		
	}

}
