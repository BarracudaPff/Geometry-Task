package geometry.models;

public class Triangle extends Line {
    protected Point c;

    public Triangle(Point a, Point b, Point c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
