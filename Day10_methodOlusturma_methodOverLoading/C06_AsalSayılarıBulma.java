package Day10_methodOlusturma_methodOverLoading;

public class C06_AsalSayılarıBulma {

    //bir önceki class da oluşturulan method'u kullanarak
    //3 basamaklı sayılardan asal olanları yazdırın

    public static void main(String[] args) {

        for (int i = 100; i <1000; i++) {
            if (C05_asalSayiMiDöndür.asalMiDondur(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println("=====================");

        //4 basamaklı kaç tane asal sayı var

        int sayac =0;
        for (int i =1000; i <10000 ; i++) {
            if (C05_asalSayiMiDöndür.asalMiDondur(i)){
                sayac++;
            }
        }
    }
}
