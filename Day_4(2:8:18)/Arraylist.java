package com.wipro.main;
import java.util.*;

public class Arraylist {
	public static void main(String[] args)
	{
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("hello");
		arr.add("world");
		arr.add("have");
		arr.add("good");
		System.out.println(arr);
		
		
//		Traversing collection using For each loop
		
		
		
		for(String a : arr)
		{
			System.out.println(a);
		}
		ArrayList<String> sarr = new ArrayList<String>(10);
		System.out.println(sarr.size());
		sarr.add("have");
		sarr.add("good");
		sarr.addAll(arr);
		System.out.println(sarr);
		
		
		
//		Traversing collection using Iterator
		
		Iterator<String> itr = sarr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(sarr.size());
//		Removing all the element in the array
		sarr.removeAll(sarr);
		System.out.println(sarr);
		
HashSet<String> ht = new HashSet<String>();
		
		ht.add("Arrow");
		ht.add("Season");
		ht.add("Flash");
		ht.add("Marvel");
		
		System.out.println(ht);

	}

}
