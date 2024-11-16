//Write a Java program to insert the specified element at the front of a linked list.


import java.util.*;
public class program7{
public static void main(String [] args){
LinkedList<String> l = new LinkedList<>();
l.add("Red");
l.add("Green");
l.add("Black");
l.add("White");
l.add("Pink");
l.add("Yellow");

 System.out.println("The original list: " +l);
l.offerFirst("Orange");
 

 System.out.println("The original list: " +l);

}
}


output:

The original list: [Red, Green, Black, White, Pink, Yellow]
The original list: [Orange, Red, Green, Black, White, Pink, Yellow]