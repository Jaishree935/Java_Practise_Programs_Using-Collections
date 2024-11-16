 //Write a Java program to insert elements into the linked list at the first and last positions.

import java.util.*;
public class program6{
public static void main(String [] args){
LinkedList<String> l = new LinkedList<>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
l.add("Yellow");

 System.out.println("The original list: " +l);
l.addFirst("Orange");
l.addLast("Violet");

 System.out.println("The original list: " +l);

}
}

output:

The original list: [Red, Green, Black, White, Pink, Yellow]
The original list: [Orange, Red, Green, Black, White, Pink, Yellow, Violet]
