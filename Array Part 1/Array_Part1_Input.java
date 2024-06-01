import java.util.*;

public class Array_Part1_Input {

    public static void main(String[] args) {

        // - Input

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); // Phy
        marks[1] = sc.nextInt(); // Chem
        marks[2] = sc.nextInt(); // Math

        System.out.println("Phy :" + marks[0]);
        System.out.println("Phy :" + marks[1]);
        System.out.println("Phy :" + marks[2]);

        // Update Array Index

        // marks[2] = 100;
        marks[2] = marks[2] + 2;
        System.out.println("Math :" + marks[2]);

    }

}
