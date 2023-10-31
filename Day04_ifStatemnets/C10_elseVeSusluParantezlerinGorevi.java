package Day04_ifStatemnets;

import java.util.Scanner;

public class C10_elseVeSusluParantezlerinGorevi {
    public static void main(String[] args) {

        //Müşeriden satın aldığı ürün adedini isteyin
        //Adet 100'den fazla ise %20 indirim kazandınız
        //Adet 50'den fazla ise %10 indirim kazandınız yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satın aldığınız ürün adedini giriniz.");
        int adet = scanner.nextInt();

        if (adet > 100){
            System.out.println("%20 indirim kazandınız.");
            System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");
            System.out.println("Kampanyalarımız hakkında web sitemize bakınız.");
        } else if (adet>50){
            System.out.println("%10 indirim kazandınız.");
            System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");
            System.out.println("Kampanyalarımız hakkında web sitemize bakınız.");
        }


        /*
        if else if ... cümleleri else ile bitmek zorunda değildir.
        AMMA eğer else ile bitmezse bazı değerlerin kapsam dışında kalacağını bilmemiz gererkir.

        EĞER if veya else if'lerden sonra süslü parantez kullanılmazsa java ilk noktalı virgüle kadar olan
        kısmı body olarak kabul eder

        geriye kalan kodları if else if statement ile ilgisiz kabul eder.

        NOT : Eğer if veya else body'niz sadece bir satır ise
        {  } kullanmadan kod yazabilirisiniz.
        ANCAk body'ye yazmanız gereken satır sayısı birden fazla ise
        MUTLAKA süslü parantez kullanmalısınız.
         */




    }
}
