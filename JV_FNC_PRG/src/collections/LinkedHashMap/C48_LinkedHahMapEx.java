package collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class C48_LinkedHahMapEx 
{

    public static String performOperations() 
    {

        // 1. Create LinkedHashMap
        LinkedHashMap<String, String> capitals =
                new LinkedHashMap<>();

        // 2. Add country-capital pairs
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington DC");
        capitals.put("UK", "London");
        capitals.put("Japan", "Tokyo");

        // 3. Remove UK
        capitals.remove("UK");

        // 4. Access keySet(), values(), entrySet()
        capitals.keySet();
        capitals.values();
        capitals.entrySet();

        // 5. Check whether Japan and UK exist
        boolean hasJapan = capitals.containsKey("Japan");
        boolean hasUK = capitals.containsKey("UK");

        // 6. Build result String
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> entry :
                capitals.entrySet()) {

            result.append(entry.getKey())
                  .append("=")
                  .append(entry.getValue())
                  .append(",");
        }

        result.append("HAS_JAPAN=")
              .append(hasJapan)
              .append(",");

        result.append("HAS_UK=")
              .append(hasUK);

        return result.toString();
    }
    
    public static void main(String[] args) 
    {
    	System.out.println(performOperations());
    	
		
	}
    
}