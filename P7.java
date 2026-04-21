package Collections;

import java.util.HashMap;
import java.util.*;

public class P7 {

    public static void main(String[] args) {

        Map<Integer, String> Map = new TreeMap<>();

        Map.put(1, "Apple");
        Map.put(2, "Strawberry");
        Map.put(3, "Pear");
        Map.put(4, "Cucumber");
        Map.put(5, "Grapes");

        Map.clear();
        System.out.println("After removing All elements size : " + Map.size());

        Map.put(1, "Apple");
        Map.put(2, "Strawberry");
        Map.put(3, "Pear");
        Map.put(4, "Cucumber");
        Map.put(5, "Grapes");

        System.out.println("After Adding All elements size : " + Map.size());
    }
}