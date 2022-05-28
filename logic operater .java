

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("bitwise operater &,|,^,~"); 
        System.out.println("<< left shift >> rightshift >>>rightshift with zero fill");
        int a =10;
        int b=25;
       //ram stored have capaciters each and every thing 0 and 1 .
       
        /*used to compare numbers bits ex 5(01010100)and 10(010101)
        used compare all values gives new valuse */
        
        
        
        
        System.out.println(a&b); 
        System.out.println(a|b); 
        System.out.println(a^b); 
        System.out.println(~a); 
        System.out.println("shift operater "); 
        System.out.println(a<<1); 
        System.out.println(a>>2); 
        System.out.println(a>>>4); 
        
    }
}
