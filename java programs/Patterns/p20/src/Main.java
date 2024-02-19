public class Main {
    public static void main(String[] args) {
        int k=0,c=0;
        for(int i=1; i<=9; i++){
            c=1;
            if(i<6)
                k++;
            else
                k--;
            for(int j=1; j<=5; j++){
                if(j>=6-k){
                    System.out.print(c);
                    c++;
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

//    1
//   12
//  123
// 1234
//12345
// 1234
//  123
//   12
//    1