//Write a Java program to retrieve, but not remove, the first element of a linked list.

import java.util.*;
public class program20 {
 public static void main(String[] args) {
  // create an empty linked list
  LinkedList <String> c1 = new LinkedList <String> ();
            c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original linked  list: " + c1);
           
     System.out.println("Removed element: "+c1.peekFirst());
     
     System.out.println("Linked list after pop operation: "+c1);
  }
} 

output:
Original linked  list: [Red, Green, Black, White, Pink]
Removed element: Red
Linked list after pop operation: [Red, Green, Black, White, Pink]
