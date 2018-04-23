package com.imagegrafia.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInsertionDeletion {
	
	public static void main(String[] args) {
	Set<String> set=new HashSet<>();
	
	set.add("Ashish");
	set.add("Rintu");
	set.addAll(Arrays.asList("bala","sanjeev","kavita"));
	
	//print all set
	/**
	 * here order will not be preserved
	 * insertion and deletion is faster
	 */
	System.out.println(set);
	
	//print individual set element
	Iterator<String> itr=set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	//or we can do like this as well using for each loop
	for(String s : set) {
		System.out.println(s);
	}
	
	//remove object from set
	set.remove("Ashish");
	System.out.println(set);
	/**
	 * if we remove set element which z not exist will return false
	 */
	System.out.println(set.remove("abcd")); //false
	}

}
