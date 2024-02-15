public class Main {
    public static void main(String[] args) {
        // Task1
        int a = 2024;
        byte b = 127;
        short c = 32767;
        long d = 123456789012345L;
        float g = 0.1786578f;
        double f = 0.1234567890123456;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной g с типом float равно " + g);
        System.out.println("Значение переменной f с типом double равно " + f);
        // Task2
        float ab = 27.12f;
        long ba = 987678965549L;
        float aB = 2.786f;
        short bA = 569;
        short da = -159;
        int bd = 27897;
        byte dB = 67;
        //Task3
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short lists = 480;
        int studentLists = lists/(lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + studentLists + " листов бумаги.");
        //Task 4
        byte bottles = 16; //за 2 минуты 16 бутылок
        int bottles20Min = 20/2 * bottles;
        System.out.println("За 20 минут машина произвела " + bottles20Min + " штук бутылок");
        int botteles1Day = (1440/2) * bottles; // 1440 минут в сутках
        System.out.println("За сутки машина произвела " + botteles1Day + " штук бутылок");
        int botteles3Days = ((1440 * 3)/2) * bottles;
        System.out.println("За 3 дня машина произвела " + botteles3Days + " штук бутылок");
        int bottelesPerMounth = ((1440*30)/2) * bottles;
        System.out.println("За месяц машина произвела " + bottelesPerMounth + " штук бутылок");
        //Task 5
        byte tins = 120;
        byte tinsPerClass = 2 + 4;
        int classesAtShcool = tins/ tinsPerClass;
        int tinsWhite = classesAtShcool * 2;
        int tinsBrown = classesAtShcool * 4;
        System.out.println("В школе, где " + classesAtShcool + " классов, нужно " +tinsWhite+ " банок белой краски и " + tinsBrown + " банок коричневой краски.");
        //Task 6
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int total = bananas + milk + iceCream + eggs;
        System.out.println(total + " грамм спортзавтрака.");
        System.out.println((float)total/1000 + " килограмм спортзавтрака.");
        //Task 7
        // в 7 килограмм 7000 грамм
        int easyDays = 7000/250;
        int hardDays = 7000/500;
        float average = (500+250)/2;
        float averageDays = 7000/average;
        System.out.println(easyDays + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(hardDays + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println(averageDays + " дней уйдет на похудение, если спортсмен будет терять каждый день " + average + " грамм.");
        //Task 8
        int salaryMashaPerYear = 67760 * 12;
        int salaryDenisPerYear = 83690 * 12;
        int salaryKristinaPerYear = 76230 * 12;
        int newSalaryMasha = 110 * 67760 / 100;
        int newSalaryDenis = 110 * 83690 / 100;
        int newSalaryKristina = 110 * 76230 / 100;
        int masha = newSalaryMasha * 12 - salaryMashaPerYear;
        int denis = newSalaryDenis * 12 - salaryDenisPerYear;
        int kristina = newSalaryKristina * 12 - salaryKristinaPerYear;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + masha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + denis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + kristina + " рублей");

    }
}