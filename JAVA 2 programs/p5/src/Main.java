import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        bankDetails obj = new bankDetails();
        obj.setter(n1);
        obj.getter();

    }
}