import com.sun.net.httpserver.Authenticator;

public class Maine {
    public static void main(String[] args) {

     byte century = 5;
     System.out.println(century);

     short years = 500;
     System.out.println(years);

     int days = 50000;
     System.out.println(days);

     long minutes = 50000L;
     System.out.println(minutes);

     float sugar = 3;
     float onePortion = sugar / 4;
     System.out.println("Одна порция сахара весит " + onePortion);

     double boxerEdik = 78.2;
     double boxerGarik = 82.7;
     double weightTotal = boxerEdik + boxerGarik;
     System.out.println("Общий вес боксеров " + weightTotal + " кг" );

     double weightDifference = boxerGarik - boxerEdik;
     System.out.println("Разница в весе боксеров " + weightDifference + " кг");

     var bananas = 5;
     var milk = 2;
     var iceCream = 2;
     var egg = 4;
     double productWeight = bananas * 80 + milk * 200 + iceCream * 100 + egg * 70;
     System.out.println("Вес завтрака " + productWeight + "гр ");
     System.out.println("Вес завтрака в кило " + productWeight / 1000);

     var necessaryWeightLoss = 7000;
     var weightLossOne = 250;
     var weightLossTwo = 500;
     var daysOne = necessaryWeightLoss / weightLossOne;
     var daysTwo = necessaryWeightLoss / weightLossTwo;
     var averageNumbersOfDays = (daysOne + daysTwo) / 2;
     System.out.println("Необходимо дней при первом подходе " + daysOne + "дней");
     System.out.println("Необходимо дней при втором подходе " + daysTwo + "дней");
     System.out.println("Среднее количество дней " + averageNumbersOfDays + "день");

     var Masha = 67760;
     var Denis = 83690;
     var Kristina = 76230;
     var MashaBecome = Masha * 0.10;
     var DenisBecome = Denis * 0.10;
     var KristinaBecome = Kristina * 0.10;
     System.out.println("Маша получает больше на " + MashaBecome + "р.");
     System.out.println("Денис получает больше на " + DenisBecome + "р.");
     System.out.println("Кристина получает больше на " + KristinaBecome + "р.");
     var MashaNew = Masha + MashaBecome;
     var DenisNew = Denis + DenisBecome;
     var KristinaNew = Kristina + KristinaBecome;
     System.out.println("Маша теперь получает " + MashaNew + "р.");
     System.out.println("Денис теперь получает " + DenisNew + "р.");
     System.out.println("Кристина теперь получает " + KristinaNew + "р.");
     var MashaIncomeYear = Masha * 12;
     var DenisIncomeYear = Denis * 12;
     var KristinaIncomeYear = Kristina * 12;
     var MashaYearNew = MashaNew * 12;
     var DenisYearNew = DenisNew * 12;
     var KristinaYearNew = KristinaNew * 12;
     System.out.println("Годовой доход Маши был " + MashaIncomeYear +"р.");
     System.out.println("Годовой доход Дениса был " + DenisIncomeYear + "р.");
     System.out.println("Годовой доход Кристины был " + KristinaIncomeYear + "р.");
     System.out.println("Годовой доход Маши стал " + MashaYearNew + "р.");
     System.out.println("Годовой доход Дениса стал " + DenisYearNew + "р.");
     System.out.println("Годовой доход Кристины стал " + KristinaYearNew + "р.");
     var MashaDifferenceYear = MashaIncomeYear - MashaYearNew;
     var DenisDifferenceYear = DenisIncomeYear - DenisYearNew;
     var KristinaDifferenceYear = KristinaIncomeYear - KristinaYearNew;
     System.out.println("Годовой доход Маши вырос на " + MashaDifferenceYear + "р.");
     System.out.println("Годовой доход Дениса вырос на " + DenisDifferenceYear + "р.");
     System.out.println("Годовой доход Кристины вырос на " +KristinaDifferenceYear + "р.");

     var a = 12;
     var b = 27;
     var c = 44;
     var d = 15;
     var e = 9;
     System.out.println("Result " + a * (b + (c - d * e)));


     
    }
}
