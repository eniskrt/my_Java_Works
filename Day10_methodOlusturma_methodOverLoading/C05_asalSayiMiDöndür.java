package Day10_methodOlusturma_methodOverLoading;

public class C05_asalSayiMiDöndür {
    public static void main(String[] args) {

        //Verilen pozitif bir tamsayının
        // asal sayı olup olmadığını kontrol edip
        //asal ise true asal değil is false döndüren
        // bir method oluşturun.

        asalMiDondur(45); // false döndürdü ama biz kullanmadık

        System.out.println(asalMiDondur(43));// true

    }


    public static boolean asalMiDondur (int sayi){
        boolean flag = true;
        for (int i = 2; i <sayi; i++) {
            if (sayi%i==0){
                flag = false ;
            }
        }
        return flag;
    }

}
