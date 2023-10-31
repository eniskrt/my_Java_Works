package Day16_arrayList_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C09_arrayiListeCevirme {
    public static void main(String[] args) {
        Integer [] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        /*
        Uzun bir Array'i listê çevirmenin en kullanışlı yolu
        bir for-loop ile elementleri taşımatır.

        Arrays class'ında asList() method'u da Array'i list' çevirir.
        ANCAK 2 büyük problemi vardır.

        1 - - Array'den çevirdiğimiz liste ekleme çıkarma gibi
              size'ı değiştiren işlemler yapamazsınız.
        2 - - Bu method array ve çevirdiği list'i eşleştirir
              array'de yaptığınız değişiklik list'e
              list'te yaptığınız değişiklik array'e işlenir.
         */

        List<Integer> sayilar = Arrays.asList(arr);

        System.out.println("Sayılar Listesi : " + sayilar);
        //Sayılar Listesi : [3, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]

        //sayilar.add(10); //UnsupportedOperationException

        //sayilar.remove(3); // UnsupportedOperationException

        System.out.println("Array : " + Arrays.toString(arr));
        //Array : [3, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]

        //Array'in 0. index'indeki sayıyı 33 yap
        arr[0] = 33;

        System.out.println("Array : " + Arrays.toString(arr));
        //Array : [33, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]

        System.out.println("Array'i değiştirdikten sonra Sayılar listesi : " + sayilar);
        //Array'i değiştirdikten sonra Sayılar listesi : [33, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]

    }
}
