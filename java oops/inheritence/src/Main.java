public class Main {
    public static void main(String[] args) {
        mycar obj = new mycar();
        obj.mycar();
        obj.name = "Alto";
        obj.mycar();
    }
}
//
//    public	The code is accessible for all classes
//private	The code is only accessible within the declared class
//default	The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
//protected	The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter