import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
           boolean k= true;
            for(int j=1; j<=9; j++){
                if(j>=6-i && j<=4+i && k){
                    System.out.print("*");
                    k=false;
                }else {
                    System.out.print(" ");
                    k=true;
                }
            }
            System.out.print("\n");
        }
    }
}
//    * i=1, j=5
//   * * i=2, j=4,6
//  * * * i=3, j=3,5,7
// * * * *
//* * * * *
//123456789