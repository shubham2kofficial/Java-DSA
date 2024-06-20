package OOPs;
//Multiple Inheritance is the capability of a class to inherit properties and methods from more than one base class.
public class Multiple_Inheritance {

    public static void main(String[] args){

        Fox f = new Fox();
        f.eats();

    }
    
}

interface Herbivore{
    void eats();
}

interface Cornivore{
    void eats();
}

class Elephant implements Herbivore{
    public void eats(){
        System.out.println("These animals primarily eat plant-based diets, including leaves, grass, fruits, and vegetables.");
    }
}

class Tiger implements Cornivore{
    public void eats(){
        System.out.println("These animals primarily consume meat, hunting or scavenging other animals for food.");
    }
}

class Bear implements Herbivore, Cornivore{
    public void eats(){
        System.out.println("These animals have a diet that includes a mix of plant-based foods and animal-based foods.");
    }
}

class Fox implements Herbivore, Cornivore{
    public void eats(){
        System.out.println("These animals have a diet that includes a mix of plant-based foods and animal-based foods.");
    }
}
