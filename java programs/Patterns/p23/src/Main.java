public class Main {
    public static void main(String[] args) {
        int k=0;
        for(int i=1; i<=6; i++){
            k=1;
            for(int j=1; j<=6; j++){
                if(j<=i){
                    System.out.print(k);
                    if(k==0)
                        k=1;
                    else
                        k=0;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

//1
//10
//101
//1010
//10101
//101010
