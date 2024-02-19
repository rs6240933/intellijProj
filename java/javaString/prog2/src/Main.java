import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbr");
        int n = sc.nextInt();
        if(n <= 1){
            System.out.println("Number is composite");
        }else {
            for(int i=2; i<n; i++){
                if(n%i == 0){
                    System.out.println("Number "+n+"is not prime");
                    break;
                }else {
                    System.out.println("Number "+n+"is prime");
                    break;
                }
            }
        }
    }
}