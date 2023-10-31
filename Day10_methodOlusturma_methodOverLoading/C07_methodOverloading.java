package Day10_methodOlusturma_methodOverLoading;

public class C07_methodOverloading {
    public static void main(String[] args) {

        /*
        Bir method call yapıldığında
        Java hangi method'un çalışacağına karar vermek için
        aşağıdaki kontrolleri yapar.
        1==> isim
        2==> argüment sayısı il parametre sayısı
        3==> argüment olarak yazılan DEĞERLER ile PARAMAETRElerin data türünün uyumlu olması
        4==> eğer argüment ve parametreler %100 uyumlu olmazsa
            minimum sayıda casting ile çalıştırabileceği meto-hod'u tercih eder.
         */

        toplama(5,7); //12
        toplama('a','b'); //195
        // toplama(4.5,5.6);

    }
    //verilen iki int sayıyı toplayıp yazdıran bit method oluşturun.

    public static void toplama (int sayi1, int sayi2){

        System.out.println("İki in sayının toplamı : "+(sayi1+sayi2));
    }


}
