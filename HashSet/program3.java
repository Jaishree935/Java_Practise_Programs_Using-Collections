// Write a Java program to get the number of elements in a hash set.
import java.util.*;
public class program3{
  public static void main(String [] args){
     HashSet<String> h_set = new HashSet<String>();
     h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");

  
   System.out.println(h_set);
   
      System.out.println(h_set.size());
 }

}



output:
[Red, White, Pink, Yellow, Black, Green]
6