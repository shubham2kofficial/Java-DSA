public class Arrays_Part2_Q3 {

     // -> Max Subarray Sum - III (Kadane's Algorithems)

     public static void Kadanes(int numbers[]){
       
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];

            if(cs<0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }

        System.out.println("Our max Sub Array Sum is : " + ms);
     }

    public static void main(String[] args) {

        
    // -> Max Subarray Sum - III (Kadane's Algorithems)

    int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};

    Kadanes(numbers);
        
    }
    
}
