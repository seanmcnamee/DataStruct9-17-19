public class Assignment1a {
    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        int c = minFunction(a, b);
        System.out.println("Minimum value: " + c);
    }

    /**
     * Returns the minimum of two numbers
     * @a : integer number
     * @b : integer number
     */
    public static int minFunction(int a, int b) {
        int min;
        if (a < b) {
            min = a;   
        }   else {
            min = b;
        }
        return min;
    }
}