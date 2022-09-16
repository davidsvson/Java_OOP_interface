public class Triangle implements Shape, ShapeWithSides{

    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height * 0.5;
    }

    @Override
    public double getSidesCount() {
        return 3;
    }
}
