import java.util.Scanner;

public class Main {

            public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                System.out.println("Enter the String");
            String n1 = sc.nextLine();
            char arr[] = n1.toCharArray();
                System.out.println("Enter the Character to find");
            String n2 = sc.nextLine();
            char n3[] = n2.toCharArray();
            int count =0;
                for(int i=0; i<arr.length; i++){
                if(arr[i]==n3[0])
                    count++;
            }
                System.out.println(count);
        }
}


