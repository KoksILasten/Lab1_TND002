package Labb1;

public class lab1a {
    public static void main(String[] args) {

        double[] da1 = { 1.0, 2.0, 3.0 };
        double[] da2 = { 0.0, -0.5, -2.0 };

        double[] ans1 = addition(da1, da2);
        double[] ans2 = subtraction(da1, da2);
        printVector(ans1);
        printVector(ans2);
    }

    public static void printVector(double[] array) {
        String output = String.format("Vector = < %2.1f , %2.1f , %2.1f >", array[0], array[1], array[2]);
        System.out.println(output);
    }

    public static double[] addition(double[] arg1, double[] arg2) {

        double[] array = new double[3];
        array[0] = arg1[0] + arg2[0];
        array[1] = arg1[1] + arg2[1];
        array[2] = arg1[2] + arg2[2];

        return array;
    }

    public static double[] subtraction(double[] arg1, double[] arg2) {

        double[] array = new double[3];
        array[0] = arg1[0] - arg2[0];
        array[1] = arg1[1] - arg2[1];
        array[2] = arg1[2] - arg2[2];

        return array;
    }
}
