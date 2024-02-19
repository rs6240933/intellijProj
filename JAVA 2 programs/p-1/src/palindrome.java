import java.util.Scanner;

public class palindrome{

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int temp = n;
            int sum = 0;
            while (n>0){
                int a = n%10;
                sum = sum * 10 + a;
                n = n/10;
            }
            if(sum == temp){
                System.out.println("Number is palindrome");
            }else{
                System.out.println("Number is not palindrome");
            }
        }

}
