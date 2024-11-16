//Write a Java program to clone a hash set to another hash set.
import java.util.*;
public class program6{
  public static void main(String [] args){
     HashSet<String> h_set = new HashSet<String>();
     h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");

  HashSet<String> h = new HashSet<>();
  h=(HashSet)h_set.clone();
   System.out.println(h_set);
   
      System.out.println(h);
 }

}

output:
[Red, White, Pink, Yellow, Black, Green]
[Red, White, Pink, Black, Yellow, Green]