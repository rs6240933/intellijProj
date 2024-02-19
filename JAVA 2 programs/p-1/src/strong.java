import java.util.Scanner;

public class strong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n>0){
            int a = n%10;
            int fact = 1;
            for(int i=a; i>0; i--){
                fact =  fact * i;
            }
            sum = sum + fact;
            n = n/10;
        }
        if(sum == temp){
            System.out.println("Number is strong");
        }
    }
}
