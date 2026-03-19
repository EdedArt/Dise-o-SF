public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }

    @Override
    public double getArea() {
        double baseArea = super.getArea();
        double lateralArea = 2 * Math.PI * getRadius() * height;
        return 2 * baseArea + lateralArea;
    }

    @Override
    public String toString() {
        return "Cylinder: radius=" + getRadius() +
               ", height=" + height +
               ", color=" + getColor();
    }
}