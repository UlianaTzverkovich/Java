package FifthLesson;

class Vector {
    private final double x;
    private final double y;
    private final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarMetod(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector vectorVector(Vector vector) {
        return new Vector(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }


    public double cosineAngle(Vector vector) {
        return scalarMetod(vector) / (length() * vector.length());
    }


    public Vector sum(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }


    public Vector difference(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }


    public static Vector[] getRandomVector(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }

        return vectors;
    }
}