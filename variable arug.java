import java.util.*;
/* 
varaguments means we dont know how many argumanets but we can acces numbers varaguments
without using overloading method bigthanks to developers 
*/
 class Main {
 
 
 
 static void findmax(int... values){
     int max =values[0];
     for (int i:values)
       if (max<i)
          max=i;
    System.out.println("max value is ="+max);
 }
 public static void main (String[] args) {
    
    findmax(5,6,10,20,80); //its static method but 
 }
   
 } 
   
     
 
 
 
