package com.imagegrafia.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author ashish
 *
 *         Main aim of stream concept is to make the operation easy on
 *         collections
 *
 *         Difference b/w stream and Collection A collections refer group object
 *         in memory BUT a stream contains Object that are taken from collection
 *         for purpose of doing manipulation
 */
public class StreamApiDemo {

	public static void main(String[] args) {
		//Create an arrayList of Integer
		List<Integer> arrayList = new ArrayList<>();
		arrayList.addAll(Arrays.asList(5, 10, 15, 20, 45, 100, 45, 76, 34, 20));

		//Convert arrayList to Stream in order to perform stream operation
		Stream<Integer> sm = arrayList.stream();
		
		System.out.println(sm); // #1 java.util.stream.ReferencePipeline$Head@5c647e05
		// sm.filter(i-> i > 25);  
		// sm.filter((i)->i>25); // both are same return type is Stream
		
		// filter object from arraylist 25 to 85
		arrayList = sm.filter((i) -> i > 25 & i < 85).collect(Collectors.toList()); 
		System.out.println(arrayList);
	}

}
