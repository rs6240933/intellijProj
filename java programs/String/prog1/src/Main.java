import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String letter = sc.nextLine();
        char str[] = letter.toCharArray();
        for(int i=0; i< str.length; i++){
            System.out.println((i+1)+"- "+str[i]);
        }
    }
}