//Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.*;
public class Program4{
public static void main(String [] args){
ArrayList<String> a=new ArrayList<String>();
a.add("Red");
a.add("Yellow");
a.add("Green");
a.add("Violet");
a.add("Purple");
 
System.out.println(a.get(2));
System.out.println(a.get(4));
}

}

output:

Green
Purple