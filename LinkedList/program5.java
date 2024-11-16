//Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.*;
public class program5{
public static void main(String [] args){
LinkedList<String> l = new LinkedList<>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
l.add("Yellow");
 System.out.println("The original list: ");
  for(String s : l){
System.out.println(s);
 }
 l.add(1,"Purple");
 System.out.println("The new list: " +l);
}
}

output:
The original list:
Red
Green
Black
White
Pink
Yellow
The new list: [Red, Purple, Green, Black, White, Pink, Yellow]
