import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String st = sc.nextLine();
        char arr[] = st.toCharArray();
        char arr1[] = new char[arr.length];
        int x = 0;
        for(int i = arr.length-1; i>=0; i-- ){
            arr1[x] = arr[i];
            x++;
        }
        String res = new String(arr1);
        System.out.println(res);
    }
}