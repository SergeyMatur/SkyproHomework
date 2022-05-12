package Homework;

import java.util.Locale;

public class Stroki {
    public static void main(String[] args) {
        /*String phone = "+937 942 29 69";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = "7" + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        // проверка
        String expectedPhone = "79379422969";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }*/

        //Задача 1
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovicv";
        System.out.println("ФИО сотрудника — "+ lastName+" "+firstName+" "+middleName);

        //Задача 2
        String fullName = "Иванов Иван Иванович";
        String capitalized = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + capitalized);

        //Задача 3
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName2);



    }
}
