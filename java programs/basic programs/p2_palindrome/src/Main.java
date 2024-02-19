import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();
        int temp = num, sum=0,a;
        while (temp>0){
            a = temp%10;
            sum = sum*10+a;
            temp = temp/10;
        }
        if(sum==num){
            System.out.println("number "+num+ " is palindrome");
        }
    }
}