package collections.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class C55_TreeMap_Ex {

    public static String performOperations() {

        // 1. Create a TreeMap
        TreeMap<String, String> countries = new TreeMap<>();

        // 2. Add country-capital pairs
        countries.put("India", "New Delhi");
        countries.put("USA", "Washington DC");
        countries.put("Germany", "Berlin");
        countries.put("Australia", "Canberra");

        // 3. Remove USA
        countries.remove("USA");

        // StringBuilder to build the final result
        StringBuilder result = new StringBuilder();

        // 4. Iterate using entrySet()
        for (Map.Entry<String, String> entry : countries.entrySet()) {

            result.append(entry.getKey())
                  .append("=")
                  .append(entry.getValue())
                  .append("\n");
        }

        // 5. Check whether USA exists
        result.append("HAS_USA=")
              .append(countries.containsKey("USA"));

        return result.toString();
    }
    
	 public static void main(String[] args) 
	 {
	    	System.out.println(performOperations());
			
	 }
	
    
}

