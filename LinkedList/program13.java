// Write a Java program to remove the first and last elements from a linked list.
import java.util.*;
public class program13{
public static void main(String [] args){
LinkedList<String> l = new LinkedList<>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
l.add("Yellow");
System.out.println("The original list: " +l);
 
System.out.println("The original list: " +l.removeFirst());
System.out.println("The original list: " +l.removeLast());
 }
}

output:
The original list: [Red, Green, Black, White, Pink, Yellow]
The original list: Red
The original list: Yellow