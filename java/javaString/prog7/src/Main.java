import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        char[] arr = st.toCharArray();
        int k=0;
        int max = 0;
        char a = ' ';
        for(int i=0; i<arr.length; i++){
            k=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    k++;
                    arr[j] = '`';
                }
            }
            if(max < k){
                max = k;
                a = arr[i];
            }
        }
        System.out.println(a);
    }
}