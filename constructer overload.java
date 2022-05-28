/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
 class Actor{
    String name;
    String colour;  //instance varibles its can be acces only for this object 
    int age;
    String sixpack;
    String dancer;
    Actor(String a,String b,int c,String d,String e){
        this.name=a;
        this.colour=b;
        this.age=c;
        this.sixpack=d;
        this.dancer=e;}
    
        Actor(){
            this.name= "prabhavathi";
            this.colour="brown";
            this.colour="24";
            this.sixpack="slim";
            this.dancer="yes";
            
        }
    
   String getname(){
       return name;}
       void setname(String a){
           this.name=a;}
      
      void details(){
          System.out.println("name"+"  "+name);
          System.out.println("colour"+"  "+colour);
          System.out.println("age"+"  "+age);
          System.out.println("sixpack"+"  "+sixpack);
          System.out.println("dancer"+"  "+dancer);
      }
      
    }

    public class Main{
        public static void main (String[] args){
          System.out.println("hiiii");  
          Actor pk=new Actor("pk","black",24,"family pack","little bit ");
           Actor RAM=new Actor("ram","white",24,"family pack","good ");
        pk.details();
        RAM.details();
       
      System.out.println(pk.getname()); 
      pk.setname("prabhaprakash");
      System.out.println("name "+pk.getname());
      Actor robo=new Actor();
      //System.out.println(robo.details()); *****void no return ethukulla koduka kodathu
      robo.details();
      
        }
    }
    













