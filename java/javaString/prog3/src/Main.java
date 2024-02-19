import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String st = sc.nextLine();
        char arr[] = st.toCharArray();
        int A=0, B=0;
        for (int i =0; i<arr.length; i++){
            if(arr[i] >= 'A' && arr[i] <= 'Z' || arr[i]>='a' && arr[i]<='z'){
                A = 1;
            }
            if(arr[i] >= '1' && arr[i] <= '9'){
                B = 1;
            }
        }
        if(A==B){
            System.out.println("String is arithmetic");
        }
    }
}