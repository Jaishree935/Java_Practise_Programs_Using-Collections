//Write a Java program to join two linked lists.
import java.util.*;
public class program17{
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
l.addAll(l2);
System.out.println("The original list: " +l);
}
}

output:
The original list: [Red, Green, Black, White, Pink, Yellow]
The original list: [Red, Green, Black, White, Pink, Yellow, Red1, Green1, Black1, White1]