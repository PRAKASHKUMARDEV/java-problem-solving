class global{
	static int a=10;//instance variables 
	static int b=20;
	/*above programe u will get error because if u want to acces any instance variables 
(class varibles )u need object even class function also cannot able to acces */

/*in local variables means we can acces only in side the fucntion */

//let we understand the concept deeply ok let we check it //

	public static void main(String[] args ) {
		System.out.println("your entered string ="+a+" "+b);
		int a=100;//local variables 
		int b=500;
		System.out.println("your entered string ="+a+" "+b);
		
	}
}
