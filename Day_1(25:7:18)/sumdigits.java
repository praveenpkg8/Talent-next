/* accept a number print factorial of number */
import java.util.*;
class sumdigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r=0;
        int sum = 0;
        do
        {
            r = n % 10;
            n = n/10;
            sum += r;
        }while(n > 9);
        r = n % 10;
        sum += r;


        System.out.println(sum);
    }
}
