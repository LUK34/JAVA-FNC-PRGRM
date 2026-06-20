package collections.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class C23_HashSet_Exercise 
{
	 public static Set<String> performOperations() {

	        // Create HashSet and add elements
	        Set<String> languages = new HashSet<>();
	        languages.add("Java");
	        languages.add("Python");
	        languages.add("C++");
	        languages.add("Go");

	        // Check if Java exists in original set
	        boolean containsJava = languages.contains("Java");

	        // Remove C++
	        languages.remove("C++");

	        // Convert remaining elements to uppercase
	        Set<String> result = languages.stream()
	                                      .map(String::toUpperCase)
	                                      .collect(Collectors.toSet());

	        // Add result of contains check
	        result.add("CONTAINS_JAVA:" + containsJava);

	        return result;
	    }

	    public static void main(String[] args) {
	        System.out.println(performOperations());
	    }

}
