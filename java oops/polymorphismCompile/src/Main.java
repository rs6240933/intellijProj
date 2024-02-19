public class Main {
    public static void main(String[] args) {
        addition obj = new addition();
        System.out.println(obj.add(2,2));
        System.out.println(obj.add(14.5f, 12.3f));
    }
}

//compile time polymorphism can be accieved by mthod overloading, whih means same class have same method but its parameters are different