# Menu-Driven Shape Calculator

## Overview
This Java program is a menu-driven application that calculates the **area, perimeter**, and **volume** (for 3D shapes) of various geometric shapes. The program follows **Object-Oriented Programming (OOP)** principles, utilizing **abstract classes, interfaces, and inheritance**.

## Features
- Supports different shapes:
  - **2D Shapes:** Rectangle, Square, Circle
  - **3D Shapes:** Sphere, Cylinder, Equilateral Pyramid (Square Base)
- Calculates area and perimeter for all shapes
- Calculates volume for 3D shapes
- Uses an abstract class `Shape` and an interface `Volume`
- Provides a menu-driven user interface

## File Structure
```
Menu Driven Shapes
├── Shape.java           # Abstract class for shapes
├── Volume.java          # Interface for volume calculation
├── Rectangle.java       # Class for rectangle shape
├── Square.java          # Class for square shape
├── Circle.java          # Class for circle shape
├── Sphere.java          # Class for sphere shape
├── Cylinder.java        # Class for cylinder shape
├── EquilateralPyramid.java # Class for square-based pyramid
└── Main.java            # Entry point with menu-driven system
```

## How to Run
1. **Compile all Java files:**
   ```sh
   javac *.java
   ```
2. **Run the program:**
   ```sh
   java Main
   ```
3. Follow the on-screen prompts to select a shape and input required measurements.

## Example Output
```
Choose a shape:
1. Rectangle
2. Square
3. Circle
4. Sphere
5. Cylinder
6. Equilateral Pyramid
7. Exit
Enter your choice: 1

Enter length: 5
Enter width: 4

Shape: Rectangle
Area: 20.0
Perimeter: 18.0
Sides: 4
```

## Dependencies
- Java 8 or later
- No external libraries required

## Author
Pranjali Vishwakarma
