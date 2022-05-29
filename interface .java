/*      what is diffrent between class ,abstract ,interface 3 nalayiyum two objects store dyanamic binding 
what is declearation is diffrent 
1.class { kulla function defined pannithan aganum or empty function } but athu derive class la defined pannum compulsary ella.
and extra normal function defined 
pannalam
2.abstractla abtract{no defined pannavenam },but athu derive class la defined pannum compulsary *,and extra normal function defined 
pannalam 
3.interface la ellama abtract{no defined pannavenam },but athu derive class la defined pannum compulsary *,and extra normal function defined 
pannamudiyathu apdi pannumna deafult key use pannum .class one than extends but multiple interface can be extends 
*/
// let see example 
import java.util.*;
 interface class  vechiles { // we also defined 
   final  int a ;    // in default final public abtract 
    public abstract void ride();
    default void hi(){
        System.out.println("be carfully to ride ");
    }
        
}
class car implements vechiles{
  public  void ride(){  // public must in interface 
        System.out.println("your riding a car ");
    } 
}
class  bike  implements  vechiles{
   public void ride(){
        System.out.println("your riding a bike  ");
    } 
}
     class  mech {
      void check (vechiles v){// i mean vechile lala 2 object strore pannsa mudyium ethan dynamic binding 
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
      mech op=new mech();
      vechilles op//create pannamudiyathu same absytract
      car c =new car();
      bike d=new bike();
      op.check(c);
      op.bike (d);
       }
}





