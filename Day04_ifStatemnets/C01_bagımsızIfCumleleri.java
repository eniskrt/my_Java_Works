package Day04_ifStatemnets;

public class C01_bagımsızIfCumleleri {
    public static void main(String[] args) {

        /*
        Bağımsız if cümlelelri kodun geriye kalanıyla ilgilenmez
        sadece kendi şartına odaklanır.

        Birden fazla bağımsız if cümlesi varsa
        bütün if body'lerini çalıştıran durumlar olabileceği gibi
        hiçbir if body'sinin çalışmayacağı durumlar da olabilir.
         */

        int a= 23;
        int b= 85;

        //a b'den büyük mü
        if ((a>b)){
            System.out.println("a b'den büyük");
        }

        //a çift sayı mi
        if (a%2==0){
            System.out.println("a çift sayıdır.");
        }


        //b 5 ile bölünebiliyor mu
        if (b%5==0) {
            System.out.println("b 5 ile tam bölünür.");
        }


            // a üç basamaklı sayı mı
        if (a>=100 && a<=999) {
                System.out.println("a sayısı üç basamklı");
            }

                //a ile b'nin toplamı 100'den büyük mü

        boolean sart = a + b > 100;
                System.out.println("sart");

                if (sart){
                    System.out.println("İki sayının toplamı 100den büyüktür.");
                }


                if (true){
                    System.out.println("Bu if body'si her zaman çalışır.");
                }


    }

}
