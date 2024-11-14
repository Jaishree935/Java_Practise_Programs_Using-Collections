//Write a Java program to reverse elements in an array list.

import java.util.*;
public class Program11{
     public static void main(String [] args){
       ArrayList<Integer> a = new ArrayList<Integer>();
       a.add(100);
       a.add(10); 
       a.add(1);
       a.add(690);
       a.add(23);
       System.out.println(a);
       System.out.println("Arrays after reverse");
       Collections.reverse(a);
       System.out.println(a); 
  }
}


output:
[100, 10, 1, 690, 23]
Arrays after reverse
[23, 690, 1, 10, 100]