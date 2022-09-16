import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(3, 4);
        Triangle tri1 = new Triangle(2,3);
        Ellipse elli1 = new Ellipse(2,4);

        ArrayList<Shape> shapes = new ArrayList<>();


        shapes.add(rect1);
        shapes.add(tri1);
        shapes.add(elli1);

        Shape shape1 = elli1;
        ShapeWithSides shape = rect1;




    }
}