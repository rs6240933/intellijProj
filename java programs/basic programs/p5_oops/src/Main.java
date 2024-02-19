

Class and Object -
        --Class - it contains Attribute and behavior
        --It does not accquire space in memory
        ex- if class is car then
        attribute : model, color,price
        behavior: Run(), Accelerate()
        Object
        --It is instance of class
        --It accquires space in memory

        Access modifier
        --private -- private methods,variables are acces only within same clas ,
        bi difault tha variables are private and methods are private
--internal - class only be internal or public
     .internal modifier are used within the same assembly or project
             . Class --> namespace--> assembly

             Protected- used in inheritance
             ---var and methods are acces in same class or in inherited class only
Public- used in any class


import java.util.Scanner;
class car {
    Scanner sc = new Scanner(System.in);
    void mycar(){
        System.out.println("Enter your car name");
        String name =sc.nextLine();
        System.out.println("Your car is "+ name);
    }
}
public class Main {
         public static void main(String[] args){
             car obj = new car();
             obj.mycar();
         }

}
import java.util.Scanner;
class car {

    void mycar(String nam){

        System.out.println("Your car is "+ nam);
    }
}
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your car name");
        String name =sc.nextLine();
        car obj = new car();
        obj.mycar(name);
    }

//}
import java.util.Scanner;
class car {
    Scanner sc = new Scanner(System.in);
    String mycar(){
        System.out.println("Enter your car name");
        String name =sc.nextLine();
        return name;
    }
}
public class Main {
         public static void main(String[] args){
             car obj = new car();
             String my_car_name = obj.mycar();
             System.out.println("My car name is "+ my_car_name);
         }

}
