package SevenLesson;

public class Truck extends Car{
    public int Wheels;
    public double weightMax;

    public static void main(String[] args) {
        Truck truck = new Truck(3000, "Kamaz", 'r', 50, 5, 5000);
        truck.newWheels(10);

        System.out.println(truck);
    }

    public Truck(int weight, String model, char color, float speed, int Wheels, double weightLimit) {
        super(weight, model, color, speed);
        this.Wheels = Wheels;
        this.weightMax = weightLimit;
    }

    public void newWheels(int number) {
        Wheels = number;
        System.out.println(Wheels);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                ", numberWheels=" + Wheels +
                ", weightLimit=" + weightMax +
                '}';
    }
}
