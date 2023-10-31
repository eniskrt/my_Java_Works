package Day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C03_nestedifElse {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa
        //                      10 urunden fazla alirsa %20,
        //                      10üründen az alırsa %15indirim yapın.
        //  Musteri karti yoksa
        //                      10 urunden fazla alirsa %15,
        //                      10 üründen az %10 indirim yapın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürün adedini giriniz.");
        int urunadedi = scanner.nextInt();

        System.out.println("Lütfen ürün fiyatını giriniz.");
        double urunFiyati = scanner.nextDouble();

        System.out.println("Müşteri kartınız var mı?\n E: Evet  H:Hayır");
        char kartıVarMi =scanner.next().toUpperCase().charAt(0);

        //kartın olup olmadığı ana değişken olsun.

        if (kartıVarMi =='E'){
            if (urunadedi>=10){
                System.out.println("%20 indirimli toplam fiyat : "+ urunadedi*urunFiyati*80/100);
            }else {
                System.out.println("%15 indirimli toplam fiyat : "+urunadedi*urunFiyati*85/100);
            }
        } else if (kartıVarMi == 'H') {
            if (urunadedi>=10){
                System.out.println("%15 indirimli toplam fiyat : "+urunadedi*urunFiyati*85/100);
            } else {
                System.out.println("%10 indirimli toplam fiyat : "+ urunadedi*urunFiyati*90/100);
            }
        } else {
            System.out.println("Kart bilgisini doğru giriniz.");
        }
    }
}
