import java.util.*;
/*java does not support multiple inheritance */
class a{
    
    void display(){
        
        
    }
}
class b extends a{
    
    void display(){    //c invoked class b only avoid confusion java not allowed multiple inheritance 
        
    }
    
}

class c extends b{ /* eppadi pathalum c class ku a, b inheritance than but why jav doest not extends a, b 
beaacuse avaoid confuion if u are calling method method present in both class override its confusing which class 
want to excute */


    
    
    
}

public class Main{
 public static void main (String[] args) {
       
    }
}







