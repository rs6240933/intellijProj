import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=6; i++){
            for(int j=1; j<=6; j++){
                if(j>=7-i){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}

//     * i=1, j=6
//    **  i=2, j=5,6
//   ***  i=3, j=456
//  ****
// *****
//******