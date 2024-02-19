import java.util.Scanner;

public class Main {
   public static void main (String[] args){
     call();
   }
    public static void call(){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter 1 for addition, 2 for multiplication");
        x = sc.nextInt();
        switch(x){
            case 1:{
                int n1,n2,res;
                System.out.println("Enter first number ");
                n1 = sc.nextInt();
                System.out.println("Enter second number ");
                n2 = sc.nextInt();
                res = add(n1,n2);
                System.out.println("Addition is "+ res);
                call();
                break;
            }
            case 2:{
                int n1,n2,res;
                System.out.println("Enter first number ");
                n1 = sc.nextInt();
                System.out.println("Enter second number ");
                n2 = sc.nextInt();
                res = mul(n1,n2);
                System.out.println("multiplication is "+ res);
                call();
                break;
            }
            default : System.out.println("Enter correct");
            call();
        }
    }

    public static int add(int r1, int r2){
        int p = r1+r2;
        return p;
    }
    public static int mul(int r1, int r2){
        int p = r1*r2;
        return p;
    }
}