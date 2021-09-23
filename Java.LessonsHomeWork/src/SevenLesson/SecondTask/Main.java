package SevenLesson.SecondTask;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(500);

        System.out.println(box.add(new Cylinder(3.5, 3.5)));
        System.out.println(box.add(new Ball(3.5)));
        System.out.println(box.add(new Pyramid(50, 50)));
    }
}
