//Write a Java program to display elements and their positions in a linked list.

import java.util.*;
public class program11{
public static void main(String [] args){
LinkedList<String> l = new LinkedList<>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
l.add("Yellow");
System.out.println("The original list: " +l);
 for(int p=0; p < l.size(); p++)
   {
      System.out.println("Element at index "+p+": "+l.get(p));
    }
 }
}



output:
The original list: [Red, Green, Black, White, Pink, Yellow]
Element at index 0: Red
Element at index 1: Green
Element at index 2: Black
Element at index 3: White
Element at index 4: Pink
Element at index 5: Yellow