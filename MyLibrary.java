//A simple library to calculate
//the area of various shapes

//Class declaration 
public class MyLibrary {

 /*   Area Functions */ 
public static double areaCircle(int radius)
{
    //double area = Math.PI * radius * radius; 
    //return area; 
    return Math.PI * Math.pow(radius,2);
} //end areaCircle 


public static int areaRect(int width, int height)
{
    //int area = width * height; 
    //return area; 
    return width * height;
} //end areaRect function

} //end class 
