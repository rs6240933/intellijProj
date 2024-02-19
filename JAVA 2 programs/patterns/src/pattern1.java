public class pattern1 {
    //        ****** i = 1, j= 6
//        ****** i=2, j=6
//        ******
//        ******
//        ******
//        ******
    public void p1() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j <= 6) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
//*     i=1; j=1
//**    i=2; j=1,2
//***
//****
//*****
//******

    public void p2() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }

    //     *  i=1; j=6
//    **  i=2; j=5,6
//   ***  i=3; j=456
//  ****
// *****
//******
    public void p3() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j >= 7 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    //****** i=1; j=6
//***** i=2; j=5
//****
//***
//**
//*
    public void p4() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j <= 7 - i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    //      1    i=1; j=6
//     2     i=2; j=5
//    3
//   4
//  5
// 6
    public void p5() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j == 7 - i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}