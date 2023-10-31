package Day07stringManipulations;

import java.util.Scanner;

public class C05_lastIndexOf {
    public static void main(String[] args) {
        ////Verilen bir cümlede
        //        aranan bir metin için aşağıdaki cümlellerden
        //        uygun olanını yazdıracak bir program yazınız.
        //        -Cümle aranan metni içermiyor.
        //        Cümlede aranan metin sadece 1 kere kllnılmış
        //        Cümlede aranan metin sadece 2 kere kllnılmış

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String cumle = scanner.nextLine();

        System.out.println("Lütfen aranan metni giriniz.");
        String metin = scanner.nextLine();

        int ilkIndex = cumle.indexOf(metin); // -1 veya index
        int sonIndex =cumle.lastIndexOf(metin); // -1 veya index
        
        if (ilkIndex==-1){
            System.out.println("Cümle aranan metni içermiyor.");
        } else if (ilkIndex==sonIndex) {
            System.out.println("Cümlede aranan metin sadece 1 kere var");
        } else {
            System.out.println("Cümlede aranan metin 1'den fazla kullanılmıştır.");
        }

    }
}
