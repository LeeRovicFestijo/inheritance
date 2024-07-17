public class Box extends Rectangle {
    public double height;

    public Box(String color, String texture, double length, double width, double height) {
        super(color, texture, length, width);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
