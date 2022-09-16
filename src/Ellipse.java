public class Ellipse implements Shape{
    private double width;
    private double height;

    public Ellipse(double width, double height) {
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
        return width * height * Math.PI;
    }
}
