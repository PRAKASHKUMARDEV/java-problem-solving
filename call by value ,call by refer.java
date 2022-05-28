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
      
      Actor(Actor object){                         //stack memeory this types of functions stored 
          this.name=object.name;       //i mean memeory de allocate erase aidum      
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
      
       void incr(int a){
          ++a;
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
          Actor pk=new Actor("pk","black",24,"family pack","little bit ");//this stored heap memory 
           Actor RAM=new Actor("ram","white",24,"family pack","good ");// u mean perment stored its give
           Actor ROBO=new Actor("prabhavathi","white",25,"SLIM","DANCER");// refrence only (address only )
        pk.objectcompar(RAM);/* PASSING objectAS ARGUMENTS address pass agum so be carful example
        i can able incrase ram age let see */
        int a =10;//main method local varibles staack storage 
        pk.incr(a);
        System.out.println(a);//not incrase address not passes value only copy and pass
        }
    }
    
/*call by value means only values goes and copy refrence means adrres orginal change agidum*/

/*new use panni crate panna refrence than pass agum  heap memoery */
/*premitive data type vacha athu call by valuse than pass agum stack memoery*/










