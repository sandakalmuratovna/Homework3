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

    public static void task1(){
        System.out.println("Task 1");
        int integerType = 23444;
        byte byteType = 122;
        short shortType = 3555;
        long longType = 344455L;
        float floatType = 3.55f;
        double doubleType = 6.55;
        System.out.println("Значение переменное integerType с типом int ровно "+integerType);
        System.out.println("Значение переменное byteType с типом byte ровно "+byteType);
        System.out.println("Значение переменное shortType с типом short ровно "+shortType);
        System.out.println("Значение переменное longType с типом long ровно "+longType);
        System.out.println("Значение переменное floatType с типом float ровно "+floatType);
        System.out.println("Значение переменное doubleType с типом double ровно "+doubleType);

    }

    public static void task2() {
        System.out.println("Task 2");
        float numberFirst = 27.12f;
        long numberSecond = 987678965549L;
        double numberThird = 2.786;
        short numberFourth = 569;
        int numberFifth = 27897;
        byte numberSixth = 67;

    }

    public static void task3() {
        System.out.println("Task 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short allPaper = 480;
        int allTogether = lp + as + ea;
        int result = allPaper/allTogether;
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги.");

    }

    public static void task4() {
        System.out.println("Task 4");
        byte oneMinute = 16/2;
        int twentyMinute = oneMinute*20;
        System.out.println("За 20 минут машина произвела "+twentyMinute+" штук бутылок");
        int oneDay = oneMinute*60*24;
        System.out.println("В сутки машина произвела "+oneDay+" штук бутылок");
        int threeDays = oneDay*2;
        System.out.println("За 3 дня машина произвела "+threeDays+" штук бутылок");
        long month = oneDay*30L;
        System.out.println("За 1 месяц машина произвела "+month+" штук бутылок");

    }

    public static void task5() {
        System.out.println("Task 5");
        byte sum = 120;
        byte oneWhite = 2;
        byte oneBrown = 4;
        int countOfClass = sum/(oneBrown+oneWhite);
        int white = oneWhite*countOfClass;
        int brown = oneBrown*countOfClass;
        System.out.println("В школе, где "+countOfClass+" классов, нужно "+white+" банок белой краски и "+brown+" банок коричневой краски");

    }

    public static void task6() {
        System.out.println("Task 6");
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        float breakfast = banana*5 + milk*2 + iceCream*2 + egg*4;
        System.out.println(breakfast+" gram");
        float kg = breakfast/1000;
        System.out.println(kg+" kg");

    }

    public static void task7() {
        System.out.println("Task 7");
        int needResult = 7*1000;
        int firstCond = 250;
        int secondCond = 500;
        int firstResult = needResult/firstCond;
        int secondResult = needResult/secondCond;
        System.out.println("If you lose 250 grams a day, it takes "+firstResult+" days to lose 7 kg");
        System.out.println("If you lose 500 grams a day, it takes "+secondResult+" days to lose 7 kg");
        System.out.println("If you lose 250-500 grams a day, it takes about "+(firstResult+secondResult)/2+" days to lose 7 kg");


    }

    public static void task8() {
        System.out.println("Task 8");
        int salaryOfMashaNow = 67760;
        int salaryOfDenisNow = 83690;
        int salaryOfKristinaNow = 76230;
        int salaryOfMashaAfter = salaryOfMashaNow + (salaryOfMashaNow*10)/100;
        int salaryOfDenisAfter = salaryOfDenisNow + (salaryOfDenisNow*10)/100;
        int salaryOfKristinaAfter = salaryOfKristinaNow + (salaryOfKristinaNow*10)/100;

        int differenceOfSalary = (salaryOfMashaAfter - salaryOfMashaNow)*12;
        System.out.println("Маша теперь получает "+salaryOfMashaAfter+" рублей. Годовой доход вырос на "+differenceOfSalary+" рублей.");

        differenceOfSalary = (salaryOfDenisAfter - salaryOfDenisNow)*12;
        System.out.println("Денис теперь получает "+salaryOfDenisAfter+" рублей. Годовой доход вырос на "+differenceOfSalary+" рублей.");

        differenceOfSalary = (salaryOfKristinaAfter - salaryOfKristinaNow)*12;
        System.out.println("Кристина теперь получает "+salaryOfKristinaAfter+" рублей. Годовой доход вырос на "+differenceOfSalary+" рублей.");


    }
}