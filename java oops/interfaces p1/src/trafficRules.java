//Interface  -
//        •	 An interface in java is a blueprint of a class.
//        •	In interface all the methods do not have body or definition
//        •	Every class that implements Interface should have to declare the body of all the methods of implemented interface.
//        •	The variables which are defined In interface are bi-default public.
//        •	One class can also implements more than 1 interfaces.
//        To create interface create and interface and declare the methods.





public class trafficRules implements trafficSignals{

    public static void main(String[] args){
        trafficSignals  rules =   new trafficRules(); //here we have created the object of trafficSignals because the methods are declared in those interface
        rules.greenSignal();
        rules.RedSignal();
        rules.YellowSignal();
    }

    @Override
    public void greenSignal() {
        System.out.println("This will let the vehicles go");
    }

    @Override
    public void YellowSignal() {
        System.out.println("This will let the vehicles ready to go");
    }

    @Override
    public void RedSignal() {
        System.out.println("This will stop the vehicle");
    }
}
