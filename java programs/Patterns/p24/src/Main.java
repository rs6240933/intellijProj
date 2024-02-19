public class Main {
    public static void main(String[] args) {
        int k=0;
        for(int i=1; i<=4; i++){
            char a ='A';k=1;
            for(int j=1; j<=8; j++){
                if(j>=5-i && j<5+i){
                    if(j<=4){
                        System.out.print(a);
                        a++;
                    }else{
                        System.out.print(k);
                        k++;
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}


//   A1
//  AB12
// ABC123
//ABCD1234
//12345678