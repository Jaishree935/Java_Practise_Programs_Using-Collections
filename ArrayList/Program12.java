//Write a Java program to extract a portion of an array list.

import java.util.*;
public class Program12{
     public static void main(String [] args){
       List<Integer> a = new ArrayList<Integer>();
       a.add(100);
       a.add(10); 
       a.add(1);
       a.add(690);
       a.add(23);
          System.out.println("Original list: " + a);
     List<Integer> a1 = a.subList(0,3);
    System.out.println("List of first three elements: " + a1);
    
      
  }
}


output:
Original list: [100, 10, 1, 690, 23]
List of first three elements: [100, 10, 1]