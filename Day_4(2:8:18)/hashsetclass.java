package com.wipro.main;
import java.util.*;


class Student
{
	int id;
	String name;
	
	public Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
}

public class hashsetclass {
	

	
	
	public static void main(String[] args)
	{
		
		Student s1 = new Student(1,"Flash");
		Student s2 = new Student(4,"Arrow");
		Student s3 = new Student(3,"Reverse Flash");
		Student s4 = new Student(2,"Marvel");
		
		HashSet<Student> hd = new HashSet<Student>();
		hd.add(s4);
		hd.add(s1);
		hd.add(s3);
		hd.add(s2);
		
		for(Student d: hd)
		{
		System.out.println(d.id + " -> " + d.name);
		}

	}

}
