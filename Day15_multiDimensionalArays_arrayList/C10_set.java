package Day15_multiDimensionalArays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C10_set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("Ömer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Başak");
        System.out.println(isimler); // [Deniz, Ömer, Esra, Hamza, Başak]

        System.out.println(isimler.get(1)); // Ömer
        // System.out.println(isimler.get(8)); // IndexOutOfBoundsExceptio

        isimler.add(3,"Azim");
        System.out.println(isimler); // [Deniz, Ömer, Esra, Azim, Hamza, Başak]

        //set()'u bir elementi update (yeni değer atamak) için kullanılır.

        isimler.set(3,"Gülnur");
        System.out.println(isimler); // [Deniz, Ömer, Esra, Gülnur, Hamza, Başak]

        //Method'ların yaptığı iş ile bize döndürdüğü sonuç FARKLI olabilir.
        System.out.println(isimler.set(2, "Yusuf")); // Esra

        System.out.println(isimler); // [Deniz, Ömer, Yusuf, Gülnur, Hamza, Başak]

        isimler.set(0,"Ayça");
        System.out.println(isimler); // [Ayça, Ömer, Yusuf, Gülnur, Hamza, Başak]



    }
}
