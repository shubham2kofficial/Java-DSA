import java.util.*;
public class Functions_AndMethods {

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1, int num2) { // Parameters or Formal Parameters
        int sum = num1 + num2;
        return sum;
    }
   
    public static void main(String[] args) {

      // printHelloWorld();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name :");
        String name = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(name);
        int sum =calculateSum(a, b); // Arguments or Actual Parameters

        System.out.println(sum);
        
    }
    
}
