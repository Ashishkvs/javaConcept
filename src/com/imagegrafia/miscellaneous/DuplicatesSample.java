package com.imagegrafia.miscellaneous;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DuplicatesSample {

    public static void main(String[] args) {
        String str = "AshishKumarishere";
        Map<Character,Integer> mapData = new HashMap<>();
        Predicate<Map<Character,Integer>> isChar = Pre;
        Map<Character, Integer> duplicatesInString = findDuplicatesInString(str);
        //faced compilation issue for characters
//        duplicatesInString.forEach(System.out::println);
        duplicatesInString.forEach((k, v) -> System.out.println(k + " : " + v));

//        Map<String, Long> collect = Stream.of(str.toCharArray())
//                .map(String::new)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //AMBIGUITY in calling for loop for characters
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i] + "\t");
        }

        Stream.of().forEach(ch -> System.out.println(ch + "\t"));
    }

    // find counts of each characters
    static Map<Character, Integer> findDuplicatesInString(String str) {
        Map<Character, Integer> dupCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (dupCount.containsKey(ch)) {
                dupCount.put(ch, dupCount.get(ch) + 1);
            } else {
                dupCount.put(ch, 1);
            }
        }
        return dupCount;
    }


}
