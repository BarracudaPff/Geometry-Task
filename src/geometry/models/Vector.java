package geometry.models;

public class Vector extends Line {
    public Vector(Point a, Point b) {
        super(a, b);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
