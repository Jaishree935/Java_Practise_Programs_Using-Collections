//Write a Java program to iterate a linked list in reverse order.

import java.util.*;
public class program4{
public static void main(String [] args){
LinkedList<String> l = new LinkedList<>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
l.add("Yellow");

 System.out.println("The original list: " +l);
Iterator p = l.descendingIterator();
System.out.println("Reverse Order");
while(p.hasNext()){
System.out.println(p.next());
}

}
}

output:
The original list: [Red, Green, Black, White, Pink, Yellow]
Reverse Order
Yellow
Pink
White
Black
Green
Red