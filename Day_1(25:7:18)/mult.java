/* accept N print 15 multiples of N */
import java.util.*;
class mult
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        for(int i = 0; i < 15 ; i++, sum += n)
        System.out.println(sum);
    }
}
