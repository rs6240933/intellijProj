public class Main {
    public static void main(String[] args) {
          int n = 4;

        System.out.println(fact(n));

    }
    public static int fact(int n){
        int res;
        if(n==0){
            res = 1;
        }else{
            res = n * fact(n-1);
        }
        return res;
    }
}