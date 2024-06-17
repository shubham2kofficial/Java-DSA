package OOPs;

public class Multi_Level_Inheritance {

    public static void main(String[] args) {

        Dog dobby = new Dog();
        dobby.color = "Black";
        System.out.println(dobby.color);
        dobby.lags = 4;
        System.out.println(dobby.lags);
        
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

class Mammal extends Animal{
    int lags;
}

class Dog extends Mammal{
    String breed;
}
