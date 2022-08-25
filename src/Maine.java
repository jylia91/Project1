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



    }
}
