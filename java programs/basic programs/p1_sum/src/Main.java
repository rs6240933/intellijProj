import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,x2,res;
        System.out.println("Enter first number");
        x1 = sc.nextInt();
        System.out.println("Enter second number");
        x2 = sc.nextInt();
        res = x1+x2;
        System.out.println(res);
    }
}