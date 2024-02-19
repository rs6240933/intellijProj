import java.util.Scanner;

public class stringArthmetic {
    public static void main(String[] args){
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        char arr[] = letter.toCharArray();
        int A = 0;
        int B = 0 ;

        for(int i = 0; i < arr.length; i++){
            if((arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= 'a' && arr[i] <= 'z')){
                A = 1;
            }
            if(arr[i] >= '0' && arr[i]<= '9'){
                B = 1;
            }
        }
        System.out.println(A);
        System.out.println(B);
        if(A == 1 && B == 1){
            System.out.println("The string "+ letter +" is arithmetic");
        }
    }
}
