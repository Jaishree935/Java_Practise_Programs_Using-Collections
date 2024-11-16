// Write a Java program to remove and return the first element of a linked list.

import java.util.*;
public class program19 {
 public static void main(String[] args) {
  // create an empty linked list
  LinkedList <String> c1 = new LinkedList <String> ();
            c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original linked  list: " + c1);
           
     System.out.println("Removed element: "+c1.pop());
     
     System.out.println("Linked list after pop operation: "+c1);
  }
} 
output:
Original linked  list: [Red, Green, Black, White, Pink]                
Removed element: Red                                                   
Linked list after pop operation: [Green, Black, White, Pink]