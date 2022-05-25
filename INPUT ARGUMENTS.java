import java.util.*;
import java.io.*;
class  input_arguments
{                                                       /*we have to give arguments after complie .java files in cmd prompt  its programe use to caluluate your 
	                                                  family memers */
	public static void main(String[] args) {
    for(String a:args){
			System.out.println(" your family members name  "+"  " +a);
		}
		System.out.println("totalyour  family members"+"   "+ (args.length));
		}
}

