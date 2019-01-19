import java.util.*;
import java.io.*;

public class swapmin {

 static int swapm(int[] arr)
 {
     int sum=0;
     int[] rarr=arr;
     Arrays.sort(rarr);
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]>=rarr[i])
         {
             sum=sum+arr[i]-rarr[i] ;
         }
         else if(arr[i]<rarr[i])
         {
             sum=sum+rarr[i]-arr[i] ;
         }

     }
     return sum-1;
 }

    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
        }
        int k =  swapm(arr);
System.out.println(arr);

    }
}
