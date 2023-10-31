package Day10_methodOlusturma_methodOverLoading;

public class C03_AsalSayiMi {
    public static void main(String[] args) {
        //Verilen pozitif bir tamsayının asal olup olmadığını kontrol edip
        //asal ise true asal değil ise false yazdıran bir method oluşturun.
        asalSayiBulma(324468787);

    }

    public static void asalSayiBulma (int girilenSayi){

        int count =0;

        for (int i = 1; i <=girilenSayi; i++) {
            if (girilenSayi%i==0) {
                count++;
            }
        }
        if (count==2){
            System.out.println(true);;
        }else {
            System.out.println(false);
        }

    }

}
