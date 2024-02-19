import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n1 = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for(int i = 1; i<=n1; i++){
            System.out.print(a+",");
            c=a+b;
            a=b;
            b=c;

        }
    }
}