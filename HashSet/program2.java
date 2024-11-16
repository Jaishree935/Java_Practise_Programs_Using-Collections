//Write a Java program to iterate through all elements in a hash list

import java.util.*;
public class Program2{
  public static void main(String [] args){
     HashSet<String> h_set = new HashSet<String>();
     h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");

 Iterator<String> p = h_set.iterator();
  // Iterate the hash set
   while (p.hasNext()) {
   System.out.println(p.next());
   }
    
 }

}

output:
Red                                                                    
White                                                                  
Pink                                                                   
Yellow                                                                 
Black                                                                  
Green