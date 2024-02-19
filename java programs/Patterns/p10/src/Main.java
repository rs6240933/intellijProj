public class Main {
    public static void main(String[] args) {

        for(int i=1; i<=4; i++){
            int a=0;
            for(int j=1; j<=7; j++){
                if(j>=5-i && j<=3+i ){
                    if(j<=4)
                    a++;
                    else
                     a--;
                    System.out.print(a);

                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

//      1 i=1, j=4
//    1 2 1 i=2, j=3,4,5  5-i, 3+i
//  1 2 3 2 1   i=3, j= 2,3,4,5,6
//1 2 3 4 3 2 1

//1 2 3 4 5 6 7