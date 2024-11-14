//Write a Java program to remove the third element from an array list.

import java.util.*;
public class Program6{
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
a.remove(2);
System.out.println("After Removing 3rd element");
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
After Removing 3rd element
Red
Yellow
Violet
Purple