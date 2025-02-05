public class MultipleParameters {
  
  static void myMethod(String fname, String address, int age) 
  {
    System.out.println(fname + " from " + address + " is " + age);
  }



  
  public static void main(String[] args) {
    //myMethod(20, "Donal");
    //myMethod("Sean", 20);
    //myMethod("Dublin", "Sean", 22); 
    myMethod("Paddy", "Portlaoise", 15);
    myMethod("Jenny", "Abbeyleix", 8);
    myMethod("Mary", "Dublin", 30);
  }
}
