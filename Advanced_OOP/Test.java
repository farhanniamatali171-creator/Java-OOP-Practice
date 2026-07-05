// Abstract Shape class
import java.util.Scanner;
abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "blue";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "color=" + color + ", filled=" + filled ;
    }

    
}

// Circle class
class Circle extends Shape {
    private double radius;
    public Circle() {
        this.radius = 1.0;
    }

    

    public Circle(double radius) {
        this.radius = radius;
    }



    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius=" + radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return super.toString() + ", Width=" + width + ", Length=" + length;
    }
}


public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // STEP 4: Create array
        Shape[] shapes = new Shape[4];

        // STEP 5: Initialize array
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(2.0,4.0);
        shapes[2] = new Circle(4.0);
        shapes[3] = new Rectangle(5.0, 6.0);

        // STEP 6: User input
        System.out.println("Enter shape to update (1 = Circle, 2 = Rectangle): ");
        int choice = sc.nextInt();

        // STEP 7: Update using loop + instanceof
        if (choice == 1) {
            System.out.print("Enter new radius: ");
            double radius = sc.nextDouble();
 
            for (Shape s : shapes) {
                if (s instanceof Circle) {
                    Circle c = (Circle) s;
                    c.setRadius(radius);
                }
            }

        } else if (choice == 2) {
            System.out.print("Enter new length: ");
            double length = sc.nextDouble();
            System.out.print("Enter new width: ");
            double width = sc.nextDouble();

            for (Shape s : shapes) {
                if (s instanceof Rectangle) {
                    Rectangle r = (Rectangle) s;
                    r.setLength(length);
                    r.setWidth(width);
                }
            }
        } else {
            System.out.println("Invalid choice!");
        }

        // STEP 9: Call summary method
        shapesSummary(shapes);

        sc.close();
    }

    // STEP 8: Summary method
    public static void shapesSummary(Shape[] shapes) {
        for (Shape s : shapes) {
            System.out.println(s.toString());
            System.out.println("Area: " + s.getArea());
            System.out.println("Perimeter: " + s.getPerimeter());
            System.out.println("----------------------");
        }
    }
}