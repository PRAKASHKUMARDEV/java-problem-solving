/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("write a program for get input 1d array and display it");
		String[] array1=new String[5];
		Scanner in=new Scanner(System.in);
		for (int i=0;i<array1.length;i++)
		array1[i]=in.next();
		
		for(String i:array1)
		System.out.println("YOUR SUBJECTS"+"      " +i);
		
	}
}
