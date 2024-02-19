public class myCar extends CarsDetails{

    public static void main(String[] args){
        myCar car = new myCar();
        car.engine();
        car.SafetyFeature();
        car.color();
    }

    @Override
    public void color() {
        System.out.println("My car color is red");
    }
}
