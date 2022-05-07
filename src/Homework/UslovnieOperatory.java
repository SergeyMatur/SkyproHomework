package Homework;

public class UslovnieOperatory {
    public static void main(String[] args) {

        //Задание 1
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        //Задание 2
        int clientDeviceYear = 2016;
        if (clientDeviceYear <= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облнгченную версию приложения для iOS по ссылке");
            }
            if (clientOS == 1) {
                System.out.println("Установите облнгченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Установите приложение по ссылке");

        }

        //Задание 3
        int year = 2024;
        if (year % 4 == 0 || year % 400 == 0) {
            if (year % 100 == 0) {
                System.out.println("Год не высокостный");
            }
            if (year % 100 != 0) {
                System.out.println("Год высокостный");
            }
        } else {
            System.out.println("Год не высокостный");
        }

        //Задание 4
        int deliveryDistance = 110;
        int day = 0;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (day + 2));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (day + 3));
        } else {
            System.out.println("Так далеко не доставим");
        }

        //Задание 5
        int monthNumber = 6;

        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
