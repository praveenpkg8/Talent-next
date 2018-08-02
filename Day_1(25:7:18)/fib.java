/* accept a number print factorial of number */
import java.util.*;
class fib
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib = 0,sum =0;
        int a=0,b=1;
        for(int i = 1; i <= n ; i++)
        {
            fib = fib + a;
            a=b;
            b=fib;
            sum += fib;
            System.out.println(fib);
        }
            System.out.println(sum);

    }
}
