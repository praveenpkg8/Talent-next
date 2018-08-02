/*  print prime 0 to 100 */
import java.util.*;
class prime100
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 2; i <= 100 ; i++)
        {
            for(int j = 2; j <= i ; j++)
            {
                if( i % j == 0)
                {
                    if ( i == j)
                    {
                        System.out.println(i + " is a prime number");
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
    }
}
