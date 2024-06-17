package OOPs;

public class Method_overriding {

    public static void main(String[] args) {

        Dear d = new Dear();
        d.eat();
        
    }
    
}
// Method Overriding (rum time) :- Parent and child class both contain the same function with a different defination.
// parent class
class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}

class Dear extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}



