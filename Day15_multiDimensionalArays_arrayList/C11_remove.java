package Day15_multiDimensionalArays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("Ömer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Başak");
        System.out.println(isimler); // [Deniz, Ömer, Esra, Hamza, Başak]

        //remove(silinecekObject) çalıştırınca,
        //silinecekObject varsa siler ve bize true döndürür
        //silinecekObject yoksa bize false döndürür.

        System.out.println(isimler.remove("Esra")); // true

        System.out.println(isimler); // [Deniz, Ömer, Hamza, Başak]

        System.out.println(isimler.remove("Ercan")); // false

        isimler.remove("Ömer");

        System.out.println(isimler); // [Deniz, Hamza, Başak]

        //remove(silinecekIndex) çalıştırınca,
        //silinecekObject varsa siler ve bize true döndürür
        //silinecekObject yoksa bize false döndürür.

        System.out.println(isimler.remove(1)); // Hamza

        System.out.println(isimler); // [Deniz, Başak]

        //isimler.remove(5); // IndexOutOfBoundsException

        isimler.add("İbrahim");
        isimler.add("Ercan");
        isimler.add("Azim");
        System.out.println(isimler); // [Deniz, Başak, İbrahim, Ercan, Azim]

        List<String> silinecekler = new ArrayList<>();

        silinecekler.add("Başak");
        silinecekler.add("Deniz");
        silinecekler.add("Azim");

        System.out.println(silinecekler); // [Başak, Deniz, Azim]

        System.out.println(isimler.removeAll(silinecekler)); // true

        System.out.println(isimler); // [İbrahim, Ercan]

        List<String> silinecekler2 = new ArrayList<>();

        silinecekler2.add("Ercan");
        silinecekler2.add("Gülnur");

        System.out.println(silinecekler2); // [Ercan, Gülnur]

        System.out.println(isimler.removeAll(silinecekler2)); // true

        System.out.println(isimler); // [İbrahim]

        System.out.println(isimler.removeAll(silinecekler)); // false
    }
}
