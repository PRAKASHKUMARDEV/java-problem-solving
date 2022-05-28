
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("write a program for get input 1d array and display it");
		String[][] array1=new String[2][];
		array1[0]=new String[5];
		array1[1]=new String[2];
		Scanner in=new Scanner(System.in);
		for (int i=0;i<array1.length;i++){
		    for (int j=0;j<array1[i].length;j++){
		    array1[i][j]=in.next();}
		}
	
		
	       for(String[] i:array1)
	         for(String j:i)
		System.out.println("YOUR SUBJECTS"+"      " +j);
		
	}
}
