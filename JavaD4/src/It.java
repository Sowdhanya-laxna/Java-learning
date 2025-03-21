package d4;
import java.util.*;
public class It {
	
	

	

	    public static void main(String[] args) {
	        // Create an ArrayList to store fruit names
	        ArrayList<String> a = new ArrayList<>();
	        
	        // Add fruits to the ArrayList
	        a.add("Apple");
	        a.add("Banana");
	        a.add("Cherry");

	        // Create an iterator to iterate over the ArrayList
	        Iterator<String> iterator = a.iterator();  

	        // Print the fruits using the iterator
	        System.out.println("Fruits using Iterators:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


