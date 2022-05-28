
import java.util.*; 
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
System.out.print("DO U WANT TO STRORE STUDENTS RECORDS  ");  
String str= sc.next();   //reads string before the YESspace  
   
/*type var-name[];
OR
type[] var-name;
byte byteArray[];
short shortsArray[];
boolean booleanArray[];
long longArray[];
float floatArray[];
double doubleArray[];
char charArray[]*/   //string1.equals(string2)
if (str.equals("yes")){
    System.out.println("You have entered: "+str ); 
    int marks[]=new int[5];//5 space craeted 
    for (int i=0;i<marks.length;i++){
        marks[i]=sc.nextInt();
    }
  for (int i :marks)
    System.out.println("You have entered: "+ i); 
    
   // System.out.println()
}
                     
      
       
        
        
        
        
    
     
        
    }
}
