import java.util.*;

public class Operations {

    // Get Ith Bit

    public static int getIthBit(int n, int i) {

        int bitmask = 1 << i;

        if ((n & bitmask) == 0) {

            return 0;
        } else {

            return 1;

        }
    }

    // Set Ith Bit

    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;

        return n | bitmask;
    }

    // clear Ith Bit

    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);

        return n & bitmask;
    }

    // Update Ith Bit
    public static int updateIthBit(int n, int i, int newBit) {

        // // Approach 1
        // if(newBit == 0){

        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }

        // Approach 2

        n = clearIthBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;

    }

    public static int clearLastIthBit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static int clearBitsInRange(int n, int i, int j) {

        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;

        int bitmask = a | b;

        return n & bitmask;

    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    
    // Count Set Bits in a Numbers

    public static int countSetbits(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) != 0) { // Check Our LSB

                count++;

            }

            n = n >> 1;
        }

        return count;
    }

    public static void main(String[] args) {

        // System.out.println(getIthBit(10, 3));

        // System.out.println(setIthBit(10, 2));

        // System.out.println(clearIthBit(10, 1));

        // System.out.println(updateIthBit(10, 2, 1));

        // System.out.println(clearLastIthBit(15, 3));

        // System.out.println(clearBitsInRange(10, 2, 4));

        // System.out.println(isPowerOfTwo(16));

        System.out.println(countSetbits(15));



    }

}
