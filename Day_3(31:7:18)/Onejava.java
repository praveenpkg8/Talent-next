package com.java.main;

import java.io.*;

public class Onejava {
	public static void main( String args[])
	{
		PrintWriter output = null;
		try
		{
			output = new PrintWriter("hello/one.txt");
			output.println("Hello world");
			//output.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex.toString());
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("hello world");
			if( output != null)
				output.close();
		}
	}

}
