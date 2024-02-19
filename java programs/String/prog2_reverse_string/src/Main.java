import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String letter = sc.nextLine();
        char str[] = letter.toCharArray();
        for(int i=str.length-1; i>= 0; i--){
            System.out.print(str[i]);
        }
    }
}