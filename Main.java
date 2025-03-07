// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose a shape:");
            System.out.println("1. Rectangle\n2. Square\n3. Circle\n4. Sphere\n5. Cylinder\n6. Equilateral Pyramid\n7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scan.nextDouble();
                    Shape rectangle = new Rectangle(length, width);
                    displayShape(rectangle);
                    break;
                case 2:
                    System.out.print("Enter side length: ");
                    double side = scan.nextDouble();
                    Shape square = new Square(side);
                    displayShape(square);
                    break;
                case 3:
                    System.out.print("Enter radius: ");
                    double radius = scan.nextDouble();
                    Shape circle = new Circle(radius);
                    displayShape(circle);
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    double sphereRadius = scan.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    displayShape(sphere);
                    displayVolume(sphere);
                    break;
                case 5:
                    System.out.print("Enter radius: ");
                    double cylRadius = scan.nextDouble();
                    System.out.print("Enter height: ");
                    double cylHeight = scan.nextDouble();
                    Cylinder cylinder = new Cylinder(cylRadius, cylHeight);
                    displayShape(cylinder);
                    displayVolume(cylinder);
                    break;
                case 6:
                    System.out.print("Enter base side length: ");
                    double base = scan.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scan.nextDouble();
                    EquilateralPyramid pyramid = new EquilateralPyramid(base, height);
                    displayShape(pyramid);
                    displayVolume(pyramid);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void displayShape(Shape shape) {
        System.out.println("\nShape: " + shape.getShapeType());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Sides: " + shape.num_sides);
    }

    public static void displayVolume(Volume volumeShape) {
        System.out.println("Volume: " + volumeShape.calculateVolume());
    }
}
