/*1. class and abstract and imterface 3 use pannalam ethula abstarct and interface object crate panna mudiyathu but normal classku 
base and sub class object store panna mudyium 
2.abstract class use panna athula abstract methodu no defined atha base classla kandippa define pannanum but abstract 
class la abstract methods and another methods defined pannalam but muliplr inheritance not possible 
3.interface la only abstract class ubdefined panna mudyium ,multiple inheritance we can acheive same object ethukunu create 
panna mudiyathu instance variables create panna mudiyathu all variables consider finally,and methods also public abstracts in deafault 
so derived class layium public than .better we can use interface or u can go class or abstracts.*/
// let see example 
import java.util.*;
class  vechiles {
    void ride(){
        
    } 
}
class car extends vechiles{
    void ride(){
        System.out.println("your riding a car ");
    } 
}
class  bike  extends vechiles{
    void ride(){
        System.out.println("your riding a bike  ");
    } 
}
     class  mech {
      void check (vechiles v){
        System.out.println("i am checking   ");
        
        v.ride();
    } 
   /* void check (car c){
        System.out.println("i am checking   ");
        
        c.ride();
}*/
}
 public class Main  { // oru class function varaibles ennoru class extend pannathan use panna mudyium or antha class object than use panna mudyium
    public static void main(String[] args ){
      System.out.println("check your vechiles ") ; 
      bike b=new bike();
      car c=new car();
      Main ob=new Main();
      mech ob2=new mech();
      ob2.check(c);
      //ob2.check(c);// i need car so again u need write fun its not good so we can go abstract or commomn or interface 
      
       }
}





