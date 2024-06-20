package OOPs;

// Super Keyword: Super keyword is used to refer immediate parent class object.
//- To access parent's Properties.
//- To access parent's function.
//- To access parent's constructor.

public class Super_keyword {

    public static void main(String[] args) {

        Horse h = new Horse();
        System.out.println(h.color);

    }

}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal Constructor is Called...");
    }
}

class Horse extends Animal {

    Horse() {
        super.color = "White";
        System.out.println("Horse Constructor is Called...");
    }
}
