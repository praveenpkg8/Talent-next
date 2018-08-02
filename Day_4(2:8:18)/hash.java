package com.wipro.main;
import java.util.*;

public class hash {
	
	public static void main(String[] args)
	{
		HashSet<String> ht = new HashSet<String>();
		
		ht.add("Arrow");
		ht.add("Season");
		ht.add("Flash");
		ht.add("Marvel");
		
		System.out.println(ht);
		
		//ht.clear();
		HashSet<String> st = new HashSet<String>();
		st = (HashSet)ht.clone();
		
		System.out.println(st);
		
		System.out.println(st.contains("Flash"));
		
		Iterator<String> gt = st.iterator();
		
		while(gt.hasNext())
		{
			System.out.println(gt.next());
		}
		st.remove("Season");
		
		System.out.println(st.contains("Season"));
		
		System.out.println(st.size());

		


		
	}

}
