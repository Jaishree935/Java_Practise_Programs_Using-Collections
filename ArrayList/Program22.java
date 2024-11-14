//Write a Java program to print all the elements of an ArrayList using the elements' position.


import java.util.*;
public class Program22{
public static void main(String [] args){
ArrayList<String> a=new ArrayList<String>();
a.add("Red");
a.add("Yellow");
a.add("Green");
a.add("Violet");
a.add("Purple");
for(int i=0;i<a.size();i++){
System.out.println(a.get(i));
}
}
}

output:
Red
Yellow
Green
Violet
Purple
