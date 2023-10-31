package Day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C05_stringTerseCevirme {
    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen terse çevirmek için bir String ifade giriniz.");
        String girilenMetin = scanner.nextLine();

        String tersMetin ="";

        for (int i =girilenMetin.length()-1 ; i>=0 ; i--) {

            tersMetin+=girilenMetin.charAt(i);
        }
        System.out.println("Girilen metnin ters hali : "+ tersMetin);

        // tersi ile düzden yazılışı aynı olan metinlere palindrom denir.
        //girilen metnin palindrome olup olmadığını yazdıralım.

        if (girilenMetin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin palindrome");
        } else {
            System.out.println("Girilen metin palindrome değil");
        }

    }
}
