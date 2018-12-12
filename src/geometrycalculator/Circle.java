package geometrycalculator;

/* Class Circle will:
   1) Get values for necessary variables from user
   2) Calculate perimeter and area of circle
   3) Send values to Shape methods */

import java.util.Scanner;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14159;
    
    public Circle() {
        getVariables();
    }
    
    // 1) Get values for necessary variables from user
    private void getVariables() {
        Scanner in = new Scanner(System.in);
        System.out.print("Radius = ");
        radius = in.nextDouble();
        calcPerimeter();
        calcArea();
    }
    
    // 2) Calculate perimeter and area of circle
    // 3) Send values to Shape methods
    private void calcPerimeter() {
        double p = 2 * PI * radius;
        super.setPerimeter(p);
        super.printPerimeter();
    }
    
    private void calcArea() {
        double a = PI * radius * radius;
        super.setArea(a);
        super.printArea();
    }
}