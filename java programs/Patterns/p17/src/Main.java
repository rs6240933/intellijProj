public class Main {
    public static void main(String[] args) {

        for(int i=1; i<=4; i++){
            char a= 'A';
            for(int j=1; j<=7; j++){
                if(j>=5-i && j<=3+i){
                    System.out.print(a);
                    if(j<4)
                        a++;
                    else
                        a--;


                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

//   A
//  ABA
// ABCBA
//ABCDCBA