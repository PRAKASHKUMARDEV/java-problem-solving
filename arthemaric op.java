import java.util.*;
class input{
	
	
	public static void main(String[] args ) {
	
		System.out.println("arthematic operaters +,/,-,+ ");
		System.out.println("coumpontass a+=3 a-=3 a/=3 a%=a");
		System.out.println("post increment a++ pre increment ++a");
		
		Scanner in=new Scanner(System.in);
		
   int a=in.nextInt();
   int b=in.nextInt();
++a;
b++;
a-=a;
a+=10;
System.out.println(a);
System.out.println(b);
