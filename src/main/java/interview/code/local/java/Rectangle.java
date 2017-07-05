package interview.code.local.java;

/**
 * Created by vibinramakrishnan on 7/4/17.
 */
public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double area() {
        return width * height;
    }
}
