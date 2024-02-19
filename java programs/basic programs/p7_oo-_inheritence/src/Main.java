//Inheritence -- Process of inheriteing property of parent class by subclass
//TYPES of inheritance-
//        Single - parent clasd- child class
//Multilevel -- class-A --> classB-->classC
//        Hierarchical- class A -->classB
//        ClassA -->classC both access class A
//Multiple- Multiple parent class ko single child inheritance kr ta h
public class Main {


    public static void main(String[] args) {
         mycar obj = new mycar();
         obj.name = "Alto";
          obj.cars();
    }
}

 class car_detail{
    public int carMilage = 20;
    protected String color = "red";
}

class mycar extends car_detail{
    public String name;
    public void cars(){
        System.out.println("CAr name is "+name+" mileage is "+carMilage+"color is "+color);
    }
}