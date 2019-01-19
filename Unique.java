package Unique;
import java.util.*;




public class Unique {
	
	static boolean uniqueString(String str)
	{
		if(str.length()>128)
			return false;
		boolean[] charset  = new boolean[128];
		
		for(int i=0;i<str.length();i++)
		{ 
			int val=str.charAt(i);
			if(charset[val])
			{
				return false;
				
			}
			charset[val]=true;
		}
		
		return true;
	}
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	String str=sc.nextLine();
	boolean s = uniqueString(str);
	System.out.println(s);
	
}
	
}
