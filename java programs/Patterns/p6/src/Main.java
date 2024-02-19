import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=6; i++){
            for(int j=1; j<=6; j++){
                if(j==7-i){
                    System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

//      1
//     2
//    3
//   4
//  5
// 6