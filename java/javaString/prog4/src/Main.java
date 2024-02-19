import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String st = sc.nextLine();
        char arr[] = st.toCharArray();
        int k=0;
        for(int i = 0; i < arr.length; i++){
            k=1;
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    k++;
                    arr[j] = '`';
                }
            }
            if (arr[i] != '`'){
                System.out.println(arr);
                System.out.println(arr[i]+"occured "+k+" times");
            }
        }
    }
}