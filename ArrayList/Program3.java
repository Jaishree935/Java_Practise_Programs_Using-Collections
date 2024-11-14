//Write a Java program to insert an element into the array list at the first position.

import java.util.*;
public class Program3{
public static void main(String [] args){
ArrayList<String> a=new ArrayList<String>();
a.add("Red");
a.add("Yellow");
a.add("Green");
a.add("Violet");
a.add("Purple");
for(String i : a){
System.out.println(i);
}
a.add(0,"White");
System.out.println("Add new element in first position");
for(String i : a){
System.out.println(i);
}

}
}


output:

Red
Yellow
Green
Violet
Purple
Add new element in first position
White
Red
Yellow
Green
Violet
Purple