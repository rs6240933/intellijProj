public class Main {
    public static void main(String[] args) {

        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if(j==i || j==8-i){
                    if((i<4 && j==8-i)||(i>4 && j==8-i))
                    System.out.print("/");
                    else
                        System.out.print("\\");
                }else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
//i=7
//\*****/  i=1, j=1,7
//*\***/*  i=2, j=2,6
//**\*/**       j=3,5     j=i   j=8-i
//***\***  i=4, j=4
//**/*\**  i=5, j=3,5
//*/***\*  i=6, j=2,6
///*****\
//1234567
