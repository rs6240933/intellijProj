import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String n1 = sc.nextLine();
//        char a1[] = n1.toCharArray();
          int a1[] = {1,2,3,4,4,5};
        for(int i=0; i<a1.length; i++){
            for(int j=i+1; j<a1.length;){
                if(a1[i] == a1[j]){
                    for(int k=j; k<a1.length; k++){
                        a1[k] = a1[k+1];
                    }

                }else{
                    j++;
                }
            }
        }
        for(int s=0; s<a1.length; s++){
            System.out.print(a1[s]);
        }

    }
}
/