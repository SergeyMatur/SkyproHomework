package Homework;

public class Massivy1 {
    public static void main(String[] args) {

        //задача 1
        int[] Arr1 = new int[]{1, 2, 3};
        double[] Arr2 = {1.57, 7.654, 9.986};
        int[] Arr3 = {3, 2, 1, 2, 3};

        //задача 2
        for (int i = 0; i < Arr1.length; i++) {
            if (i < (Arr1.length - 1)) {
                System.out.print(Arr1[i] + ", ");
            }
        }
        System.out.println(Arr1[Arr1.length - 1]);

        for (int i = 0; i < Arr2.length; i++) {
            if (i < (Arr2.length - 1)) {
                System.out.print(Arr2[i] + ", ");
            }
        }
        System.out.println(Arr2[Arr2.length - 1]);

        for (int i = 0; i < Arr3.length; i++) {
            if (i < (Arr3.length - 1)) {
                System.out.print(Arr3[i] + ", ");
            }
        }
        System.out.println(Arr3[Arr3.length - 1]);

        //задача 3
        for (int i = (Arr1.length - 1); i >= 0; i--) {
            if (i > 0) {
                System.out.print(Arr1[i] + ", ");
            }
        }
        System.out.println(Arr1[0]);

        for (int i = (Arr2.length - 1); i >= 0; i--) {
            if (i > 0) {
                System.out.print(Arr2[i] + ", ");
            }
        }
        System.out.println(Arr2[0]);

        for (int i = (Arr3.length - 1); i >= 0; i--) {
            if (i > 0) {
                System.out.print(Arr3[i] + ", ");
            }
        }
        System.out.println(Arr3[0]);

        //задача 4
        for (int i = 0; i < Arr1.length; i++) {
            if (Arr1[i] % 2 == 0) {
                System.out.print(Arr1[i] + " ");
            } else {
                Arr1[i] = Arr1[i] + 1;
                System.out.print(Arr1[i] + " ");
            }
        }

    }
}
