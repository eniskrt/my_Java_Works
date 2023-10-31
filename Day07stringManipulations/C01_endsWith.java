package Day07stringManipulations;

import java.util.Scanner;

public class C01_endsWith {
    public static void main(String[] args) {

        //kullanicidan bir mail alin
        //- mail @ icermiyorsa "gecersiz mail"
        //- mail @gmail.com icermiyorsa, "mail gmail olmali"
        //- mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi giriniz.");
        String mail = scanner.nextLine();

        if (!mail.contains("@")) {
            System.out.println("Geçersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("Mail gmail olmalı");
        } else if (!mail.endsWith("@gmail.com")){
            System.out.println("Mail'de yazım hatası var.");
        }

    }
}
