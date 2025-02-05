public class LibraryUseExample {
  
  public static void main(String[] args) {
    System.out.println("Calculate area of rectangles: ");

    int width = 100;
    int height = 200;
    
    System.out.println("Rectangle 1: ");
    System.out.println("Width: "+width + " cm");
    System.out.println("Length: "+height+ " cm");
    System.out.println("Area: " + MyShapesLibrary.areaRect(width, height) + " sq.cm");

    width = 50;
    height = 20;
    
    System.out.println("\nRectangle 2: ");
    System.out.println("Width: "+width + " cm");
    System.out.println("Length: "+height+ " cm");
    System.out.println("Area: " + MyLibrary.areaRect(width, height) + " sq.cm");


    System.out.println("\nCalculate area of circles: ");

    int radius = 10;
    
    System.out.println("Circle 1: ");
    System.out.println("Radius: "+radius + " cm");
    System.out.println("Area: " + MyLibrary.areaCircle(radius) + " sq.cm");
    
  } //end main method 


 
  
} //end class
