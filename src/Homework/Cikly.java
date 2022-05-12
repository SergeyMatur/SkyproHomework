package Homework;

public class Cikly {
    public static void main(String[] args) {

        //Задача 1
        int i = 0;

        while ( i < 10) {
           i++;
           System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int j = 10; j >0; j--) {
            System.out.print(j + " ");
        }
        System.out.println(" ");

        //Задача 2
        int daiInMonth = 31;
        int friday = 5;
        for (int k = friday; k < 31; k = k + 7) {
            System.out.println("Сегодня пятница, " + k + "-е число. Необходимо подготовить отчет.");
        }

        //Задача 3
        int year = 2022;
        for (int a = 0; a < year + 100; a = a + 79) {
            if (a > year - 200) {
                System.out.println(a);
            }

        }
    }
}
