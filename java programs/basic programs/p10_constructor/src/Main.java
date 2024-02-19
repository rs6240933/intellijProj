import java.util.Scanner;
//Constructor
//        --method same name as class
//       --dont hve any return type
//        --automatically executed when object get created
//        Types--
//        --parameterize constructor
//        --default cons
//        --user defined




//public class Main {
//
//    public static void main(String[] args) {
//        carDetails obj = new carDetails(); //default constructor
//    }
//}
//
// class carDetails{
//      public carDetails(){
//          System.out.println("Swift is my car ");  // user defined constructor
//      }
//}


//Parameterize Constructor
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter car name");
        String n = sc.nextLine();
        System.out.println("Enter car price");
        int n1 = sc.nextInt();
        carDetails obj = new carDetails(n,n1);
       String res =  obj.cars();
       System.out.println(res);
    }
}

class carDetails{
    public int price ;
    public String name;
    public carDetails(String nam, int amount ){
        name  = nam;
        price = amount ;
    }
    public String cars (){
        String get = "CAr name is "+name+" and amount is "+price;
        return get;
    }
}