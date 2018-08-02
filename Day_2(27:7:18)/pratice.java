/*program for praticing class in java
Single level inheritance */
import java.util.*;
class b extends c
    {
        c ac = new c();
        int b= 10;
        void add()
        {
            System.out.println(" Dynamic Polymorhism");

        }
        void sub()
            {
                System.out.println("subtraction is formed "+ ac.a);
            }
    }
class c 
    {
        int a=10;
    }

class a extends b
    {
        a()
        {
            System.out.println(" constructor called");
        }
        int a,b;
        Scanner sc = new Scanner(System.in);
        void add()
        {
        System.out.println(" Enter the two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
        }
        void add(int a, int b)
        {
        System.out.println(a+b);
        }
        void add(int a, int b,int c)
        {
        System.out.println(a+b+c);
        }
    }

class pratice extends a
{
    
    public static void main(String[] args)
    {
        a ab = new a();
        a abb = new b();

/*  Static Polymorphism  */

        ab.add();
        ab.add(2,3);
        ab.add(1,2,3);
        ab.sub();
        abb.add();
    }
}