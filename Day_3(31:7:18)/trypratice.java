package com.java.main;

public class trypratice {
public static void main (String[] args) {
	int[] arr = new int[4];
	try
	{
		int i = arr[4];
		System.out.println("Try index block");
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println("Exception caught in catch block");
		System.out.println(ex);

	}
	System.out.println("Outside try catch block");
}
}