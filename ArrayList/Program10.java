// Write a Java program to shuffle elements in an array list.

import java.util.*;
public class Program10{
public static void main(String [] args){
ArrayList<String> a=new ArrayList<String>();
a.add("Red");
a.add("Yellow");
a.add("Green");
a.add("Violet");
a.add("Purple");
System.out.println(a);
Collections.shuffle(a);
System.out.println(a); 
}
}


output:
[Red, Yellow, Green, Violet, Purple]
[Green, Violet, Purple, Red, Yellow]