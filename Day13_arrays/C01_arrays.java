package Day13_arrays;

public class C01_arrays {
    public static void main(String[] args) {

        int [] arr= new int[5];
        /*
        Bir Array oluşturulurken iki şey mutlaka deklare edilmelidir.
        1 - İçine konulacak elementlerin data türü
        2 - Array'in içine konulacak element sayısı (length)

        Eğer array'i yukarıdaki gibi oluşturursak
        biz hiçbir değer ataması yapmadığımız için
        Java default olarak belirlediği değerleri atayacaktır

        Array oluşturulduktan sonra,
        olmayan index kullanılarak değer atanması/eklenmesi mümkün değildir.

        Yani 4 elementli bir array'e 5. elementi ATAYAMAZSINIZ!
        Aynı şekilde 4 elemanı olan bir array'den
        bir elemeanı silip eleman sayısını 3'e DÜŞÜREMEZSİNİZ!

         */

        int [] arr2 ={4,1,7,5}; //length=4

        System.out.println(arr2[1]); // 1
        System.out.println(arr2[3]); // 5
        System.out.println(arr2[arr2.length-1]); // son elementi yazdırmak istersek

        //ilk array'da değer ataması yapmadık
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]); // son elementi yazdırın 0

        //olmayan indekstki bir değere ulaşmak istersek

        //System.out.println(arr2[5]);
        //.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4

        // olmayan bir indekse atama yapabilir miyiz?


        //arr2[4]=8; ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

        arr = new int[10];

        arr = new int[20];




    }
}
