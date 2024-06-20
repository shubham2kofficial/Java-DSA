package OOPs;

//Interfaces :- Interfaces is a Blueprint of the Class.
// -> Multiple Inheritance (5th type of Inharitance)
//-> total Abstraction (in Interface)

// All methods are public, abstract & without Implementation
// Used to Achieve total abstraction.
// Variable in the interface are final, public and static.

public class Interfaces {

    public static void main(String[] args) {

        Queen q = new Queen();
        q.moves();
        
    }
    
}


interface ChessPlayer {
     void moves();  
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, left, Right, Diagonal (In all 4 Direction)");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, left, Right, Diagonal (by 1 Step)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, left, Right ");
    }
}

class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("1.Moves forward one square, but captures diagonally.)");
        System.out.println("On its first move, a pawn can move forward two squares.");
    }
}



