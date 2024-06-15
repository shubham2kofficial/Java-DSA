package OOPs;

public class Copy_Constructor {

    public static void main(String[] args) {
        // Creating an instance of Student using default constructor
        Student s1 = new Student();
        s1.name = "Shubham Kumar";
        s1.rollNo = 30930;
        s1.password = "AAaa@@11";
        s1.marks = new int[]{100, 90, 80}; // Initialize marks array

        // Using the copy constructor to create a new Student object
        Student s2 = new Student(s1);
        s2.password = "Aa@123";

        s1.marks[2] = 100;

        // Printing marks of s2 (should be the same as s1, copied via copy constructor)
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int[] marks; // Declare marks array

    // Default Constructor
    Student() {
        marks = new int[3]; // Initialize marks array with size 3
        System.out.println("Default constructor is called....");
    }

    // Copy Constructor
    Student(Student s1) {
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.password = s1.password;
        this.marks = s1.marks;
    }

    // Parameterized Constructor with name
    Student(String name) {
        this.name = name;
        marks = new int[3]; // Initialize marks array with size 3
    }

    // Parameterized Constructor with rollNo
    Student(int rollNo) {
        this.rollNo = rollNo;
        marks = new int[3]; // Initialize marks array with size 3
    }
}
