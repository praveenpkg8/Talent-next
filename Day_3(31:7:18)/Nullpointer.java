package com.java.main;

public class Nullpointer {
	public static void main(String[] args)
	{
		int[] arr = new int[4];
		try {
			int i = arr[4];
			System.out.println("Try block");
		}
		catch(NullPointerException nx)
		{
			System.out.println("catch block");
			System.out.println(nx);
		}
		finally
		{
			System.out.println("Finnaly block");
		}
	}
	

}
