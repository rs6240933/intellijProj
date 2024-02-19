public class bankDetails {
    private int balance = 1000;
    public void setter(int n){
        if(n > 1000){
            balance = n;
        }else{
            System.out.println("Account balance is "+balance);
        }
    }
    public void getter(){
        System.out.println("Account balance is "+balance);
    }
}
