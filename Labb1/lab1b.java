package Labb1;

public class lab1b {
    public static void main(String[] args) {
        // System.out.print();
        System.out.println(Vector.vdef);

        Vector vec1 = new Vector(1.0, 2.0, 3.0);
        Vector.setDefault(vec1);

        Vector v1 = new Vector();
        System.out.println(v1);

        Vector v2 = new Vector(1.0, 1.0, 2.0);
        System.out.println(v2);

        String length = String.format("Length: %2.1f", v1.length());
        System.out.println(length);

        double[][] m1 = { { 1.0, 0.0, 0.0 }, { 0.0, 1.0, 0.0 }, { 0.0, 0.0, 1.0 } };
        Vector m = new Vector();
        System.out.println(m.matrixMult(m1));

        double[][] m2 = { { 1.0, 0.0 }, { 0.0, 1.0 } };
        System.out.println(m.matrixMult(m2));

        double[][] m3 = { { 0.0, 1.0, 0.0 }, { 1.0, 0.0, 0.0 }, { 0.0, 0.0, 1.0 } };
        System.out.println(m.matrixMult(m3));

        System.out.println(Vector.plus(v1, v2));
        System.out.println(v1.minus(v2));
        System.out.println(v1.multi(2));
        System.out.println(v1.multi(v2));
        System.out.println(v1.compareTo(v2));

        v1.norm();
        v2.norm();
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v1.multi(v2));
        System.out.println(v2.multi(v2));

    }

}
