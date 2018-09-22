import java.util.*;  
class hashmaap{  
 public static void main(String args[]){  
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  hm.put(1, "Felicity");
  hm.put(2, "Arrow");
  hm.put(3, "Flash");
  hm.put(4, "ReverseFlash");
  System.out.println(hm);
  hm.remove(3);
  System.out.println(hm);

 }  
}  