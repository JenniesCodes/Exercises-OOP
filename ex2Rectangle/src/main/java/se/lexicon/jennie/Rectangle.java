package se.lexicon.jennie;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {

    }

    public Rectangle(double Height, double Width) {
        height = Height;
        width = Width;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        double area = height*width;
        return area;
    }
}