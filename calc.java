import java.util.*;

class  calc
{

	 static void add(double a,double b){
		System.out.println("your entered valuse is sum is "+(a+b));}
		
		static void sub(double a,double b){
		System.out.println("your entered valuse is sum is "+(a-b));}
		
	
	static void mul(double a,double b){
		System.out.println("your entered valuse is sum is "+(a*b));}
		
	
	static void div(double a,double b){
		System.out.println("your entered valuse is sum is "+(a/b));}
		
	
	
	
	public static void main(String[] args) 
	{
	
System.out.println("please enter your number ");
Scanner input =new Scanner(System.in);
 double a=input.nextFloat();
 double b=input.nextFloat();
 input.nextLine();
 String c=input.nextLine();
switch( c){
case "add":
add(a,b);
break;
case "sub":
sub(a,b);
break;
case "mul":
mul(a,b);
break;
case "div":
div(a,b);
break;
default:
	System.out.println("please enter a valide sysmbol");
	}
}
}
