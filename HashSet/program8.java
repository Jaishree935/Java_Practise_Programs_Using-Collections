//Write a Java program to convert a hash set to a tree set.

import java.util.*;
public class program8{
  public static void main(String [] args){
     HashSet<String> h_set = new HashSet<String>();
     h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");

   System.out.println(h_set);

  Set<String> s = new TreeSet<String>(h_set);
     System.out.println("Treeset elements: ");
      for(String element : s){
        System.out.println(element);
     }
  
 }

}

output:
[Red, White, Pink, Yellow, Black, Green]
Treeset elements:
Black
Green
Pink
Red
White
Yellow