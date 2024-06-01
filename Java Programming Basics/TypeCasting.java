import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {

        // Type Casting
        Scanner sc = new Scanner(System.in);
        float a = 12.53f;
        int b = (int) a;
        System.out.println(b);

        char ch = 'a';
        char ch1 = 'b';
        char ch2 = 'c';
        char ch3 = 'd';
        int number = (int) ch;
        int number1 = (int) ch1;
        int number2 = (int) ch2;
        int number3 = (int) ch3;

        System.out.println(number + ", " + number1 + ", " + number2 + ", " + number3);

    }

}
