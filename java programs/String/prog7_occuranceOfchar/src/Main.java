import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String n1 = sc.nextLine();
        char arr[] = n1.toCharArray();
//        char arr2[] = {20};
//        int index = 0;
        for(int i=0; i<arr.length; i++){
            int k=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    k++;
                    arr[j] = '`';
                }
            }
//            arr2[index] = arr[i];
//            System.out.println(arr2[index]);

//            for(int a=0; a<=index; a++){
               if(arr[i]!='`')
                   System.out.println(arr[i]+" appears "+k+ " times.");
//            }
//            index++;
        }
    }
}

//    int index = ArrayUtils.indexOf(numbers, element);