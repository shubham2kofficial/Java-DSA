package OOPs;

public class Inheritance {

    public static void main(String[] args){

        Fish shark = new Fish();
        shark.eat();

    }
    
}


// Inheritance :- Inheritance is When properties & methods of base class are passed on to a derived class.

// Base class
class Animal{

    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }

}

// Derived class or Subclass
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}
