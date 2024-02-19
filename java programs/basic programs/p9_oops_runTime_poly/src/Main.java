

public class Main {
    public static void main(String[] args) {
        cars obj = new cars();
        obj.mycar();
    }
}

class car_details{
    public void mycar(){
        System.out.println("My car is alto");
    }
}

class cars extends car_details{
    public void mycar() {
        System.out.println("My car is swift");
    }
}