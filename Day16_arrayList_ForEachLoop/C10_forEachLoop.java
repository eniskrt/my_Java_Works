package Day16_arrayList_ForEachLoop;

public class C10_forEachLoop {
    public static void main(String[] args) {
        /*
        For-each loop
        birden fazla eleman barındıran
        array ve list gibi yapılarla çalışmak üzere hazırlanmıştır.

        1'den 100'e kadar olan sayıları toplama ,
        sayı 50'den küçük olduğu müddetçe ... yapma
        gibi işlemler için uygun dğildir.

        for-each loop
        birden fazla eleman barındıran yapılardaki elementleri
        hiçbir sıralama şartı olmadan ve index kullanmadan
        bize getirir.

        for-each loop'ta üç şeyi yazmalıyız:
            1 - çalışacağımız elementlerin data türü
            2 - loop içinde gelen elemanları hangi isimle kullanıcaz (array'de arr[i])
            3 - üzerinde işlem yapacağımız cok elementli obje
         */

        int[] arr = {2,5,7,9,0};
        //array'in tüm elementlerini yazdırın.

        for (int each:arr
             ) {
            System.out.print(each + " ");
        }
        System.out.println("\n=====================================");

        //array'deki tüm elemanları toplayın

        int toplam = 0;
        for (int w:arr
             ) {
            toplam+=w;
        }
        System.out.println("Sayıların toplamı : " + toplam);
        System.out.println("=====================================");

        //array'deki çift sayıların çarpımını yazdırın.

        int carpim =1;
        for (int w: arr
             ) {
            if (w % 2 == 0){
            carpim *= w;
}       }
        System.out.println("Sayıların Çarpımı : " + carpim);
    }
}
