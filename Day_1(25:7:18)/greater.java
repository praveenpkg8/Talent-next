/* print greaater of two number */
import java.util.*;
class greater
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b)
        System.out.println(a + " is gretaer than " + b);
        else if(a < b)
        System.out.println(b + " is greater than " + a);
        else
        System.out.println( a + " and " + b + " are equal");
    }

}