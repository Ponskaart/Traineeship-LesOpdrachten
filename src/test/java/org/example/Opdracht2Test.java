package org.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Opdracht2Test {
    @Test
    public void testingIfShortestNameIsgiven() {
        String[] names = {"Hendricus", "Jan", "Benchjamin", "Pieter"};
        System.out.println(shortestName(names));
    }
    public String shortestName(String[] names) {
        Arrays.sort(names, Comparator.comparingInt(String::length));
        return names[0];
    }
/*
* Het alternatief is door names[index].length() te doen voor alle namen in de array, en vervolgens met een for loop het
* de kortste naam te vinden
*/
}
