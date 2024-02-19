public class accountDetails {
    private int balance = 10000;
    public int getter(){
        return this.balance;
    }
    public void setter(int n){
        if(n > 10000){
            this.balance = n;
        }else{
            System.out.println("Balance should be greater than 10000");
        }
    }
}
