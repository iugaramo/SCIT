package Shapes;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a= a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double getArie() {
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double getPerimetru() {
        return a+b+c;
    }

    @Override
    public String displayShapeName() {
        return "triangle";
    }
}
