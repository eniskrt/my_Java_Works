package Day13_arrays;

import java.util.Arrays;

public class C05_enUzunKelime {
    public static void main(String[] args) {

        //Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.

        String [] isimler = {"Zehra", "Hüseyin", "Mehmet", "Esra", "Ercan", "Ömer"};
        enUzunEnKisaYazdir(isimler);

    }
    public static void enUzunEnKisaYazdir (String[] arr){

        String enKisaIsim = arr[0];
        String enUzunIsim = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length()>enUzunIsim.length()){
                enUzunIsim =arr[i];
            }
            if (arr[i].length()<enKisaIsim.length()){
                enKisaIsim = arr[i];
            }
        }

        System.out.println("En uzun isim : " + enUzunIsim);
        System.out.println("En kısa isim : " + enKisaIsim);



    }

}
