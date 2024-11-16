//Write a Java program to append the specified element to the end of a hash set.

import java.util.*;
public class Program1{
  public static void main(String [] args){
     HashSet<String> h_set = new HashSet<String>();
     h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");

   // print the hash set
   System.out.println("The Hash Set: " + h_set);
 }

}

output:
The Hash Set: [Red, White, Pink, Yellow, Black, Green]