package com.imagegrafia.miscellaneous;

import com.imagegrafia.model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalSample {
    //    Iterable<String> list=  new Iterable<String>() {
//        @Override
//        public Iterator<String> iterator() {
//            return null;
//        }
//    }
    static Product product = new Product(1, "Samsung s22", 200.2f, 1);
    static Product product2 = new Product(2, "Lg l1", 300.2f, 1);
    static Product product3 = new Product(3, "Lenovo l1", 400.2f, 1);
    static Product product4 = new Product(1, "Samsung s22", 500.2f, 1);
    static List<Product> products = Arrays.asList(product, product2, product3, product4);

    public static void main(String[] args) {
        //for lopp
        //filter
        //
        for (Product product1 : products) {
            System.out.println(product1);
        }
        products.forEach(System.out::println);
        products.forEach(data -> System.out.println(data.getName()));

        //Get list from streams
        //for set Duplicate key Samsung s22 (attempted merging values 1 and 1)
        Set<String> productsName = products.stream()
                .map(Product::getName)
                .collect(Collectors.toSet());
        System.out.println("Products Names"+ productsName);


        Map<String, Long> collect1 = products.stream().map(data -> data.getName()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect1);

        //get list of names
        //Convert object to map with key value
        Map<String, Integer> collect = products.stream().collect(
                Collectors.toMap(
                        Product::getName, Product::getId)
        );

    }
}
