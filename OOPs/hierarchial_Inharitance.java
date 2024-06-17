package OOPs;

// Hierarchial Inharitance 
public class hierarchial_Inharitance {

    public static void main(String[] args) {

        Mammal dog = new Mammal();
        dog.color = "Brown";
        System.out.println(dog.color);
        dog.walk();
        
        Bird parrot = new Bird();
        parrot.fly();
        parrot.color = "Green";
        System.out.println(parrot.color);

        Fish shark = new Fish();
        shark.swim();
        shark.color = "Silver";
        System.out.println(shark.color);


        
    }
    
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flys");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
