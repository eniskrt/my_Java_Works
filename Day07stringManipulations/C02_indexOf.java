package Day07stringManipulations;

public class C02_indexOf {
    public static void main(String[] args) {

        String str = "Java candır, Selenium heyecan.";

        //str Selenium içeriyor mu?

        System.out.println(str.contains("Selenium")); //true

        //str Selenium ile mi bitiyor ?

        System.out.println(str.endsWith("Selenium")); // false

        //str Selenium ile mi başlıyor?

        System.out.println(str.startsWith("Selenium")); // false

        //Peki bu Selenium nerede?

        System.out.println(str.indexOf("Selenium")); // 13

        //olmaya bir metin aratılırsa

        System.out.println(str.indexOf("x")); // -1
        System.out.println(str.indexOf('q')); // -1

        //Contains() metodu kullanmadan str'ın java içerip içermediğini yazdırın.

        if (str.indexOf("java")==-1){
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        //str'daki ilk a harfinin index'ini yazdırın.

        System.out.println(str.indexOf("a"));

        //str'daki ikinci 'a' harfinin indeksini yazdırın.

        System.out.println(str.indexOf('a', 1));

        //str'daki üçüncü 'a' harfinin indeksini yazdırın

        System.out.println(str.indexOf('a',4));

        //str'da dördüncü  'a' varsa indeksini yoksa
        // "str sadece 3 tane 'a'içeriyor.

        if (str.indexOf('a',7)==-1){
            System.out.println("Str sadece 3 tane 'a' içeriyor.");
        } else {
            System.out.println("4. a'nın indeksi : "+str.indexOf('a',7));
        } //4. a'nın indeksi : 27

        ////str'da 5.  'a' varsa indeksini yoksa
        //        "str sadece 4 tane 'a'içeriyor.

        if (str.indexOf('a',28)==-1){
            System.out.println("str sadece 4 tane 'a'içeriyor.");
        } else {
            System.out.println("5. a'nın indeksi : "+str.indexOf('a',7));
        }





    }
}
