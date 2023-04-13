package task2;

public class Circle {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public void checkArea() {
        try {
            if (getArea() < 0) {
                throw new IllegalArgumentException("Area cannot be negative");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("The area of a circle cannot be negative");
        }
    }
}