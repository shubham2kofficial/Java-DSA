package OOPs;

public class AccessModifiers {

    public static void main(String[] args) {

        BankAcc myAcc = new BankAcc();
        myAcc.userName = "Shubham Kumar";
        myAcc.setPassword("Admin@123");
        
    }
    
}

class BankAcc{
    public String userName;
    
    private String password;

    public void setPassword(String pwd){
        
        password = pwd;
    }
}
