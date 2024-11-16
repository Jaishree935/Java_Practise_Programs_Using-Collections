 //Write a Java program to convert a linked list to an array list.
import java.util.*;
public class program23 {
 public static void main(String[] args) {
  // create an empty linked list
  LinkedList <String> c1 = new LinkedList <String> ();
            c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original linked  list: " + c1);
           
       List<String> l1= new ArrayList<String>(c1);
for(String s: l1){
 System.out.println(s);
 }
  }
}

output:
Original linked  list: [Red, Green, Black, White, Pink]
Red
Green
Black
White
Pink