package geometry;

import geometry.models.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Point a = new Point(1,4);
        Point b = new Point(2,3);
        Point c = new Point(3,2);
        Point d = new Point(4,1);

        Line line = new Line(a,b);
        Triangle triangle = new Triangle(a,b,c);
        Rectangle rect = new Rectangle(a,b,c,d);


        System.out.println(line);
        System.out.println(triangle);
        System.out.println(rect);
    }
}
