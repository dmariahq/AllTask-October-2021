package com.javaprogram;

import java.util.*;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Tugas1 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		System.out.println("Contoh Tree Map\n");
		TreeMap map = new TreeMap();
		//Addding data to a tree map
		map.put(1, "January");
		map.put(2, "February");
		map.put(3, "March");
		map.put(4, "April");
		map.put(5, "May");
		map.put(6, "June");
		map.put(7, "July");
		map.put(8, "August");
		map.put(9, "September");
		map.put(10, "October");
		map.put(11, "November");
		map.put(12, "December");
		//Rerieving all keys
		System.out.println("Keys of tree map: " + map.keySet());
		//Rerieving all values
		System.out.println("Values of tree map: " + map.values());
		//Rerieving the value from key with key number 5
		System.out.println("Key: 5 value: " + map.get(5)+ "\n");
		//Rerieving the First key and its value
		System.out.println("First key: " + map.firstKey() + " Value: "
		+ map.get(map.firstKey()) + "\n");
		//Rerieving the Last key and value
		System.out.println("Last key: " + map.lastKey() + " Value: "
		+ map.get(map.lastKey()) + "\n");
		//Removing the first key and value
		System.out.println("Removing first data: " + map.remove(map.firstKey()));
		System.out.println("Current tree map Keys: " + map.keySet());
		System.out.println("Current tree map contains: " + map.values() + "\n");
		//Removing the last key and value
		System.out.println("Removing last data: " + map.remove(map.lastKey()));
		System.out.println("Current tree map Keys: " + map.keySet());
		System.out.println("Current tree map contains: " + map.values());

		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("Affogato");
        ts.add("Americano");
        ts.add("Espresso");
        ts.add("Cappuccino");
        ts.add("Macchiato");
        ts.add("Cafe Latte");
     // Print and display initial elements of TreeSet
        System.out.println("Minuman Kopi\t\t\t : " + ts);
 
        System.out.println("Macchiato ada? \t\t : " + ts.contains("Macchiato"));
        System.out.println("Minuman kosong? \t\t\t : " + ts.isEmpty());
        System.out.println("Total Minuman \t\t\t : " + ts.size());
  
        System.out.println("Menu Minuman Kopi Vertikal \t :");
        Iterator<String> i = ts.iterator();
        i = ts.iterator();
        while (i.hasNext())
            System.out.println("Minuman Kopi --> " + i.next());
  
        ts.remove("Espresso");
        System.out.println("Minuman Kopi \"Espresso\" deleted\t : " + ts);
        ts.clear();
        System.out.println("The clear TreeSet \t\t : " + ts);
	}
	
}