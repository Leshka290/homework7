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

        int startMoney = 0;
        int depositMoney = 15000;
        int month = 0;
        while (startMoney <= 2_459_000){
            startMoney += depositMoney;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + startMoney + " рублей");
        }
    }

    public static void task2() {

        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task3() {

        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;

        int year = 2023;
        int necessaryYear = year + 10;

        while (year <= necessaryYear) {
            population += (population/1000) * (fertility - mortality);
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {

        int startMoney = 15000;
        int rate = 7;
        int month = 0;

        while (startMoney <= 12_000_000) {
            startMoney += (startMoney * rate) / 100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений " + startMoney);
        }
    }

    public static void task5() {

        int startMoney = 15000;
        int rate = 7;
        int month = 0;

        while (startMoney <= 12_000_000) {
            startMoney += (startMoney * rate) / 100;
            month++;
            if(month % 6 == 0){
                System.out.println("Месяц " + month + ", сумма накоплений " + startMoney);
            }
        }
    }

    public static void task6() {

        int startMoney = 15000;
        int rate = 7;
        int halfYear = 0;
        int year = 9;
        int month = year * 12;

        while (halfYear <= month) {
            for (int i = 0; i <= 6; i++) {
                startMoney += (startMoney * rate) / 100;
            }
            halfYear += 6;
            System.out.println("Месяц " + halfYear + ", сумма накоплений " + startMoney);
        }
    }

    public static void task7() {

        int numFri = 3;
        int month = 31;
        do{
            System.out.println("Сегодня пятница, "+ numFri +" -е число. Необходимо подготовить отчет");
            numFri += 7;
        }
        while
        (numFri <= month);
    }

    public static void task8() {

        int nowYear = 2023;
        int beginYear = nowYear - 200;
        int endYear = nowYear + 100;
        int year = 0;

        do {
            if (year >= beginYear && year <= nowYear) {
                System.out.println(year);
            }
            if (year >= nowYear) {
                System.out.println(year);
            }
            year += 79;
        }
        while (year < endYear);
    }
}