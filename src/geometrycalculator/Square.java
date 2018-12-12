package geometrycalculator;

/* Class Square will:
   1) Get values for necessary variables from user
   2) Calculate perimeter and area of square
   3) Send values to Shape methods */

import java.util.Scanner;

public class Square extends Shape {
    private double side;
    
    public Square() {
        getVariables();
    }
    
    // 1) Get values for necessary variables from user
    private void getVariables() {
        Scanner in = new Scanner(System.in);
        System.out.print("Side = ");
        side = in.nextDouble();
        calcPerimeter();
        calcArea();
    }
    
    // 2) Calculate perimeter and area of square
    // 3) Send values to Shape methods
    private void calcPerimeter() {
        double p = 4 * side;
        super.setPerimeter(p);
        super.printPerimeter();
    }
    
    private void calcArea() {
        double a = side * side;
        super.setArea(a);
        super.printArea();
    }
}