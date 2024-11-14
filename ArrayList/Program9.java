//Write a Java program to copy one array list into another.

import java.util.*;
public class Program9{
     public static void main(String [] args){
       ArrayList<Integer> a = new ArrayList<Integer>();
       a.add(100);
       a.add(10); 
       a.add(1);
       a.add(690);
       a.add(23);
        System.out.println("List1:" + a);
       ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(145);
       a1.add(108); 
       a1.add(11);
       a1.add(60);
       a1.add(213);
        System.out.println("List2:" + a1);
       Collections.copy(a,a1);
       System.out.println("List1:" + a);
       System.out.println("List2:" + a1);  
  }
}


output:
List1:[100, 10, 1, 690, 23]
List2:[145, 108, 11, 60, 213]
List1:[145, 108, 11, 60, 213]
List2:[145, 108, 11, 60, 213]