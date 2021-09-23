package SevenLesson.SecondTask;

public class Pyramid extends Shape {
    public final double s;
    public final double h;

    public Pyramid(double s, double h) {
        super(s * h * 1 / 3);
        this.s = s;
        this.h = h;
    }
}
