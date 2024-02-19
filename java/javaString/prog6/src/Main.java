import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        char[] arr = st.toCharArray();
        int i,j,k;
        for(i = 0; i<arr.length; i++){
            for(j=i+1; j< arr.length;){
                if(arr[i] == arr[j]){
                    for(k=j; k<arr.length - 1; k++){
                        arr[k] = arr[k+1];
                    }
                    arr[k] = '\0';
                }else{
                    j++;
                }
            }
        }
        for(int a=0; a<arr.length; a++){
            if(arr[a] != '\0'){
                System.out.println(arr[a]);
            }

        }
    }
}