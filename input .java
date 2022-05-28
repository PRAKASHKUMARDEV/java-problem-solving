
import java.util.*;
class input{
	
	
	public static void main(String[] args ) {
	
		System.out.println("enter your number ,char,  float  ,int  ,  string ,bollen ");
		Scanner in=new Scanner(System.in);
		
        /*Method	Description
nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user 
next().charAt(0) read for single character */
		
   int a=in.nextInt();
   char c = in.next().charAt(0);
System.out.println("your enterd number and charcter "+a+" " +c);


		
		
	}
}
