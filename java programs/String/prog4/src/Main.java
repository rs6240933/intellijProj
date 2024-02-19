import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int e1 =  number();
       int arr[]= new int[20]; //or new int[20]
            arr[0] = e1;
            System.out.print(arr[0]+",");
            int index = 0;
            System.out.println(" ");
            int p = number();
            calculate(arr,p, index);

    }
    public static void calculate(int arr[], int p, int index){
            index++;
            arr[index] = p;
        for(int i=0; i<=index; i++){

           System.out.print(arr[i]+", ");

        }
            System.out.println(" ");
            p = number();
            calculate(arr, p, index);
    }
    public static int number(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number");
        n = sc.nextInt();
        return n;
    }
}