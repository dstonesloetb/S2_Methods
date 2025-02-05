class MethodOverloading {
public static void main(String[] args) {
        
  //Call different overloaded methods 
  //and pass them argument values
  System.out.println(write(12));
  System.out.println(write("Twelve"));
  System.out.println(write(4, 16));
        
  int x = 30;
  int y = 20;
  int largest = Math.max(y, y);
  System.out.println(largest);
        
  } //end main 

  //  Add three overloaded methods to each
  //  return a String
    
  public static String write(int num) {
    return ("Integer passed is "+num);
  } //end write method with int parameter
    
  public static String write(String num)
  {
      return ("String passed is "+num );
  }//end write method with String parameter
    
  public static String write(int num1, int num2)
  {
      return ("Sum Total is " +(num1+num2));
  } //end write method with 2 parameters 
    
} //end class
