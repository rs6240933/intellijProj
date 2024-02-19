import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str  = sc.nextLine();
        char letter[] = str.toCharArray();
        int count =0;

            for (int i = 0; letter[i] == '\0'; i++) {
                count++;
            }
            System.out.println(count);



    }
}