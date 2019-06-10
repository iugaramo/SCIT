package Shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        //List<Shape> shapes=new ArrayList<>();

        Circle circle= new Circle(1);
        displayShapeName(circle);
        displayShapeArea(circle);
        displayShapePerimeter(circle);
        Rectangle rectangle=new Rectangle(1,2);
        displayShapeName(rectangle);
        displayShapeArea(rectangle);
        displayShapePerimeter(rectangle);
 //       System.out.println(rectangle);
        Triangle triangle=new Triangle(1,2,3);
        displayShapeName(triangle);
        displayShapeArea(triangle);
        displayShapePerimeter(triangle);
    }

    public static void displayShapeName(Shape shape){
        System.out.println("Forma este: ");
        System.out.println(shape.displayShapeName());
    }


    public static void displayShapeArea(Shape area) {
        System.out.println("Aria este: ");
        System.out.println(area.getArie());
    }

    public static void displayShapePerimeter(Shape perimeter) {
        System.out.println("Perimetrul este: ");
        System.out.println(perimeter.getPerimetru());
    }


/*

    public static void displayShapeName(Triangle triangle){
        System.out.println("Forma este: ");
        System.out.println(triangle.displayShapeName());
    }

    public static void displayShapeName(Rectangle rectangle){
        System.out.println("Forma este: ");
        System.out.println(rectangle.displayShapeName());
    }
*/
}
