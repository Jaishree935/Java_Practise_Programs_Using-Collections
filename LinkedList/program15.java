//Write a Java program that swaps two elements in a linked list.
import java.util.*;
public class program15{
public static void main(String [] args){
LinkedList<String> l = new LinkedList<>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
l.add("Yellow");
System.out.println("The original list: " +l);
Collections.swap(l,0,2);
System.out.println("The original list: " +l);
}
}
output:
The original list: [Red, Green, Black, White, Pink, Yellow]
The original list: [Black, Green, Red, White, Pink, Yellow]