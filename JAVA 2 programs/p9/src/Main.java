import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar1 = {3,6,1,4,2,6};
        int n = 6;
        int a1[] =  sort();

        for(int x=0; x<a1.length; x++){
            System.out.print(a1[x]+",");
        }

    }
    public static int[] sort(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n =sc.nextInt();
        System.out.println("Enter the array");
        int[] ar1 = new int[n];
        for(int i=0; i<n; i++){
            ar1[i] = sc.nextInt();
        }
        for(int pass = 1; pass <= n-1; pass++){
            for(int i=0; i<=n-1-pass; i++){
                if(ar1[i] > ar1[i+1]){
                    int temp = ar1[i];
                    ar1[i] = ar1[i+1];
                    ar1[i+1] = temp;
                }
            }
        }

        return ar1;
    }
}