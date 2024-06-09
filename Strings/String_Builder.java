/**
 * String_Builder
 */
public class String_Builder {

    public static void main(String[] args) {
         // Create a StringBuilder object
        // using StringBuilder() constructor
        StringBuilder str = new StringBuilder("");
        
        for(char ch='a'; ch<='z'; ch++){
            str.append(ch);
        }
         // print string
         System.out.println(str);
 
       
    }
}