import java.util.*;
 class stack{
   int[] box=new int[5];
   int i;
   stack(){
     i=-1;
     
   }
    void push(int n){
      if(i==5)
      System.out.println("stack is full");
      else {
        i++; 
       box[i]=n;}
    }
       
       //box[i++];eppadikodukarathuthan best   
       
       int  pop(){
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
      
 
