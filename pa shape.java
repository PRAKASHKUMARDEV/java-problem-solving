/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {

    for (int i = 1; i <= 5; i++)
      {
	for (int j = 1; j <= 5; j++)
	  {
	    if (i ==1 || i == 5||j==1||j==5)
	      {
		System.out.print ("*");
	      }
	    else
	      {
		System.out.print (" ");
	      }
	  }
	System.out.println ();
      }
  }



}
