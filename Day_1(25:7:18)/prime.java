/* accept a number print prime or not */
import java.util.*;
class prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i < n; i++)
        {
            if( n % i == 0)
                flag = false;
            
        }
        if(flag)
            System.out.println("prime number");
        else
            System.out.println("not a prime number");

    }
}
