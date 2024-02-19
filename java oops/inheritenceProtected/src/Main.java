public class Main {
    public static void main(String[] args) {
        mycar obj = new mycar();
        obj.cardetail();
        cars obj1 = new cars();
        String n = obj1.name;
        System.out.println(n);
    }
}

//protected variable can be accessed by its sub class. But protected variables can also be accessed with any class if it is in the
//same package