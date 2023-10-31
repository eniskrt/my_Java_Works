package Day10_methodOlusturma_methodOverLoading;

public class C09_methodOverLoading {
    public static void main(String[] args) {
        /*
        Bir class'ta aynı isim ve eşit sayıda parametre ile birden fazla
        method oluşturulabilir mi?

        parametrelerin data türleri aynı olmazsa
        birden fazla aynı isimde method oluşturulabilir.

        Java'da method ismi ve parametrelerin data türleri birlikte kullanılarak
        method sinature oluşur.

        Method signature farklı olmak üzere bir class'ta istediğiniz kadar
        aynı isimde class oluşturabilirisiniz.

        Buna OVERLOADİNG denir.
         */
        toplama(5,6);
        toplama(5.6,8);
        toplama(5,5.3);

    }
    //verilen iki int sayıyı toplayıp yazdıran bit method oluşturun.

    public static void toplama (int sayi1, int sayi2){ // toplama int int

        System.out.println("İki in sayının toplamı : "+(sayi1+sayi2));
    }

    //verilen iki int sayıyı toplayıp yazdıran bit method oluşturun.

    public static void toplama (double a, int b){ //toplama double int

        System.out.println("double ve int iki sayının toplamı : "+(a+b));
    }

    public static void toplama (int a, double b){ //toplama int double

        System.out.println("int ve int double sayının toplamı : "+(a+b));
    }

}
