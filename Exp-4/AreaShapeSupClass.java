// WAP to find areas of square and rectangle by deriving them from shape. Shape is the super class for square.

import java.util.Scanner;

class Shape {
    float side, length, breadth, area;
}

class Square extends Shape {
    float areaOfSquare(float side) {
        return side * side;
    }
}

class Rectangle extends Shape {
    float areaOfRectangle(float length, float breadth) {
        return length * breadth;
    }
}

class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        float side = sc.nextFloat();
        Square S = new Square();
        System.out.print("Enter the length of the rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        float breadth = sc.nextFloat();
        Rectangle R = new Rectangle();
        System.out.println("======================");
        System.out.println("Area of the square is: " + (S.areaOfSquare(side)));
        System.out.println("Area of the rectangle is: " + (R.areaOfRectangle(length, breadth)));
        sc.close();
    }
}
