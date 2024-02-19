import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int sum = 0;
            for(int i = n-1; i > 0; i--){
                if(n % i == 0){
                    sum = sum + i;
                }
            }

            if(sum == n){
                System.out.println("Number is perfect");
            }
    }
}