package d4;
import java.util.*;
public class HashMaps {
	public static void main(String[] args) {
	HashMap<String,Integer>h=new HashMap<>();
	h.put("apple", 1);//put method
	h.put("orange", 2);
	h.put("banana", 3);
	
	System.out.println("HashMap"+h);
	System.out.println("apple count:"+h.get("apple"));//get method
	
	if(h.containsKey("banana")) {//finding the key in the given 
		System.out.println("Banana is in the map");	
	}
	
	if(h.containsValue(2)) {//finding the value in the given 
		System.out.println("orange is in the map");	
	}
	h.remove("apple");//remove
	System.out.println("After removing the apple:"+h);	
	System.out.println("Map size:"+h.size());//size-of	
	}

}
