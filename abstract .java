import java.util.*;
//abstract means common datas present base class other feature present in deriverd in derive class thats 
/*main motive of oops programe cames .abstract blue print ,undefined function koduthuduvom atha
derive class defined pannumm(mandidary)*/
abstract class people{
    abstract void feedback();//below child is responsable for method defined manaditary
    
}
 class students extends people{
    
    public void feedback(){
    System.out.println("enter your feed back ");
    Scanner in= new Scanner(System.in);
    String sc=in.next();
        System.out.println("students feedback"+sc);
    }
   
    
}
 class girls  extends people{
   public  void feedback(){
    System.out.println("enter your feed back ");
    Scanner in= new Scanner(System.in);
    String s1=in.next();
     System.out.println("girls feedback"+s1); }
  
}
 public class Main {
      public static void main(String[] args){
          //ABSTRACT ITS PURE COMMON CLASS WE CANNOT ABLE TO CRATE Object
          //ITS STORED BOTH CHILD OBJECTS 
         people[] ob =new people[5];
         
          ob[0]=new students();// abstract to store all child OBJECTS first its  goes
          ob[1]=new girls();
           ob[2]=new students();// ethu easyya erukkula ora class obj vachi ethana class vena obj ,methos
          ob[3]= new girls();
           ob[4]=new girls();//call pannalam 
          
          //abstract search undefined fun and goes search defined area child 
          /*class thats why we canot able to create object for abstract beacause there is no function 
          defined*/
          //hi();

         for (people i: ob)
               i.feedback();
          
          
      }
  }
    
    
    
    
    
