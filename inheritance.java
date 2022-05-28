import java.util.*;
/* what is inheritance i mean basic informations one class and another extra informations another class */
class employee{
   private String name;
    private double salery;
    employee(String a,double b){
        name=a;
        salery=b;
        }
        employee(){// dummy constructer super class with no parameter automatically invoked so we 
            name=" h";// we need avoid error 
            salery=0.0;
        }
        String getname(){
            return name;}
        void setname(String a){
            name=a;}
        void setsalery(double a){
            salery=a;}
        double getsalery(){
            return salery;
        } 
}
 
class manager extends employee{// base cllass varaible and method ellathayium etha acces panna mudiyium
      double bonus;//but private acces panna mudiyathu athukku super class ()use panna mudiyum
       manager(String a,double b,double c){
       super(a,b); //manadary kodukanum ellana automaticallu call agum so namma ethula acces pannalm 
        bonus=c;}
        double getbonus(){
            return bonus;
        }
        void setbonus(double a){
           bonus= a;
        }
        double getsalery(){// override 
            return super.getsalery()+bonus;}
            }// same function duplicate avoid panna super.
        
      class Main{
          
          public static void main (String[] args){
          System.out.println("***************************");
          employee obj=new employee("prakash",10000);
          employee obj1=new manager("robo",100000,24000);
          manager op=new manager("saipallavi",1200,1000);
          System.out.println(op.getname());
          System.out.println(op.getsalery());
          
          /*
          1.superclass object sub and dervied class renduyium address store pannum mudiyium 
          2.derive class object la super class store panna mudiyathu 
          that is called polimazerisam behaviour ora timela 2 place refer pannum */
         // manager obj2=new employee("karthika",10000);// error ***** manager super class object acces panna mudiyathu but 
          // 1.derviedclass object la super class varaibleand method accces panna mudiyum 
          //2.super class obj la sub class method and varaible acces panna mudiyathu appram enna mayurukku 
          //entha feature beacuse override functions mattum use agum ethu peruthan dynamic binding 2 address refer 
          //pannalum ovvride pannum pothu correcta function excuite  pannum example
          System.out.println(obj1.getsalery());//ethu derive class than call pannuchu thats dynamic binding 
          employee[] opp=new employee[5];//objects array create pannalam 
          employee[0]=new employee("ki",1000);
          employee[1]=new employee("kij",1000);
          employee[2]=new employee("khghi",1000);
          employee[3]=new employee("kuui",1000);
          employee[4]=op;
          manager object7=(manager)employee[4];//posible beacuse e3 refer manager address (op)
          manager object5=(manager)employee[0];//not posible e0 refer employeeaddress no chancr to convert
           for(employee i: opp){
              system.out.println(i.gername);}//so for each we can be used reterive objects 
             
             
          
          
      }
        
    }
        
    
    
             













