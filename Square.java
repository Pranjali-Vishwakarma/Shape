// Square.java
class Square extends Shape {
    public Square(double side) {
        super(side, side, 0, 4);
    }

    public double calculateArea() {
        return dim_one * dim_one;
    }

    public double calculatePerimeter() {
        return 4 * dim_one;
    }
}