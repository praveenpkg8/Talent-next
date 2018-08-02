/* print wether a given character is vowel or not */
import java.util.*;
class vowel{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char x = a.charAt(0);
        if( x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
        {
            System.out.println("The give character is vowel");
        }
        else
        {
            System.out.println(" The given character is not a vowel");
        }
    }
}