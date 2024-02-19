public class Main {
    public static void main(String[] args) {
        mycar obj = new mycar();
        obj.carname();
        obj.color();
    }
}

//    it is process of hiding the implementation details.
//        •	Abstract class are those which has any abstract methods
//        •	Abstract methods are those which do not have body
//        •	If any one abstract methods are present in cass then full class becomes abstract
//        •	The object of abstract class can never be made
//        •	Any methods or variable in abstract class can never be private.
//        •	Difference b/w abstract class and interface is -> interface has all methods abstract but in abstract class it is the combination of abstract and not abstract methods
