// Circle.java
class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0, 0, 0);
    }

    public double calculateArea() {
        return Math.PI * dim_one * dim_one;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * dim_one;
    }
}