public class Main {

    public static void main(String[] args) {

        int n = 123;

        while (n > 0){
            int a =  n%10;
            if(a%2 == 0){
                System.out.println(a+" number is even");
            }else{
                System.out.println(a+"number is odd");
            }

            n=n/10;
        }

    }
}