//Write a Java program to convert a hash set to an array.

import java.util.*;
public class program7{
  public static void main(String [] args){
     HashSet<String> h_set = new HashSet<String>();
     h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");

   System.out.println(h_set);
String[] new_array = new String[h_set.size()];
      h_set.toArray(new_array);
 
     // Displaying Array elements
     System.out.println("Array elements: ");
      for(String element : new_array){
        System.out.println(element);
     }
  
 }

}

output:
Original Hash Set: [Red, White, Pink, Yellow, Black, Green]            
Array elements:                                                        
Red                                                                    
White                                                                  
Pink                                                                   
Yellow                                                                 
Black                                                                  
Green
