//Write a Java program to get the first and last occurrence of the specified elements in a linked list.

import java.util.*;
public class program10{
public static void main(String [] args){
LinkedList<String> l = new LinkedList<>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
l.add("Yellow");
System.out.println("The original list: " +l);
 
 System.out.println("The First list: " +l.getFirst());
 
 

 System.out.println("The Last list: " +l.getLast());

}
}

output:
The original list: [Red, Green, Black, White, Pink, Yellow]
The First list: Red
The Last list: Yellow
