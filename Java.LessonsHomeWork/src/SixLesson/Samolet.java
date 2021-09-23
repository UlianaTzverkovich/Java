package SixLesson;

public class Samolet {
    private Wing wing;

    public static void main(String[] args) {
        Samolet planeA = new Samolet(123);
        System.out.println(planeA);

        Samolet planeB = new Samolet();
        planeB.setWing(planeB.new Wing(321));
        System.out.println(planeB);
    }

    public Samolet() {
    }

    public Samolet(double weightWing) {
        this.wing = new Wing(weightWing);
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    @Override
    public String toString() {
        return "Samolet{" +
                "wing=" + wing +
                '}';
    }

    public class Wing {
        private final double weight;

        public Wing(double weight) {
            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Wing{" +
                    "weight=" + weight +
                    '}';
        }
    }
}
