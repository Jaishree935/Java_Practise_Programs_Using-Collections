//Write a Java program to iterate through all elements in a linked list.
import java.util.*;
public class program2{
public static void main(String [] args){
LinkedList<String> l = new LinkedList<>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
l.add("Yellow");

  for(String s : l){
System.out.println(s);
 }
}
}



output:
Red
Green
Black
White
Pink
Yellow