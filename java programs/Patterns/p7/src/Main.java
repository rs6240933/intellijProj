import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=7; j++){
                if(j>=5-i && j<=3+i){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}

//   * i=1, j=4
//  ***  i=2, j=3,4,5
// *****  i=3, j=2,3,4,5,6
//*******
//  1234567