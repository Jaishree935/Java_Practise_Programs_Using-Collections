//Write a Java program to remove a specified element from a linked list.
import java.util.*;
public class program12{
public static void main(String [] args){
LinkedList<String> l = new LinkedList<>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
l.add("Yellow");
System.out.println("The original list: " +l);
l.remove(2);
System.out.println("The original list: " +l);
 }
}

output:
The original list: [Red, Green, Black, White, Pink, Yellow]
The original list: [Red, Green, White, Pink, Yellow]