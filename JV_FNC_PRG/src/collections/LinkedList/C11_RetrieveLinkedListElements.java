package collections.LinkedList;

import java.util.LinkedList;

public class C11_RetrieveLinkedListElements 
{
	public static void main(String[] args) 
	{
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Orange");
		fruits.add("Grapes");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("getFirst() -> get the first element in the LinkedList.");
		System.out.println("OUTPUT: "+fruits.getFirst());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("getLast() -> get the last element in the LinkedList. The getLast() method throws NoSuchElementException if the Linked List is empty.");
		System.out.println("OUTPUT: "+fruits.getLast());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("get() -> get the last element in the LinkedList. The get the element at a given index in the LinkedList.");
		System.out.println("OUTPUT:"+fruits.get(1));
		System.out.println("OUTPUT:"+fruits.get(3));
		System.out.println("--------------------------------------------------------------------------------");

		
		
	}

}
