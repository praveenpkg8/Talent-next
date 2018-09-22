import java.util.*;
import java.lang.*;
public class Numdifference {
	
	public int sumdiff(int input1)
	{
		int r, sub = 0, i = 1,flag =0;
		while(input1 > 0)
		{
			if(input1 > 9)
			{
				r = input1 %  10 - (input1 / 10) % 10;
				sub += (i * Math.abs(r));
				input1 /= 10;
				i *= 10;
			}
			else
			{

				if(sub > 99)
				{
					input1 = sub;
					sub = 0;
					i = 1;
				}
				else
				{
						flag = 1;
					
				}
			}
			if(flag == 1)
			{
				break;
			}
			
		}
		return sub;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Numdifference b = new Numdifference();
		System.out.println(b.sumdiff(1835));
		
				
		
		

	}

}
