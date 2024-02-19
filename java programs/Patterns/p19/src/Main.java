public class Main {
    public static void main(String[] args) {
        int k=0;
        for(int i=1; i<=9; i++){
            if(i<6)
                k++;
            else
                k--;
            for(int j=1; j<=9; j++){
                if(j<=6-k || j>3+k){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
//        ********* i-1, j- 123456789
//        **** **** i-2, j- 1234 6789 j<=6-i, j>3+i
//        ***   ***           3   789
//        **     **
//        *       * i-5, j- 1       9
//        **     ** i-6, j- 12     89
//        ***   ***
//        **** ****
//        *********
//        123456789