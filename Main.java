public class Main {
    public static void main(String[] args) {
        line();
        space();
        Shape shape = new Shape("Blue", "Slimy");
        System.out.println("The color of the shape: " + shape.getColor());
        System.out.println("The texture of the shape: " + shape.getTexture ());
        
        line();
        space();
        Circle circle = new Circle("Red", "Smooth", 3.0);
        System.out.println("The area of the circle: " + circle.getArea());
        System.out.println("The color of the circle: " + circle.getColor());
        System.out.println("The texture of the circle: " + circle.getTexture ());

        line();
        space();
        Cylinder cylinder = new Cylinder("Green", "Shiny", 3.0, 3.0);
        System.out.println("The volume of the cylinder: " + cylinder.getVolume());
        System.out.println("The color of the cylinder: " + cylinder.getColor());
        System.out.println("The texture of the cylinder: " + cylinder.getTexture ());
        
        line();
        space();
        Rectangle rectangle = new Rectangle("Black", "Rough", 3.0, 3.0);
        System.out.println("The area of the rectangle: " + rectangle.getArea());
        System.out.println("The color of the rectangle: " + rectangle.getColor());
        System.out.println("The texture of the rectangle: " + rectangle.getTexture ());
        
        line();
        space();
        Box box = new Box("Teal", "Smooth", 3.0, 3.0, 3.0);
        System.out.println("The volume of the box: " + box.getVolume());
        System.out.println("The color of the box: " + box.getColor());
        System.out.println("The texture of the box: " + box.getTexture ());
        
        line();
        space();
        Triangle triangle = new Triangle("Pink", "Fuzzy", 3.0, 3.0);
        System.out.println("The area of the triangle: " + triangle.getArea());
        System.out.println("The color of the triangle: " + triangle.getColor());
        System.out.println("The texture of the triangle: " + triangle.getTexture ());
        
        line();
        space();
        Pyramid pyramid = new Pyramid("Magenta", "Hard", 3.0, 3.0, 3.0);
        System.out.println("The volume of the pyramid: " + pyramid.getVolume());
        System.out.println("The color of the pyramid: " + pyramid.getColor());
        System.out.println("The texture of the pyramid : " + pyramid.getTexture ());

        line();
        space();
        Square square = new Square("White", "Rigid", 3.0);
        System.out.println("The area of the square: " + square.getArea());
        System.out.println("The color of the square: " + square.getColor());
        System.out.println("The texture of the square: " + square.getTexture ());
        
        line();
        space();
        Cube cube = new Cube("Yellow", "Soft", 3.0);
        System.out.println("The volume of the cube : " + cube.getVolume());
        System.out.println("The color of the cube : " + cube.getColor());
        System.out.println("The texture of the cube: " + cube.getTexture ());
        line();
        
    }

    public static void line () {
        int y = 30;
        int i = 0;

        for (i = 0; i < y; i++){
            System.out.print("*");
        }
    }
    
    public static void space () {
        System.out.println("");
    }
}
