class UseMyMaths {
  public static void main(String[] args) {
    
    System.out.println("Volume of Cube Example:");

    double sideOfCube = 10;

    double volumeOfCube = MyMaths.volumeOfCube(sideOfCube);
    
    System.out.println("Volume of cube with side " + sideOfCube + " is " + volumeOfCube);


    System.out.println("Area of the triangle: ");

    double base = 10;
    double height = 8;

    System.out.println("Area of the triangle is: "+ MyMaths.areaTriangle(height, base));
   // double area = 0.5 * base * height;
  // return area;
  } //end main method
  
} //end class
