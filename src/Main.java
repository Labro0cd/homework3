public class Main {
    public static void main(String[] args) {

        int a = 120;
        System.out.println("Значение  переменной a с типом int равно "+a);
        byte b = 12;
        System.out.println("Значение  переменной b с типом byte равно "+b);
        short c = 200;
        System.out.println("Значение  переменной c с типом short равно "+c);
        long d = 1000L;
        System.out.println("Значение  переменной d с типом long равно "+d);
        float e = 121.123f;
        System.out.println("Значение  переменной e с типом float равно "+e);
        double f = 2000.12345;
        System.out.println("Значение  переменной f с типом double равно "+f);
        System.out.println();

        float case1 = 27.12f;
        long case2 = 987678965549L;
        float case3 = 2.786f;
        short case4 = 569;
        short case5 = -159;
        int case6 = 27897;
        byte case7 = 67;

        int teacher1 = 23;
        int teacher2 = 27;
        int teacher3 = 30;
        int totalList = 450;
        int totalStudents = teacher1 + teacher2 + teacher3;
        int listInStudent = totalList/totalStudents;
        System.out.println("На каждого ученика рассчитано "+listInStudent+" листов бумаги.");
        System.out.println();

        int machinePerformanceIn2Minute = 16;
        int minute20 = (20/2)*machinePerformanceIn2Minute;
        System.out.println("За 20 минут машина произвела "+minute20+" штук бытылок");
        int oneDay = ((24*60)/2)*machinePerformanceIn2Minute;
        System.out.println("За один день машина произвела "+oneDay+" штук бытылок");
        int threeDay = oneDay*3;
        System.out.println("За 3 дня машина произвела "+threeDay+" штук бытылок");
        int oneMonth = threeDay*10;
        System.out.println("За 1 месяц машина произвела "+oneMonth+" штук бутылок");
        System.out.println();

        int totalPaint = 120;
        int paintInOneClassroom = 6;
        int totalClassroom = totalPaint/paintInOneClassroom;
        int whitePaintInOneClassroom = 2;
        int brownPaintInOneClassroom = 4;
        int totalWhitePaintInTotalClassroom = whitePaintInOneClassroom*totalClassroom;
        int totalBrownPaintInTotalClassroom = brownPaintInOneClassroom*totalClassroom;
        System.out.println("В школе, где "+totalClassroom+" классов, нужно "+totalWhitePaintInTotalClassroom+" банок белой краски и "+totalBrownPaintInTotalClassroom+" банок коричневой краски.");
        System.out.println();

        int banana = 5*80;
        int milk = 2*105;
        int iceCream = 2*100;
        int egg = 4*70;
        int breakfastInGram = banana+milk+iceCream+egg;
        float breakfastInKilogram = breakfastInGram/1000f;
        System.out.println("Вес спортзавтрака равен "+breakfastInGram+" грамм("+breakfastInKilogram+" килограм).");
        System.out.println();

        int totalWeightInGram = 7000;
        int minimumLossWeight = 250;
        int maximumLossWeight = 500;
        int minimumDayLossWeight = totalWeightInGram/maximumLossWeight;
        int maximumDayLossWeight = totalWeightInGram/minimumLossWeight;
        int onAverageDayLossWeight = (minimumDayLossWeight+maximumDayLossWeight)/2;
        System.out.println("Спортсмену потрубеться минимум "+minimumDayLossWeight+" дней чтобы сброситьвес, максимум "+maximumDayLossWeight+" дней. В среднем "+onAverageDayLossWeight+" дней.");
        System.out.println();

        int incomeMasha = 67760;
        int incomeDenis = 83690;
        int incomeKristina = 76230;
        int oneYearIncomeMasha = incomeMasha*12;
        int oneYearIncomeDenis = incomeDenis*12;
        int oneYearIncomeKristina = incomeKristina*12;
        float raisingIncomeMasha = incomeMasha*1.10f;
        float raisingIncomeDenis = incomeDenis*1.10f;
        float raisingIncomeKristina = incomeKristina*1.10f;
        float raisingOneYearIncomeMasha = raisingIncomeMasha*12;
        float raisingOneYearIncomeDenis = raisingIncomeDenis*12;
        float raisingOneYearIncomeKristina =raisingIncomeKristina*12;
        float differenceOneYearIncomeMasha = raisingOneYearIncomeMasha-oneYearIncomeMasha;
        float differenceOneYearIncomeDenis = raisingOneYearIncomeDenis-oneYearIncomeDenis;
        float differenceOneYearIncomeKristina =raisingOneYearIncomeKristina-oneYearIncomeKristina;

        System.out.println("Маша теперь получает "+raisingIncomeMasha+" рублей. Годовой вырос на "+differenceOneYearIncomeMasha+" рублей.");
        System.out.println("Денис теперь получает "+raisingIncomeDenis+" рублей. Годовой вырос на "+differenceOneYearIncomeDenis+" рублей.");
        System.out.println("Кристина теперь получает "+raisingIncomeKristina+" рубелй. Годовой вырос на "+differenceOneYearIncomeKristina+" рублей.");

    }
}