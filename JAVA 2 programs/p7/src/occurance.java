import java.util.Scanner;

public class occurance {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        char arr[] = letter.toCharArray();
        System.out.println("Enter the character");
        char alpha = sc.next().charAt(0);
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == alpha){
                count++;
            }
        }
        System.out.println(alpha +"occured "+count);
    }
}
