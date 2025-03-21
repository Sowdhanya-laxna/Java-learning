package d4;

import java.util.*;

public class Hash {
	public static void main(String[] args) {
		HashMap<String,Integer>h=new HashMap<>();
		h.put("apple", 1);//put method
		h.put("orange", 2);
		h.put("banana", 3);
		for(Map.Entry<String,Integer>entry: h.entrySet()) { //iterating over Hash-map using entry-set
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
       for(String key:h.keySet()) {//using key-set
    	   System.out.println(key+":"+h.get(key));
       }
}
}