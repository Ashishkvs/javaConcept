package com.imagegrafia.basicjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBasic {
public static void main(String[] args) {
	Map<Integer,Integer> countColor = new HashMap<>();
	List<Integer> list =Arrays.asList(1,5,8,1,5,9,3,1,1,1,5,5);
	for(int a : list) {
		if(countColor.containsKey(a)) {
			Integer colorCount = countColor.get(a);
			countColor.put(a, colorCount + 1);
		} else {
			countColor.put(a, 1);
		}
	}
	System.out.println(countColor);
//	====No of pairs
	System.out.println(countColor.size());
	Collection<Integer> values = countColor.values();
	System.out.println(values);
	int socksPair = 0;
	for( int a : countColor.values()) {
		int pair = a/2;
		System.out.println(pair);
		socksPair += pair; 
	}
	System.out.println("Socks Pair "+ socksPair);
}
}
