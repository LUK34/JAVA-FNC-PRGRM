package collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class C16_LinkedList_Exercise 
{
	 public List<String> performOperations() {

	        // Create LinkedList and add cities
	        LinkedList<String> cities = new LinkedList<>();

	        cities.add("Mumbai");
	        cities.add("Delhi");
	        cities.add("Bangalore");
	        cities.add("Chennai");

	        // Retrieve first element
	        String firstCity = cities.getFirst();

	        // Remove Delhi
	        cities.remove("Delhi");

	        // Search Bangalore
	        boolean containsBangalore = cities.contains("Bangalore");

	        // Convert remaining cities to uppercase
	        for (int i = 0; i < cities.size(); i++) {
	            cities.set(i, cities.get(i).toUpperCase());
	        }

	        // Append required values
	        cities.add("FIRST:" + firstCity);
	        cities.add("CONTAINS_BANGALORE:" + containsBangalore);

	        return cities;
	    }

	    public static void main(String[] args) {

	    	C16_LinkedList_Exercise ex = new C16_LinkedList_Exercise();

	        System.out.println(ex.performOperations());
	    }

}
