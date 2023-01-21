public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("задача 1");
        int cash = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            total = total + cash;
            i++;
            System.out.println("Месяц " + i + " , сумма накоплений равна "
                    + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (int k = 10; k >= 1; --k) {
            System.out.print(" " + k + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("задача 3");
        int population = 12_000_000;

        float birthrate = (float) (17.0 / 1000) * population;
        float mortality = (float) (8.0 / 1000) * population;
        float populationGrowth = birthrate - mortality;
        int year = 0;
        while (year < 10) {
            population = (int) (population + populationGrowth);
            year++;
            System.out.println("Год " + year +
                    ", численность населения составляет "
                    + population);
        }
    }

    public static void task4() {
        System.out.println("задача 4");
        int cash = 15000;
        int month = 0;
        int total = 0;
        while (total < 12000000) {
            total = total + (total * 7) / 100;
            total = total + cash;
            month++;
            System.out.println("Месяц " + month + ", накопления составляют " + total);
        }
    }

    public static void task5() {
        System.out.println("задача 5");
        int cash = 15000;
        int month = 0;
        int total = 0;
        while (total < 12000000) {
            total = total + (total * 7) / 100;
            total = total + cash;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопления составляют " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("задача 6");
        int cash = 15000;
        int month = 0;
        int total = 0;
        while (month < 108) {
            total = total + (total * 7) / 100;
            total = total + cash;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопления составляют " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("задача 7");
        int friday = 6;
        int monthDay = 31;
        for (; friday < monthDay; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + " -е число." +
                    "Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("задача 8");
        int year = 2023;
        int oldYear = year - 200;
        int futureYear = year + 100;
        int yearComet = 0;
        while (yearComet < futureYear) {
            if (yearComet > oldYear) {
                System.out.println(yearComet);
            }
            yearComet = yearComet + 79;
        }
    }

}