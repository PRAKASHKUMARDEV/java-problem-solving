import java.util.*;
/* what is static static means its not realetd to object its sepearted memeory locations have 
so static method invoked automaticaly before crate the object so taht  object variables and method 
we cannot be used in static methods */
 class staticc{
    private String name;
    private int age;
    static int count;//its realted to object one time only space allocated before crate object
    staticc(String a,int b){
       this.name=a;
       this.age=b;
       count++;
    }
    public void setage(staticc obj){//copy constrctor
       this.age=obj.age;
    }
    static void  num(){
        System.out.println(count);
    }
    public void show(){//copy constrctor
       
      System.out.println(age) ;
    
}
}
 class Main{
 public static void main (String[] args) {
   
   staticc obj1=new staticc("prakash",24);
   staticc obj2=new staticc("prabha",25);
   System.out.println(staticc.count);//class name needed to acces static 
   System.out.println("I WANT CHANG MY GIRLS AGE ");
   obj2.setage(obj1);
   obj2.show();
 }
 }
   
   
   
   
   
   
     
 
 
 
