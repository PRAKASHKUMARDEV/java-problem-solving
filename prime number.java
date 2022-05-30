import java.util.*;
    

public class Main
{
	 static int isprime(int a){
     int count=0;
     for(int i=1;i<=a;i++){
      if(a%i==0)
      count++;}
     
     return count;
     
 }
	
	public static void main(String[] args) {
		System.out.println("enetr your number ");
	//	Scanner num=new Scanner(System.in);
	
		int result = isprime(9);
		if (result==2)
		System.out.println("your  enterd number is prime ");
		else 
		System.out.println("your  enterd number is not prime ");
	}
	
	
}
