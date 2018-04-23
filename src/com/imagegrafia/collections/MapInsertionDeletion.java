package com.imagegrafia.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInsertionDeletion {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("Animal", "Dog");
		map.put("Bird", "peacock");
		map.put("Car","Maruthi");
		map.put("Vehicle", "cycle");
		
		//print all map
		/**
		 * insertion order are not preserved
		 * 
		 */
		System.out.println(map); //{Vehicle=cycle, Car=Maruthi, Bird=peacock, Animale=Dog}
		
		//print individual map object
		/**
		 * in case of string KEYS it is case Sensitive
		 */
		System.out.println(map.get("animal"));//null
		System.out.println(map.get("Animal")); //Dog
		
		//Iterator all element from map
		Set<String> keyset=map.keySet();
		Iterator<String> itr=keyset.iterator();
		while(itr.hasNext()) {
			String  key=itr.next();
			String value=map.get(key);
			System.out.println(key+"="+value);
		}
		//delete map object
		map.remove("Animal"); //removing element using key
		System.out.println(map);
		
		//what if we access key after removing print null
		System.out.println(map.get("Animal")); //null
		
	
	}

}
