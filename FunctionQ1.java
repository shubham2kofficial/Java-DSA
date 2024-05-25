import java.util.Scanner;

public class FunctionQ1 {

    public static int multiply(int a, int b) {

        int product = a * b;
        return product;

    }

    public static void main(String[] args) {

        // - Product of A and B

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = multiply(a, b);

        System.out.println(product);
    }

}
