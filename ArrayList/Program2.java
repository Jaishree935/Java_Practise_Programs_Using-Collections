Write a Java program to iterate through all elements in an array list.

import java.util.*;
public class Program2{
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
}
}


output:
Red
Yellow
Green
Violet
Purple