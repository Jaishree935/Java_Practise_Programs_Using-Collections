//Write a Java program to copy a linked list to another linked list.

import java.util.*;
public class program18{
public static void main(String [] args){
LinkedList<String> l = new LinkedList<>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
l.add("Yellow");
System.out.println("The original list: " +l);
LinkedList<String> l2 = new LinkedList<>();
l2.add("Red1");
l2.add("Green1");
l2.add("Black1");
l2.add("White1");
l2=(LinkedList)l.clone();
System.out.println("The original list: " +l);
}
}

output:
The original list: [Red, Green, Black, White, Pink, Yellow]
The original list: [Red, Green, Black, White, Pink, Yellow]