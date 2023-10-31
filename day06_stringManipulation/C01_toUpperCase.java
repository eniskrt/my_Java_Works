package day06_stringManipulation;

import java.util.Locale;

public class C01_toUpperCase {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase());

        //Strin metodları ile yapılan değişiklikler
        //String'i kalıcı olarak değiştirmez.

        System.out.println(str);

        //değişikliklerin kalıcı olmasını isterseniz
        //String'e atam yapmalısınız

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println(str.toLowerCase()); // java candır

        //büyük ı yerine küçük harf seştiğimizde i geliyor.
        //I yerine Türkçe karakter gelmesini isterseniz

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));

    }
}
