package Day08_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str = "Arama sonucunda 1434 kelimeye ulaşıldı.";

        //arma sonuçlarının 100'den fazla olduğunu test edin
        //100'den fazla ise "Tast Passed",
        //100'den fazla değilse "Test Failed" yazdırın.

        str = str.replaceAll("\\D","");

        int sonucSayisi=Integer.parseInt(str);
        //parseInt() içinde sadece digit bulunan String'i
        //Integer'a dönüştürür.

        if (sonucSayisi>100){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }


    }
}
