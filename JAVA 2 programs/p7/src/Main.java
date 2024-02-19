import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String letter = sc.nextLine();
        char arr[] = letter.toCharArray();
          char n1 = 'P';
          char arr1[] = new char[arr.length];
          for (int i=0; i< arr.length; i++){
              arr1[i] = arr[i];
          }
          arr1[arr1.length-1] = n1;


        for(int i =0; i < arr1.length; i++){
            System.out.println((i+1)+"-"+ arr1[i]);
        }
    }
}