//Write a Java program to sort a given array list.

import java.util.*;
public class Program8{
     public static void main(String [] args){
       ArrayList<Integer> a = new ArrayList<Integer>();
       a.add(100);
       a.add(10); 
       a.add(1);
       a.add(690);
       a.add(23);
       System.out.println(a);
       System.out.println("Arrays after sort");
       Collections.sort(a);
       System.out.println(a); 
  }
}


output:

[100, 10, 1, 690, 23]
Arrays after sort
[1, 10, 23, 100, 690]