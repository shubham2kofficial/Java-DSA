import java.util.*;
public class Arithmetic_Operators {

    public static void main(String[] args) {
          //  Arithmetic Operators - Binary 

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Value of a : ");
      int a = sc.nextInt();
      System.out.println("Enter Value of b : ");
      int b = sc.nextInt();

      System.out.println("ADD = "+ (a+b));
      System.out.println("Sub = "+ (a-b));
      System.out.println("Div = "+ (a/b));
      System.out.println("Mod (Remainder) = "+ (a%b));


      //  Arithmetic Operators - Unary
      
      // Pre Increment

      int c = 10;
      int d = ++c;

      System.out.println(c);
      System.out.println(d);

      // Post Increment

      int e = 10;
      int f = c++;

      System.out.println(e);
      System.out.println(f);
    }
    
}
