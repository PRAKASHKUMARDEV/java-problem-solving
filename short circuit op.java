

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("only java have short circuit op "); 
        System.out.println("short circuit &&,||");
       // boolean a =true;//or we given 1
       // boolean b=false;// or we given 0
       
        /*in java short circuit means reduce excution time if 
        condtions true it will not checked second condition in java perfermance app increase 99% this operaters we are use in programe  */
        int c =-8;
        int d=90;
        
        
        
        System.out.println((c>d)&&(d>c)); // excute slow 
        System.out.println((d>c)||(c>d)); // excute fast
    
     
        
    }
}
