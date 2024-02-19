public class Main {
    public static void main(String[] args) {
        int k=0;
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if((j==1 || j==7 || i==1 || i==7)||(i>2 && i<6 && j>=3 && j<=5)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
//*******
//*     *
//* *** *
//* * * *
//* *** *
//*     *
//*******
//1234567

