import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int d = fact(n);
        System.out.println("The factorial is "+ d);

    }
    static int fact(int n){
        int res = 1;
        if(n == 0){
            res = 1;
        }else {
            res = n * fact(n-1);
        }
         return res;
    }
}