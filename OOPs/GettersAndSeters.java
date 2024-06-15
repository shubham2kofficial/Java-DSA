package OOPs;

public class GettersAndSeters {

    public static void main(String[] args) {

        Pen p1 = new Pen(); // Created a Pen object called p1

        p1.setColor("Green");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Pine Green");
        System.out.println(p1.getColor());



        
    }
    
}

// Getters And Setters

// get :- To Return the value.

// Set :- To Modify the value.

// this :- this keyword is used to refer to the current object.
class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }

}
