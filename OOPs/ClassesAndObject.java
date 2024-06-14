package OOPs;

public class ClassesAndObject {

   public static void main(String args[]){

      Pen p1 = new Pen();  // class call Using Object.
      p1.setColor("Blue");
      System.out.println(p1.color);

      p1.setTip(5);
      System.out.println(p1.tip);

    //   p1.setColor("Red"); 
    //   System.out.println(p1.color);

    p1.color = "Green";
    System.out.println(p1.color);


   }
    
}

// Classes :- Group of these Entities.  -> Classes = Attributes (Properties) + Functions (Behaviors)

// Objects :- Entities in the Real World.



class Pen{

    String color;  // Attributes
    int tip;

    void setColor(String newColor){   //Functions
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

}

class Student{
    String name;
    int rollNo;
    int parcentage;

    void calcParcentage(int phy, int chem, int math){
        parcentage = (phy + chem + math) / 3;
    }
}
