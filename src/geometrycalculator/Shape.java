package geometrycalculator;

/* Class Shape will:
   1) Get user to select which shape they want perimeter and area for
   2) Initialize object of selected shape
   3) Print perimeter and area */

import java.util.Scanner;

public class Shape {
    private double perimeter;
    private double area;
    private String whichShape;
    
    // 1) Get user to select which shape they want perimeter and area for
    public void getShape() {
        System.out.println("Select the shape you would like to");
        System.out.println("calculate the perimeter and area of.");
        System.out.println("1 for Circle");
        System.out.println("2 for Triangle");
        System.out.println("3 for Square");
        
        Scanner in = new Scanner(System.in);
        whichShape = in.nextLine();
        callShape(whichShape);
    }
    
    // 2) Initialize object of selected shape
    private void callShape(String selectedShape) {
        if (selectedShape.equals("1")) {
            Circle circle = new Circle();
        }
        
        else if (selectedShape.equals("2")) {
            Triangle triangle = new Triangle();
        }
        
        else if (selectedShape.equals("3")) {
            Square square = new Square();
        }
        
        else {
            this.getShape();
        }
    }
    
    // 3) Print perimeter and area
    public void printPerimeter() {
        System.out.println("Perimeter = " + this.perimeter);
    }
    
    public void printArea() {
        System.out.println("Area = " + this.area);
    }
    
    // Setters
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
}