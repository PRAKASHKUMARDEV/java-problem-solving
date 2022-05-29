/******************************************************************************
every class inheritance object class defualtly so object class have so many functions if u 
want to use it  just override those methods and use it ex string equals is also refer object class
1.object.equals.(object )// thats its compare objects contents 
2.object 1 ==object 2 thats means both are refered same memory or not 

*******************************************************************************/
public class Main extends Object // backgroungd its inheritance object class we can able to use object methods 
{
String name ;
int age; 

	public void set(String a,int b){
		    this.name=a;
		    this.age=b;
		}



	public static void main(String[] args) {
	
		System.out.println("Hello");
		String obj1 ="java";//both java stored same meory 
		String obj2="java";
		Main obj3 =new Main();//refer diffrent memeory 
		Main obj4 =new Main ();//its crate diffrent memory 
		obj3.set("prakash",24);
		obj4.set("ram",25);
		System.out.println(obj1==obj2);//true 
		System.out.println(obj3==obj4);//false
		//i dont needed compare location i want to comapare contents so overidte  equals because equals always compare 
	 //	two object refrence if u want to convert compare conts its your job u have to defeined the function or u can use UnknownError
	 //function defined 
	 System.out.println(obj3.equals(obj4));/*so that we dont have equals function in main clas we invoked equals thats 
	 means its object class method invoked its comapre two object memeory loc only so gives false we need compaare 
	 contents we should override this method */
	  
	}
	
	/*boolean equals(employee e) normalla eppadi koduppom but suppose ni anupura object manager class obj eruntha or any 
	other class object enakku compare pannum so generalla use key word object (its accept all object)*/
	public boolean equals (Object e){
	    if (this==e)    //to compare refrence refrence same means contents also same we can save time 
	       return true ;
	       else if(e==null)
	       return false ;  
	       if (this.getclass()!=e.getclass())// both are same class objectta ellaya
	         return false ;
	         Main a=(Main)e;//so same class nala object obj employee obj convert pnna mudyium so eppo easyya compare pannalam
	         if (this.name==a.name && this.age==a.age) // this means invoked object mathri vachi acces panna **************
	          return true;
	}
	  
}       
	  
