public class FuncttionQ8 {

    // - Binary to Decimal Conversion

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int) (Math.pow(2, pow)));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        
        // - Binary to Decimal Conversion
       
        binToDec(1000);

    }

}
