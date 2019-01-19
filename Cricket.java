package Unique;
import java.util.*;
public class Cricket {
	static void insca(int r,int a)
	{
		r-=(50-(50%a));
		a+=(50-(50%a));
	}
	static void inscb(int r,int b)
	{
		r-=(50-(50%b));
		b+=(50-(50%b));
	}	
	public static void main(String[] args){
		int a,b,r;
		Scanner sc= new Scanner(System.in);
		r=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		while(r>=50)
		{
			
			if((50%a)>(50%b))
			{
				insca(r,a);
			}
			else if((50%a)<(50%b))
			{
				inscb(r,b);
			}
			else if((50%a)==(50%b))
			{
				if(a>=b)
				{
					insca(r,a);
				}
				else if(a<b)
				{
					inscb(r,b);
				}

			}
			if(r<50 && r>0)
			{
				while(r>0)
				{
					if((50%a)>(50%b) && r>(50-(50%a)))
					{
						insca(r,a);
					}
					else if((50%a)<(50%b) && r>(50-(50%b)))
					{
						inscb(r,a);
					}
					else if((50%a)>(50%b))
					{
						if(r%2==0)
						{
							a=a+r/2;
							b=b+r/2;
							r=0;
						}
						if(r%2!=0)
						{
							a=a+r/2;
							b=b+r/2;
							r=0;
							if(a>=b)
							{
								a++;
							}
							else if(a<b)
							{
								b++;
							}
						}
					}
				}
				
			}
		}
		sc.close();
		System.out.println(a+" "+b);
	}

}
