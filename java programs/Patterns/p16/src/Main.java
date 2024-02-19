public class Main {
    public static void main(String[] args) {
        int k=0;
        for(int i=1; i<=9; i++){
            if(i<=5)
                k++;
            else
                k--;
            for(int j=1; j<=5; j++){
                if(j>=1 && j<=k){
                    System.out.print(j);

                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

//           1
//           12
//           123
//           1234
//           12345
//           1234
//           123
//           12
//           1