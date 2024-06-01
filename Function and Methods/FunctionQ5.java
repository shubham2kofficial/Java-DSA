public class FunctionQ5 {

    // - Function Overloading using Data type

    public static int minus(int a, int b) {
        return a - b;
    }

    public static float minus(float a, float b) {
        return a - b;
    }

    public static void main(String[] args) {

        // - Function Overloading using Data type

        System.out.println(minus(10, 5));
        System.out.println(minus(10.5f, 5.2f));

    }

}
