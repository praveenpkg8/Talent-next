package com.java.main;

public class Finally {
	public static void main( String[] args)
	{
		int[] arr = new int[4];
		try
		{
			int i = arr[4];
			System.out.println("try Block");

		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("catch block");
			System.out.println(ex);
		}
		finally
		{
			System.out.println("Final Block");
		}
	}

}
