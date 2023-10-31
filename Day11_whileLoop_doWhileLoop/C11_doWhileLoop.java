package Day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C11_doWhileLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        //        bulunuz, tamkare ise değeri değilseuyarı yazdırın.
        //        Ornek : input : 16, output: 4

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen tam kare olmasını kontrol etmek için bir tamsayı giriniz.");
        int girilenSayi = scanner.nextInt();
        int karaKok = 1;

        do {
            if (karaKok*karaKok==girilenSayi){
                System.out.println("Girilen sayı bir tam kare.\n Karekök değeri :"+ karaKok);
            }
            karaKok++;
        }while (karaKok*karaKok<=girilenSayi);
        
    }
}
