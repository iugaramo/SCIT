package Shapes;

public class Circle extends Shape{
    private long raza;
    final double pi=Math.PI;

    public Circle(long raza){
        this.raza=raza;
    }

    @Override
    public double getArie() {
        return Math.PI*Math.pow(raza,2);
    }

    @Override
    public double getPerimetru() {
        return 2*Math.PI*raza;
    }

    @Override
    public String displayShapeName() {
        return "circle";
    }
}
