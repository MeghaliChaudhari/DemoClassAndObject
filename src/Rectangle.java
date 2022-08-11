/*Design a class named Rectangle to represent a rectangle. The class contains:
        ■ Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
        ■ A no-arg constructor that creates a default rectangle.
        ■ A constructor that creates a rectangle with the specified width and height.
        ■ A method named getArea() that returns the area of this rectangle.
        ■ A method named getPerimeter() that returns the perimeter.
        Draw the diagram for the class and then implement the class. Write a RectangleImpl.java program that contain main method, creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9. Display the width, height, area,
        and perimeter of each rectangle in this order.*/


public class Rectangle {
    double width;
    double height;

    Rectangle(){
        width = 1;
        height = 1;
    }
    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(double width,double height){
        double areaOfRectangle = width * height;
        return areaOfRectangle;
    }
    public double getPerimeter(double width,double height){
        double perimeter = 2 * (width + height);
        return perimeter;
    }
}
