package Day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C02_faktoriyelyazdırma {
    public static void main(String[] args) {

        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. 8!?8*7*6*5*4*3*2*1= şeklinde yadır

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük pozitif bir tamsayı giriniz.");
        int sayi = scanner.nextInt();

        long faktoriyelSonucu =1;

        System.out.print(sayi + "! = ");

        for (int i = sayi; i >=1 ; i--) {
            faktoriyelSonucu*=i;
            if (i==1){
                System.out.print(i +" = " + faktoriyelSonucu);
            } else {
                System.out.print(i +" * ");
            }
        }

    }
}
