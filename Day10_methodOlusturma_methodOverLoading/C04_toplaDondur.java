package Day10_methodOlusturma_methodOverLoading;

public class C04_toplaDondur {

    public static void main(String[] args) {

        //Verilen 3 sayının toplamını döndüren bir method oluşturun.

        toplamDondur(5,6,7); //bir sonuç döndüren methodlar call edildiğinde
                            //sonucu call edilen yere getirir
                            //bundan sonra yapılacak şey kodu yazan kişiye bağlıdır.
                            //1-ya return edilen sonucu direk yazdırabilir
                            //2- ya da daha sonra kullanılmak üzere bir  variable'a atayabilir.

        System.out.println(toplamDondur(2, 3, 4));

        double toplam = toplamDondur(6,9,1);//16 döndürecek ve değer toplam variable'ına kaydedilecek


    }

    public static double toplamDondur (double sayi1, double sayi2, double sayi3) {

        double toplam = sayi1 + sayi2 + sayi3;
        return toplam;
    }
}
