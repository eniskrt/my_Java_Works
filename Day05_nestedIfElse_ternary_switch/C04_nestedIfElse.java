package Day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C04_nestedIfElse {
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
        char kartiVarMi =scanner.next().toUpperCase().charAt(0);

        if (urunadedi <= 0) {
            System.out.println("Ürün adedi bilgisi yanlış");
        } else if (urunadedi>=10) {
            if (kartiVarMi =='E'){
                System.out.println("%20 indirimli toplam fiyat : "+ urunadedi*urunFiyati*80/100);
            } else if (kartiVarMi =='H') {
                System.out.println("%15 indirimli toplam fiyat : "+ urunadedi*urunFiyati*85/100);
            }else {
                System.out.println("kart bilgisi yanlıştır.");
            }
        }else {
            if (kartiVarMi =='E'){
                System.out.println("%15 indirimli toplam fiyat : "+ urunadedi*urunFiyati*80/100);
            } else if (kartiVarMi =='H') {
                System.out.println("%10 indirimli toplam fiyat : "+ urunadedi*urunFiyati*85/100);
            }else {
                System.out.println("kart bilgisi yanlıştır."); }
        }
    }

}
