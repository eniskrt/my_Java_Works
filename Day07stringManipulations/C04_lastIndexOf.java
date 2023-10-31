package Day07stringManipulations;

public class C04_lastIndexOf {
    public static void main(String[] args) {

        String str = "Java candır, Selenium heyecan";

        //Str a ile mi başlar?

        System.out.println(str.startsWith("a")); // false

        //a nın ilk kullanıldığı index'i yazdırın.

        System.out.println(str.indexOf("a")); //1

        //str a ile mi biter

        System.out.println(str.endsWith("a")); // false

        //a'nın son kullınımının index'ini yazdırın

        System.out.println(str.lastIndexOf("a")); //27

        // can kelimesinin ilk index'ini bulun

        System.out.println(str.indexOf("can")); // 5

        //can  kelimesinin son kullanımının index'ini yazdırın

        System.out.println(str.lastIndexOf("can"));

        //selenium kelimesinin ilk kullanım ve son kullanım indeksini yazdırın.

        System.out.println(str.indexOf("Selenium"));
        System.out.println(str.lastIndexOf("Selenium"));
    }
}
