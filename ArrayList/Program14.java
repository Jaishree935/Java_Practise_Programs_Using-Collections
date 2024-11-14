//Write a Java program that swaps two elements in an array list.
import java.util.*;
public class Program14{
     public static void main(String [] args){
       List<Integer> a = new ArrayList<Integer>();
       a.add(100);
       a.add(10); 
       a.add(1);
       a.add(690);
       a.add(23);
          System.out.println("Original list: " + a);
       Collections.swap(a,0,3);
          System.out.println("Original list: " + a); 
      
  }
}



output:
Original list: [100, 10, 1, 690, 23]
Original list: [690, 10, 1, 100, 23]