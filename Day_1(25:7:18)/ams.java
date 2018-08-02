/* accept a number print  amstrong number or not */
import java.util.*;
class ams
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r=0;
        int q=n;
        int sum = 0;
        do
        {
            r = q % 10;
            q = q/10;
            sum = sum + (r*r*r);
        }while(q > 9);
        r = q % 10;
        sum = sum + (r*r*r);


        if(n == sum)
        {
            System.out.println("gven number is amstrong number");
        }
        else
        {
            System.out.println("gven number is not amstrong number");
        }
    }
}
