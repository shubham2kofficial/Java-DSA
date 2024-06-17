package OOPs;

public class Method_Overloading {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.sum((float)10.5, (float)9.5));
        System.out.println(calc.sum(10, 20));
        System.out.println(calc.sum(10, 10, 10));
        
    }


    
}
// Method Overloading : multiple functions with the same name but different Parameters.
class Calculator{

    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }



}
