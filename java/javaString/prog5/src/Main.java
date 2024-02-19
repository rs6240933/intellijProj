import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String st = sc.nextLine();
        char arr[] = st.toCharArray();
        int k=0;
        int l[] = new int[arr.length];
        int l1[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            k=1;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    k++;
                }
            }
                l[i] = k;
                l1[i] = k;
        }
        Arrays.sort(l1);
        int n1 = l1[l1.length-1];
        int n2 = l1[0];
        for(int z=0; z<l1.length; z++){
            System.out.println(l[z]);
        }
        int index = 0;
        int index2 = 0;
        for(int z=0; z<l.length; z++){
            if(l[z] == n1){
                index = z;
                break;
            }
        }
        for(int m=l.length-1; m>=0; m--){
            if(l[m] == n2){
                index2 = m;
                break;
            }
        }
        System.out.println(arr[index]+" occured maximum times that is"+n1);
        System.out.println(arr[index2]+" occured minimul times that is"+n2);
    }
}