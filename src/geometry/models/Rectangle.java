package geometry.models;

public class Rectangle extends Triangle {
    protected Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        super(a, b, c);
        this.d = d;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
