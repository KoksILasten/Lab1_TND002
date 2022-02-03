package Labb1;

public class Vector {
    private double x, y, z;
    public static Vector vdef = new Vector(0, 0, 0);

    public Vector() {
        SetToDefault();

    }

    public Vector(double d1, double d2, double d3) {
        x = d1;
        y = d2;
        z = d3;
    }

    public void SetToDefault() {
        x = vdef.x;
        y = vdef.y;
        z = vdef.z;
    }

    public static void setDefault(Vector v) {
        vdef = v;
    }

    public static Vector plus(Vector arg1, Vector arg2) {

        Vector array = new Vector();
        array.x = arg1.x + arg2.x;
        array.y = arg1.y + arg2.y;
        array.z = arg1.z + arg2.z;

        return array;

    }

    public Vector minus(Vector arg1) {

        Vector array = new Vector();
        array.x = arg1.x - x;
        array.y = arg1.y - y;
        array.z = arg1.z - z;

        return array;

    }

    public Vector multi(double arg) {
        Vector array = new Vector();
        array.x = x * arg;
        array.y = y * arg;
        array.z = z * arg;

        return array;

    }

    public double multi(Vector arg) {

        double sum;
        sum = arg.x * x + arg.y * y + arg.z * z;

        return sum;

    }

    public double length() {

        double length;
        length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

        return length;
    }

    public Vector matrixMult(double[][] arg) {
        Vector array = new Vector();
        int rows = arg.length;
        int column = arg[0].length;

        if (rows == 3 && column == 3) {
            array.x = arg[0][0] * this.x + arg[0][1] * this.y + arg[0][2] * this.z;
            array.y = arg[1][0] * this.x + arg[1][1] * this.y + arg[1][2] * this.z;
            array.z = arg[2][0] * this.x + arg[2][1] * this.y + arg[2][2] * this.z;
        } else {
            array.x = x;
            array.y = y;
            array.z = z;
        }
        return array;
    }

    public void norm() {
        double step1 = 1 / length();
        x = step1 * x;
        y = step1 * y;
        z = step1 * z;
    }

    public int compareTo(Vector arg) {
        if (this.length() == arg.length()) {
            return 0;
        } else if (length() > arg.length()) {
            return 1;
        } else {
            return -1;
        }

    }

    public String toString() {
        String output = String.format("Vector = < %2.1f , %2.1f , %2.1f >", x, y, z);

        return output;
    }
}