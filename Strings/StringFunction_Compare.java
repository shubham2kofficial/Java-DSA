public class StringFunction_Compare {

    
    public static void main(String[] args) {
        
        String s1 = "Yeshiv";

        String s2 = "Yeshiv"; 

        String s3 = new String("Yeshiv");

        if(s1 == s2) {
            System.out.println("String are Equal");
        }
        else {
            System.out.println("String are Not Equal");
        }

        if(s1 == s3) {
            System.out.println("String are Equal");
        }
        else {
            System.out.println("String are Not Equal");
        }

        if(s1.equals(s3)){
            System.out.println("String are Equal"); 
        }
        else{
            System.out.println("String are Not Equal"); 
        }




    }
}
