
//Access modifier - It desides the class & method's accessibility
// --private -- private methods,variables are acces only within same clas ,
// bi default tha variables are private and methods are private.
//--internal - class only be internal or public
//     .internal modifier are used within the same assembly or project
//. Class --> namespace--> assembly
//Protected- used in inheritance
//---var and methods are acces in same class or in inherited class only
//Public- used in any class

public class Main {
    public static void main(String[] args) {
        myCar obj = new myCar();
        String n = obj.car_name; //car name is public hence it can be access by other class
        //int n1 = obj.car_price; //car price is private so not be acceess by othrt class
        System.out.println("This is main class, your car is "+n);
        obj.details();
    }
}

class myCar{
        public String car_name = "Alto";
        private int car_price = 200000;
    public void details(){
        System.out.println("This is my car class, your car is "+car_name+" and price "+car_price);
    }
}