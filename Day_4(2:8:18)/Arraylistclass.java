package com.wipro.main;
import java.util.*;
import java.lang.*;
import java.io.*;



class Sortbyroll implements Comparator<Arraylistclass>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Arraylistclass a, Arraylistclass b)
    {
        return a.id - b.id;
    }
}

class sortbyname implements Comparator<Arraylistclass>{
	public int compare(Arraylistclass a, Arraylistclass b)
	{
		return a.name.compareTo(b.name);
	}
	
}

public class Arraylistclass {
	int id;
	String name;
	
	public Arraylistclass(int id,String name)
	{
		this.id = id;
		this.name = name;
		
	}
	
		public static void main(String[] args)
	{
		Arraylistclass a1 = new Arraylistclass(1,"Flash");
		Arraylistclass a2 = new Arraylistclass(2,"Arrow");
		Arraylistclass a3 = new Arraylistclass(3,"Reaverse Flash");
		
		ArrayList<Arraylistclass> arr = new ArrayList<Arraylistclass>();
		arr.add(a3);
		arr.add(a1);
		arr.add(a2);
		

		for(Arraylistclass a: arr)
		{
			System.out.println("Id: " + a.id + " Name: " + a.name);
		}
		System.out.println("Order by id:\n");
		Collections.sort(arr,new Sortbyroll());
		
		for(Arraylistclass a: arr)
		{
			System.out.println("Id: " + a.id + " Name: " + a.name);
		}
				
		System.out.println("Order by name\n");

		Collections.sort(arr,new sortbyname());
				
		for(Arraylistclass a: arr)
		{
			System.out.println("Id: " + a.id + " Name: " + a.name);
		}

	}

	
}
