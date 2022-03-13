package com.skypro;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        int Rat = 5;
        long cat = 2L;
        short Hamster = 4;
        byte dog = 2;
        double riceWeight = 3.7;
        float sugarWeight = 1.7f;
        boolean dogIsKid = dog < 7;
        char bar = 36;
        System.out.println(dogIsKid);

        // Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("общий вес " + weightOfAllBoxers);
        System.out.println("Разница в весе" + weightDifference);

        // Задача 3
        int bananas = 5;
        int weightBanana = 80;
        int result = 5 * 80;
        int weightMilkAll = 200;
        int oneHundredMillilitersOfMilkGr = 105;
        int weightMilkGr = 105 * 2;
        int weightOneIceCream = 100;
        int weights = 2 * 100;
        int eggs = 4;
        int weightOneEgg = 70;
        int results = 4 * 70;
        int weightOfAllResults = result + weightMilkGr + weights + results;
        int grPerKg = 1000;
        float weightKg = weightOfAllResults / 1000F;
        System.out.println("Вес завтрака спортсмена" + weightKg + "Кг");

        // Задача 4
        int loseWeightKg = 7;
        int KgPerGr = 1000;
        int weightGr = loseWeightKg * 1000;

        int minWeightLossGr = 250;
        int maxWeightLossGr = 500;
        int loseWeightOne = weightGr / minWeightLossGr;
        int loseWeightOne2 = weightGr / maxWeightLossGr;
        System.out.println("Худеет, теряя 250 гр за" + loseWeightOne + "дней");
        System.out.println("Худеет, теряя 500 гр" + loseWeightOne2 + "Дней");

        int totalNumberOfDays = loseWeightOne + loseWeightOne2;
        int onAverageDays = totalNumberOfDays / 2;
        System.out.println("Похудеет всреднем за" + onAverageDays + " дней");

        // Задача 5
        int raisingPercent = 10;
        int Masha = 67760;
        int MashaRaisingZp = (Masha / 100) * raisingPercent;
        int MashaReceive = Masha + MashaRaisingZp;

        int oneYearMonths = 12;
        int MashaReceiveYear1 = Masha * oneYearMonths;
        int MashaReceiveYear2 = MashaReceive * oneYearMonths;
        int difference1 = MashaReceiveYear2 - MashaReceiveYear1;
        System.out.println("Маша теперь получает" + MashaReceive + "Годовой доход вырос на" + difference1);

        int Denis = 83690;
        int DenisRaisingZp = (Denis / 100) * raisingPercent;
        int DenisReceive = Denis + DenisRaisingZp;
        int DenisReceiveYear1 = Denis * oneYearMonths;
        int DenisReceiveYear2 = DenisReceive * oneYearMonths;
        int difference2 = DenisReceiveYear2 - DenisReceiveYear1;
        System.out.println("Денис теперь получает" + DenisReceive + "Годовой доход вырос на" + difference2);

        int Kristina = 76230;
        int KristinaRaisingZp = (Kristina / 100) * raisingPercent;
        int KristinaReceive = Kristina + KristinaRaisingZp;
        int KristinaReceiveYear1 = Kristina * oneYearMonths;
        int KristinaReceiveYear2 = KristinaReceive * oneYearMonths;
        int difference3 = KristinaReceiveYear2 - KristinaReceiveYear1;
        System.out.println("Кристина теперь получает" + KristinaReceive + "Годовой доход вырос на" + difference3);








    }
}
