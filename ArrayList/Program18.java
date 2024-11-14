//Write a Java program to test whether an array list is empty or not.


import java.util.*;
public class Program18{
     public static void main(String [] args){
         ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");

            
         c1.removeAll(c1);
           if(c1.isEmpty()){ 
           System.out.println("True");
      }
else{
System.out.println("False");
}
  }
}


output:
True