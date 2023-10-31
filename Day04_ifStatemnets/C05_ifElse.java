package Day04_ifStatemnets;

import java.util.Scanner;

public class C05_ifElse {
    public static void main(String[] args) {

        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char krk =scanner.next().charAt(0);

        if (krk >= 'A' && krk <= 'Z'){
            System.out.println("Girilen harf büyük harf.");
        } else {
            System.out.println("Girilen karakter büyük harf değil.");
        }

        //

    }
}
