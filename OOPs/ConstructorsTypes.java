package OOPs;


// Types of Constructors 
// 1> Non - Parameterized Constructors 
// 2> Parameterized Constructors 
// 3> Copy Constructors

// Constructor Overloading :- The constructor overloading can be defined as the concept of having more than one constructor with different parameters so that every constructor can perform a different task.

public class ConstructorsTypes {

   public static void main(String[] args) {

    Student s1 = new Student();
    
    Student s2 = new Student("Shubham Kumar");

    Student s3 = new Student(12345);
   }
    
}


class Student{
    String name;
    int rollNo;

    Student(){    // Non - Parameterized Constructors 
        System.out.println("Constructor is Called....");
    }

    Student(String name){  // Parameterized Constructors 
        this.name = name;
    }

    Student(int rollNo){  // Parameterized Constructors 
        this.rollNo = rollNo;
    }
}