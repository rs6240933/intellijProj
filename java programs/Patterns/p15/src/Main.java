public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=7; i++){
            int k=7-i;
            for(int j=1; j<=7; j++){
                if(j>=1 && j<=8-i){
                    System.out.print(k);
                    k--;

                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
//
//        6543210
//        543210
//        43210
//        3210
//        210
//        10
//        0