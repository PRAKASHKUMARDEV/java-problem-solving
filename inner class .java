 
 import java.util.*;
 import java.lang.*;
 
 
 
 class outer{
    int ball;
    String name;
      void display1(){
        System.out.println(" outer  ");}
 class inner {
    int balll;
    String name;
     void display(){
        System.out.println(" inner ");
    }
    
}
}
public class Main {
public static void main (String[] args) {
    outer a=new outer();
    outer.inner ob =new a.inner();//thats means every outer classku inner class object crate pannalam pola
    ob.display();
    //suupose inner class  static eruntha 
    outer.inner ob =new outer.inner();//class name kodukanum
    
    
    
    
    
}
}
