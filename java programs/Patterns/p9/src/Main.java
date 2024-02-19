public class Main {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            for(int j=1; j<=9; j++){
                if(j<=6-i || j>3+i ){
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}


// * * * * * * * * *    i=1, j=123456789
// * * * *   * * * *    i=2, j=1234 6789
// * * *       * * *    i=3, j=123   789  7-i, 3+i,   , 6-i, 3+i
// * *           * *
// *               *
// 1 2 3 4 5 6 7 8 9