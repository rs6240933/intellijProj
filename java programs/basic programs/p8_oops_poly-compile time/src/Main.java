//Polymorphism
//        --having many form
//        --comple time polymorphism (acheived by method overloading)
//        --Run time polymorphism (achieved by method overiding)
//
//        Mothod overloading - ek class m same name k 2 method hote h pr sabhi methods jo same h unke parameters alag hone chiyee
//
//        Method overiding-
//        -- agar parent class m ek method h or uski child class m b same name ka method h tb parent class ka method overide ho jyega

import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        calculator obj  = new calculator();
        obj.sum(2.3f, 2);
    }
}

class calculator {
    public void  sum(int a,int b){
//        int x = Integer.parseInt(a);
//        int y = Integer.parseInt(b);
        System.out.println("this is first sum " +(a+b));
    }
    public void  sum(float a,float b){
        System.out.println("This is second sum "+(a+b));
    }
    public void  sum(float a,int b){
        System.out.println("This is third sum "+(a+b));
    }
    public void  sum(int a,float b){
        System.out.println("This is fourth sum "+(a+b));
    }
}