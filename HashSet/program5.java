//Write a Java program to test if a hash set is empty or not.
import java.util.*;
public class program5{
  public static void main(String [] args){
     HashSet<String> h_set = new HashSet<String>();
     h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");

  
   System.out.println(h_set);
   
 h_set.removeAll(h_set);
if(h_set.isEmpty()){
System.out.println("True");
}
else{
System.out.println("False");
}
 
 }

}

output:
[Red, White, Pink, Yellow, Black, Green]
True
