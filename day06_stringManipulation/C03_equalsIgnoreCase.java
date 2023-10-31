package day06_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        //Kulanıcıdan bir harf isteyin
        //Kullanıcı a yazarsa "Aile"
        //i yazarsa "İş" yazdırın
        //bu harflerin dışında  bir karakter girerse
        //"Bu harfi bilmiyorum" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenHarf = scanner.next().charAt(0);

        //kullanıcı küçük veya büyük harf girmiş olabilir.
        //String'leri büyük küçük  harf gözetmeksizin karşılaştırabiliriz.

        String harf = girilenHarf +"";

        if (harf.equalsIgnoreCase("a")){
            System.out.println("Aile");
        } else if (harf.equalsIgnoreCase("i")) {
            System.out.println("İş");
        } else {
            System.out.println("Bu harfi bilmiyorum.");
        }

        //equals.IgnoreCase küçük/büyük harf önemsemeksizin
        //metinlere bakar

        String str1 = "Java";
        String str2 = "java";
        String str3 = "JAva";
        String str4 = new String("JAVa");
        String str5 = "JA" + "vA";
        String str6 = "jA";
        String str7 = "vA";
        String str8 = str6 + str7;

        System.out.println(str1.equals(str2));  //Java ==> java  false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        System.out.println(str1.equals(str3));  //Java ==> JAva  false
        System.out.println(str1.equalsIgnoreCase(str3)); // true

        System.out.println(str1.equals(str4));  //Java ==> JAVa  false
        System.out.println(str1.equalsIgnoreCase(str4));  //true


    }
}
