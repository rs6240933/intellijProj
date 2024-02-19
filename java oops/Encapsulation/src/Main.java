public class Main {
    //Hiding of sesitive data
    //USe getter and setter method and make sensitive data as private
    public static void main(String[] args) {
        accountDetails obj = new accountDetails();
        System.out.println(obj.getter());
        obj.setter(2000);
        obj.setter(30000);
        System.out.println(obj.getter());
    }
}