import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int res = obj.fact(n);
        System.out.println(res);
    }
    public  int fact(int a){
        int ans;
        if(a==0){
            ans = 1;
        }else{
            ans = a*fact(a-1);
        }
        return (ans);
    }
}