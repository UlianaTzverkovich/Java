package SevenLesson.SecondTask;

public class SolidOfRevolution extends Shape {
    private final double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

