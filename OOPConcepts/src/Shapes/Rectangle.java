package Shapes;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }

    @Override
    public double getArie() {
        return width * length;
    }

    @Override
    public double getPerimetru() {
        return 2*(width+length);
    }

    @Override
    public String displayShapeName() {
        return "rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
