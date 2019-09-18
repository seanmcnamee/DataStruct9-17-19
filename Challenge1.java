public class Challenge1 {

    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int BASE = 5;

        for (double num : numbers) {
            System.out.println("log-base" + BASE + "(" + num + ") = " + logbase(num, BASE));
        }
    }


    /**
     * Returns the logBASE of the value
     * @value : the exponent of the log function
     * @base : the base of the log function
     */
    public static double logbase(double value, int base) {
        return Math.log(value) / Math.log(base);
    }
}