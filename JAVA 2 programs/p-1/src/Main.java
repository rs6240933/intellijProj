import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int sum = 0;
        while(n > 0){
            int z = n%10;
            sum = sum + z;
            n = n/10;
        }
        System.out.println(sum);
    }
}