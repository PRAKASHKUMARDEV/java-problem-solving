import java.util.*;
 class stack{
   private int[] box=new int[5];
   private  int i;
   stack(){
     i=-1;
     
   }
    public void push(int n){   //private means classkulla mattum 
      if(i==box.length)
      System.out.println("stack is full");// ethuvuma kodukalna default eduthukkum i mean 
      else {                             //this package kulla acces pannikalam 
        i++; 
       box[i]=n;}                      // public varibles  means we can accse anywere example main 
     // private varibles  kodutha base class + derived class acces pannikalam 
     
    }
       
       //box[i++];eppadikodukarathuthan best   
       
      public  int  pop(){
        if(i==-1)
        System.out.println("stack is empty ");
        else {return box[i--];
        }
 }       
  public class Main{  
    public static void main (String[] args) {
     stack Object1=new stack();
     Object1.push(10);
     Object1.push(20);
     Object1.push(14);
     Object1.push(147);
     Object1.push(105);
     System.out.println(Object1.pop());
     System.out.println(Object1.pop());
} 
      
  }
      
 
