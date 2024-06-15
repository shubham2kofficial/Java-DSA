package OOPs;

public class Shallow_AndDeepCopy {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Rahul Verma";
        s1.roll = 12345;

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);

        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }

}

class Student {
    String name;
    int roll;
    int marks[];

    // Default
    Student() {
        marks = new int[3];
    }

    // // Shallow Copy Constructor
    // Student(Student s1){
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // Deep Copy Constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < marks.length; i++) {

            this.marks[i] = s1.marks[i];
        }

    }

}
