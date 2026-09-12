package collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class C41_HashMap_Exercise {

	
	public Map<String, Integer> performOperations() {

        Map<String, Integer> stock = new HashMap<>();

        // 1. Create & Add Key-Value Pairs
        stock.put("Apple", 50);
        stock.put("Banana", 30);
        stock.put("Orange", 20);
        stock.put("Grapes", 40);

        // 2. Modify Value
        stock.put("Banana", 35);

        // 3. Retrieve a specific value
        Integer appleQty = stock.get("Apple");

        // 4. Remove key
        stock.remove("Orange");

        // 5. Create result map
        Map<String, Integer> result = new HashMap<>();

        // 6. Iterate through stock and convert keys to uppercase
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {

            result.put(
                entry.getKey().toUpperCase(),
                entry.getValue()
            );
        }

        // 7. Add Apple quantity
        result.put("APPLE_QTY", appleQty);

        // 8. Check whether Orange exists
        result.put(
            "CONTAINS_ORANGE",
            stock.containsKey("Orange") ? 1 : 0
        );

        // 9. Return final map
        return result;
    }
	
	
	
    public static void main(String[] args) {

        // Create object
        C41_HashMap_Exercise obj = new C41_HashMap_Exercise();

        // Call the method
        Map<String, Integer> result = obj.performOperations();

        // Display result
        System.out.println(result);
    }

    
}