// Shape.java
abstract public class Shape {
    protected double dim_one;
    protected double dim_two;
    protected double dim_three;
    protected int num_sides;

    public Shape(double dim_one, double dim_two, double dim_three, int num_sides) {
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
        this.num_sides = num_sides;
    }

    public String getShapeType() {
        return this.getClass().getSimpleName();
    }

    abstract public double calculateArea();
    abstract public double calculatePerimeter();
}
