package OOPs;

// Static Keyword : Static Keyword in Java is Used to some Variable or Method of a given Class.
// Properties, Methods, Blocks & Nested class

public class Static_keywords {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.schoolName = "KPS";
        s1.returnPercentage(80, 80, 80);

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(s2.returnPercentage(90, 90, 90));

    }
}

class Student {
    // Static method to calculate percentage
    static int returnPercentage(int phy, int math, int chem){
        return (phy + math + chem)/3;
    }

    String name;
    int rollNo;
    
    // Static variable to hold school name
    static String schoolName;
    
    // Method to set name
    void setName(String name) {
        this.name = name;
    }
    // Method to get name
    String getName() {
        return this.name; 
    }
}
