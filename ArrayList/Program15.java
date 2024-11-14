//Write a Java program to join two array lists.

import java.util.*;
public class Program15{
     public static void main(String [] args){
         ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");

          ArrayList<String> c2= new ArrayList<String>();
          c2.add("Red");
          c2.add("Green");
          c2.add("Black");
          c2.add("Pink");
           
           c2.addAll(c1);
           System.out.println(c2);
      
  }
}


output:
[Red, Green, Black, Pink, Red, Green, Black, White, Pink]