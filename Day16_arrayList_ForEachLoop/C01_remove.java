package Day16_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_remove {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("Ömer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Başak");

        List<String> silinecekler2 = new ArrayList<>();
        silinecekler2.add("Deniz");
        silinecekler2.add("Gülnur");

        System.out.println(isimler.remove(2));// Esra
        System.out.println(isimler); // [Deniz, Ömer, Hamza, Başak]

        System.out.println(isimler.remove("Hamza")); // true
        System.out.println(isimler); // [Deniz, Ömer, Başak]

        System.out.println(isimler.removeAll(silinecekler2)); // true
        System.out.println(isimler); // [Ömer, Başak]

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);

        System.out.println(sayilar); // [3, 2, 8]

        //Eğer liste sayılardan oluşuyorsa
        // remove(2) yazdığımızda 2'nin element mi yoksa index mi olacağını netleştirmek gerekeir.
        //Java bu durumu netleştirmek için
        //sayılardan oluşan List'lerde yazılan  sayıyı index olara kabul eder

        System.out.println(sayilar.remove(2)); // 8
        System.out.println(sayilar); // [3, 2]

        //illa da obje olan 2'yi silmek istiyorsak ve index'ini bilmiyorsak
        //önce silmek istediğimiz element'i bir obje (non-primitive) olarak tanımlamalıyız.

        Integer silinecekSayi = 2;
        System.out.println(sayilar.remove(silinecekSayi)); // true
        System.out.println(sayilar); // [3]

        sayilar.clear(); // []

    }
}
