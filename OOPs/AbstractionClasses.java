package OOPs;

// Abstraction : Hidding All the Unnecessary details sowing only the importent parts to the user.

//using Abstract Classes & Interfaces

// Abstract Class :
// 1. Cannot Create create an Instance (Object) of the abstract class.
// 2. Can have abstract and non-abstract methods.
// 3. Can have Constructor.

public class AbstractionClasses {

    public static void main(String[] args) {

        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);
        h1.changeColor();

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();

        Mustang myHorse = new Mustang();

       // Animal -> Horse -> Mustang
        
    }
    
}

abstract class Animal {

    String color;

    Animal(){
        color = "Brown";
        System.out.println("Animal Constructor Called....");
    }

    // Non-abstract method
    void eat() {
        System.out.println("Animal eats");
    }

    // Abstract method (to be implemented by subclasses)
    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse Constructor Called.....");
    }
    void changeColor(){
        color = "Dark Brown";
    }

    void walk() {
        System.out.println("Horse walks on 4 legs.");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor Called....");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken walks on 2 legs.");
    }

    void changeColor(){
        color = "Yellow & Red";
    }
}