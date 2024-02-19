import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        System.out.println("Enter First matrix of 3 by 3");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second matrix of 3 by 3");
        for(int x=0; x<3; x++){
            for(int k=0; k<3; k++){
                a[x][k] = sc.nextInt();
            }
        }
        for(int x=0; x<3; x++){
            for(int k=0; k<3; k++){
               int sum = 0;
                for(int j=0; j<3; j++){
                    sum = a[x][k] + b[k][j];
                }
                c[x][k] = sum;
            }
        }

        for(int x=0; x<3; x++){
            for(int k=0; k<3; k++){
                System.out.println(c[x][k]);
            }
            System.out.println(" ");
        }
    }
}