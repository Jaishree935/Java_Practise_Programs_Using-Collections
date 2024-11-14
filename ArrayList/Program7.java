//Write a Java program to search for an element in an array list.

import java.util.*;
public class Program7{
public static void main(String [] args){
ArrayList<String> a=new ArrayList<String>();
a.add("Red");
a.add("Yellow");
a.add("Green");
a.add("Violet");
a.add("Purple");
if(a.contains("Purple")){
System.out.println("Found the element");
} 
else{
System.out.println("Not found the element");
}
}
}
