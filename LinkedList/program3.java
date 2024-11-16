//Write a Java program to iterate through all elements in a linked list starting at the specified position

import java.util.*;
public class program3{
public static void main(String [] args){
LinkedList<String> l = new LinkedList<>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
l.add("Yellow");
Iterator p = l.listIterator(1);
while(p.hasNext()){
System.out.println(p.next());
}
}
}



output:
Green
Black
White
Pink
Yellow