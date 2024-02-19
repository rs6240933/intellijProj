import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ammount");
        int n = sc.nextInt();
        bankDetails obj = new bankDetails();
        obj.setter(n);
        int res = obj.getter();
        System.out.println(res);
    }
}

 class bankDetails{
       private int ammount = 110 ;
       public void setter(int n){
           if(n>100)
               ammount = n;
           else
               System.out.println("Amount should be greater that 100");
       }
       public int getter(){
           return ammount;
       }
}