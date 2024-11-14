//Write a Java program to update an array element by the given element.

import java.util.*;
public class Program5{
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
a.set(2,"Blue"); 
System.out.println("**After Update **");
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
**After Update **
Red
Yellow
Blue
Violet
Purple