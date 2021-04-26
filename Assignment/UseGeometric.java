package Assignment;

public class UseGeometric {
    public static void main(String[] args)
    {
        Square square = new Square(4,4, "Square");
        System.out.println(square.toString());
        
        Triangle triangle = new Triangle(3,3, "Triangle");
        System.out.println(triangle.toString());
        
        Square square1 = new Square(12,12, "Square");
        System.out.println(square1.toString());
        
        Triangle triangle1 = new Triangle(7,7, "Triangle");
        System.out.println(triangle1.toString());
    }
}

