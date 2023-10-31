package Day11_whileLoop_doWhileLoop;

public class C08_doWhileLoop {
    public static void main(String[] args) {
        /*
        While Loop'u kullanıcıdan değer alınan ve
        tekrar sayısı belli olmaya durumlarda tercih ediyouruz.

        While Loop'un iki tane negatif yönü vardır.
        1--Loop öncesinde başlangıç değerini bizim atamamız gerekir.
           kullanıcıdan değeri loop içinde alırız.
           eğer ilk değer atamasında dikkat edilmezse hatalı bir değer atanabilir.
           ve burumda loop çalışmayabilir.

        2-- Kontrol işlemi başta yapılıp body sonradan çalıştığı için
        kontrol işlemi hep bi fazla yapılır.

         */

        int sayi =5;

        //Verilen sayi ile 3(hariç) arasındaki sayıları yazdırın.

        while (sayi>3) {
            System.out.println(sayi + " ");
            sayi--;
        }

        //Java özellikle kullanıcıdan değer alırken
        //ilk değeri yanlış atamamamız için
        //bir alternatif olarak da do-while loop'u oluşturmuştur.
        //do-while loop'ta önce işlem yapılır, sonra kontrol edilir.

        sayi =5;

        do {
            System.out.println(sayi + " ");
            sayi--;
        }while (sayi>3);



    }
}
