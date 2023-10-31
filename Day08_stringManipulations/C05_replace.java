package Day08_stringManipulations;

import java.util.Scanner;

public class C05_replace {
    public static void main(String[] args) {
        //Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String cumle = scanner.nextLine();

        String buyukCumle = cumle.toUpperCase();

        if (buyukCumle.contains("EV") && buyukCumle.contains("İŞ")){
            System.out.println("Hem ev lazım hem iş");
        } else if (buyukCumle.contains("EV")) {
            System.out.println("Home home sweet home");
        } else if (buyukCumle.contains("İŞ")) {
            System.out.println("Çalışmak güzeldir.");
        } else {
            System.out.println("Çok çalışman lazım.");
        }
    }
}
