package Homework;

public class Metody {
//    public static void main (String[] args) {
//        int num1 = 5;
//        int num2 = 6;
//        int[] arr = {1, 2, 3};
//        calculateSum(arr);
//        String osName = "iOS";
//        int clientOS = getClientOS(osName);
//        System.out.println(clientOS);
//    }
//
//
//    public static void calculateSum(int[] arr) {
//        int sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        System.out.println("Сумма элементов массива: " + sum);
//    }
////    public static void calculateSum(int[] arr) {
////        int sum = 0;
////        for (int i = 0; i < arr.length; i++) {
////            sum = sum + arr[i];
////        }
////        System.out.println("Сумма элементов массива: " + sum);
////    }
//
//
//    public static int getClientOS(String name) {
//        if (name.equals("iOS")) {
//            return 0;
//        }
//            return 1;
//
//    }

    public static void main(String[] args) {
        int year = 2025;
        findYear(year);

        int clientOS = 0; //iOs
        int clientDeviceYear = 2015;
        installOs(clientOS, clientDeviceYear);

        int deliveryDistance = 70;
        int day = 0;
        deliverTheCard(deliveryDistance, day);
    }

    // Задание 1
    public static void findYear(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            if (year % 100 == 0) {
                System.out.println(year + " - высокостный год");
                return;
            }
            if (year % 100 != 0) {
                System.out.println(year + " - высокостный год");
                return;
            }
        } else {
            System.out.println(year + " - год не высокостный");
            return;
        }
    }

    // Задание 2
    public static void installOs(int clientOS, int clientDeviceYear) {
        int currentYear = 2022;
        if (clientDeviceYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облнгченную версию приложения для iOS по ссылке");
            }
            if (clientOS == 1) {
                System.out.println("Установите облнгченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Установите приложение по ссылке");

        }
    }

    // Задание 3
    public static void deliverTheCard(int deliveryDistance, int day) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (day + 2));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (day + 3));
        } else {
            System.out.println("Так далеко не доставим");
        }
    }
}
