package OOPs;

public class Hybrid_Inheritance {

    public static void main(String[] args) {

        Cat timmy = new Cat();
        timmy.walk();
        timmy.color = "White";
        System.out.println("Timmy's color: " + timmy.color);
        timmy.sound();

        Tuna t1 = new Tuna();
        t1.eat();
        t1.swim();
        t1.special();

        Peacock p1 = new Peacock();
        p1.fly();
        p1.eat();
        p1.tail();
    }

}

class Animal {
    String color;

    void eat() {
        System.out.println("Animal eats");
    }

    void breathe() {
        System.out.println("Animal breathes");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird flies");
    }
}

class Peacock extends Bird {
    void tail() {
        System.out.println("Peacock has colorful tail feathers");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Fish swims");
    }
}

class Tuna extends Fish {
    void special() {
        System.out.println("Tuna is sleek, powerful, and made for speed.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Mammal {
    void sound() {
        System.out.println("Cat says Meow Meow");
    }
}