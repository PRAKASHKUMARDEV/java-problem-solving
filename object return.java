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
            this.age=24;
            this.sixpack="slim";
            this.dancer="yes";
      }
      
      Actor(Actor object){              
          this.name=object.name;          
          this.colour=object.colour;             
          this.age=object.age;
          this.sixpack=object.sixpack;
          this.dancer=object.dancer;
      }
      
     void  objectcompar(Actor object){           
         object.age++;
         if(this.age==object.age)
         System.out.println("both are same age persons ");
         else 
         System.out.println("ram age incrased  ");
      }
      
       
      //object retuern panna class name kodukanum 
     Actor obre(){
         Actor temp=new Actor();//heap perment address crate aiduchu so entha address return pandrom thats all
         temp.name="sri mathi";
         temp.age=this.age;//this optional
         temp.colour=this.colour;
         temp.sixpack=this.sixpack;
         temp.dancer=this.dancer;
         return temp;//address of  heap memorey return 
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
          Actor pk=new Actor("pk","black",24,"family pack","little bit ");
          Actor ROBO=new Actor("prabhavathi","white",25,"SLIM","DANCER");
          Actor mathi;//ethukku new koduthu address strore pannanum 
          mathi=ROBO.obre();
          mathi.details();
        }
    }












