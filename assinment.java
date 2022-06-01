/******************************************************************************
assinment

*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
int k=1;
    for (int i = 1; i <= 9; i++)
      {
	for (int j = 1; j <= 5; j++)
	  {
	    if (i ==1 || i == 5||i==9||j==1||j==5)
	      {
		System.out.print ("*");
	      }
	    else if(i>5){
	        System.out.print(k);
	        k++;
	    }else{
		System.out.print (" ");
	      }
	    
	    }
	   System.out.println ();   
	  }
	
      }
  }

