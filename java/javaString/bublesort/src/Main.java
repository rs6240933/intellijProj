import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        bubblee(arr, n);

    }
   public static void bubblee(int[] arr1, int n1){
         for(int pass = 1; pass <= n1-1; pass++){
             for(int i=0; i<=n1-1-pass; i++){
                 if(arr1[i] > arr1[i+1]){
                     int temp = arr1[1];
                     arr1[i] = arr1[i+1];
                     arr1[i+1] = temp;
                 }
             }
         }
       for (int i=0; i<n1; i++){
           System.out.println(arr1[i]+",");
       }
    }
}