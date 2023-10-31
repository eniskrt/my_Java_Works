package Day16_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_kullaniciyaListeOlusturtma {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //          liste olarak dondurecek bir method olusturun.

        System.out.println(listeOlustur());

    }
    public static List<String> listeOlustur () {

        List<String> isimler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String girilenIsim;

        do {
            System.out.println("Listeye eklemek için bir içim yazınızz "+
                    "\nVeya işlemi bitirmek için Q'ya basınız.");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }
        } while (!girilenIsim.equalsIgnoreCase("q"));
        return isimler;
    }
}
