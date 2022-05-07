package Homework;

public class Peremennie {
    public static void main(String[] args) {
        //задание 1
        byte a = 1;
        short b = 1;
        int c = 1;
        long d = 1;
        float e = 1.1f;
        double f = 1;
        boolean g = a < 10;
        char h = 35;
        System.out.println(h);

        //задание 2
        float weight1 = 78.2f;
        float weight2 = 82.7f;
        float sum = weight1 + weight2;
        float delta = weight1 - weight2;
        System.out.println("Общий вес бойцов " +sum+" кг" );
        System.out.println("Разница в весе бойцов" +delta+" кг" );

        //задание 3
        int banana = 5;
        int bananaWeight = 80;
        int bananaWeightAll = banana * bananaWeight;
        int milk = 200;
        int milkWight = 105/100;
        int milkWightAll = milk * milkWight;
        int iceCream = 2;
        int iceCreamWeight = 100;
        int iceCreamWeightAll = iceCream * iceCreamWeight;
        int egg = 4;
        int eggWeight = 70;
        int eggWeightAll = egg * eggWeight;

        int weightGramm = bananaWeightAll + milkWightAll + iceCreamWeightAll + eggWeightAll;
        double weightKg = weightGramm/1000;
        System.out.println("Вес завтрака "+weightGramm+ " грамм");
        System.out.println("Вес завтрака "+weightKg+ " килограммграмм");

        //задание 4
        int excessWeight = 7000;
        int result1 = 250;
        int result2 = 500;
        int result3 = (result1 + result2)/2;
        int countDay1 = excessWeight / result1;
        int countDay2 = excessWeight / result2;
        int countDay3 = excessWeight / result3;
        System.out.println("Если ежедневно худеть на "+ result1 + " грамм, на похудение уйдет " + countDay1+ " дней");
        System.out.println("Если ежедневно худеть на "+ result2 + " грамм, на похудение уйдет " + countDay2+ " дней");
        System.out.println("Если ежедневно худеть на "+ result3 + " грамм, на похудение уйдет " + countDay3+ " дней");

        //задание 5
        double increase = 1.1;
        double month = 12;


        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;

        double salaryMashaYear = salaryMasha * month;
        double salaryDenisYear = salaryDenis * month;
        double salaryKristinaYear = salaryKristina * month;

        double salaryMashaNew = salaryMasha * increase;
        double salaryDenisNew = salaryDenis * increase;
        double salaryKristinaNew = salaryKristina * increase;

        double salaryMashaNewYear = salaryMashaNew * month;
        double salaryDenisNewYear = salaryDenisNew * month;
        double salaryKristinaNewYear = salaryKristinaNew * month;

        System.out.println("Маша теперь получает " + salaryMashaNew + " рублей. Годовой доход вырос на " + (salaryMashaNewYear - salaryMashaYear) + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisNew + " рублей. Годовой доход вырос на " + (salaryDenisNewYear - salaryDenisYear) + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaNew + " рублей. Годовой доход вырос на " + (salaryKristinaNewYear - salaryKristinaYear) + " рублей");
    }

}
