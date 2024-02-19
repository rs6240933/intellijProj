import java.util.Arrays;
import java.util.Scanner;

public class reverse {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");
            String letter = sc.nextLine();
            char arr[] = letter.toCharArray();
            char arr1[] = new char[arr.length];
            int z=0;
            for(int i = arr.length-1; i >= 0; i--){
                arr1[z] = arr[i];
                z++;
            }
//            for(int a = 0; a < arr1.length; a++){
//                System.out.println(arr1[a]);
//            }
            String str = new String();
            String letterr = str.valueOf(arr1);
            System.out.println(letterr);
        }
    }

