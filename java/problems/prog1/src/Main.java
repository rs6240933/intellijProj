import java.util.Scanner;
//Palindrome Number
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(n > 0){
            int a = n%10;
            sum = sum *10 + a;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("number is palindrome");
        }
    }
}