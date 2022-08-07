public class circle {
    private double radius=1.0;
    private String color="red";

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {

    }
public double getArea() {
        return radius * 2;

    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}