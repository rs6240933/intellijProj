import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0){
            int a = n%10;
            int total = a*a*a;
            sum = sum + total;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("Number is armstrong");
        }
    }
}
