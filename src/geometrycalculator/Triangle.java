package geometrycalculator;

/* Class Triangle will:
   1) Get values for necessary variables from user
   2) Calculate perimeter and area of triangle
   3) Send values to Shape methods */

import java.util.Scanner;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    
    public Triangle() {
        getVariables();
    }
    
    // 1) Get values for necessary variables from user
    private void getVariables() {
        Scanner in = new Scanner(System.in);
        System.out.print("Base = ");
        base = in.nextDouble();
        System.out.print("Height = ");
        height = in.nextDouble();
        System.out.print("Side 1 = ");
        side1 = in.nextDouble();
        System.out.print("Side 2 = ");
        side2 = in.nextDouble();
        calcPerimeter();
        calcArea();
    }
    
    // 2) Calculate perimeter and area of triangle
    // 3) Send values to Shape methods
    private void calcPerimeter() {
        double p = base + side1 + side2;
        super.setPerimeter(p);
        super.printPerimeter();
    }
    
    private void calcArea() {
        double a = 0.5 * base * height;
        super.setArea(a);
        super.printArea();
    }
}