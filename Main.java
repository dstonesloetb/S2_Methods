//Variable Scope Example 

public class Main {
    
    //Create a global variable which is accessible
    //by all methods in the class
    final static String txt = "This is a global variable of the Main Class";

    
    public static void main(String[] args) {
//        String txt = "This is a local variable in the main method";
//        System.out.println(txt);
        sub();
        
        //Output global variable txt  (e.g. Math.PI)
        //System.out.println(Main.txt);
        System.out.println(txt);
        
    } //end main
    
    //*******************************************************//
    
    public static void sub()
    {
        String txt = "This is a local variable in the sub method";
        System.out.println(txt);
    }
    
} //end class 
