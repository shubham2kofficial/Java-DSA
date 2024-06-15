package OOPs;

// Constructors :- Constructor is a Special Method which is invoked automatically at the time of Object Creation.

// Constructors have same Name as Class or Stuctures.
// Constructors don't have return type. (Not Even Void).
// Constructors are only calls Once, at the object creation.
// Memory Allocation happans when construtor is called.




public class Constructors {

    public static void main(String[] args) {
        
        //Exemple 1 
        Student s1 = new Student("Shubham Kumar");
        
        System.out.println(s1.name);
        
        //Exemple 2 
        Student s2 = new Student();
        
    


        
    }
    
}

class Student{
    int rollNo;
    String name;

    Student(String name){
        this.name = name;
    }

    Student(){
        System.out.println("Constructor is Called.....");
    }
}


