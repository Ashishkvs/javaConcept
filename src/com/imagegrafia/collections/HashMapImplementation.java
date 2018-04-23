package com.imagegrafia.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapImplementation {

	public static void main(String[] args) {
		HashMap<String, Integer> hmap=new HashMap<>();
		hmap.put("Ashish",1);
		hmap.put("Kajal",3);
		hmap.put("Ashi",4); //order of all these entry may or may not be same
		hmap.put("Surila",2);
		hmap.put("Anupam",5);
		
		System.out.println(hmap); //{Kajal=3, Surila=2, Ashish=1, Anupam=5, Ashi=4}
		
		//Itertate all map object inside HashMap
		for(Entry<String,Integer> e: hmap.entrySet()) {
			System.out.println(e.getKey());
		}
		System.out.println(hmap.get("Ashi"));
		
		//override hashCode()
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
