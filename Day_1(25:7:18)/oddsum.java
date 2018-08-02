/* Accept two numbers and print sum is odd or even */
import java.util.*;
class oddsum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( (a + b) % 2 == 0)
        {
            System.out.println(" sum of two number is even");
        }
        else
        {
            System.out.println(" sum of two number is odd");
        }
    }
}