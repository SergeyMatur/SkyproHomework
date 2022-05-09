package Homework;

public class Massivy2 {
    public static void main(String[] args) {
        int[] newArray = generateRandomArray();

        //Задача 1
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum = sum + newArray[i];
        }
        System.out.println("Сумма составила " + sum + " рублей");

        // Задача 2
        int max = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > max) {
                max = newArray[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        int min = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < min) {
                min = newArray[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        // Задача 3
        double dayInMonth = 30;
        double average = (sum / dayInMonth);
        System.out.println("Средняя сумма трат " + average + " рублей");

        // Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] newArray = new int[30];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100_000) + 100_000;
        }
        return newArray;
    }
}
