public class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle(String color, String texture, double length, double width) {
        super(color, texture);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}