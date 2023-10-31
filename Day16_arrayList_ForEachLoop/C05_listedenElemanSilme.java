package Day16_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_listedenElemanSilme {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //kismini list olarak bize donduren bir method olusturun

        /*
        Listenin elemanlarını index ile kontrol edip silmemiz isteniyorsa
        silme işlemi yaptığımızda aradan bir element çıkarılacağı için
        index bir elemanı atlar

        bunu engellemek için
                -silme yapılınca i 1 azaltılabilir
                -verilen listede silme yapılmaz yeni bir liste oluşturulup
                 silinmeyecek elemanlar yeni listeye eklenebilir
         */

        List<String> isimler = new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("Ömer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Başak");
        isimler.add("Ayça");
        isimler.add("Mehmet");

        String silinecekHarf = "a";
        System.out.println(istenmeyenKarakterleriSil(isimler, silinecekHarf));

    }
    public static List<String> istenmeyenKarakterleriSil (List<String> isimler, String siinecekHarf){

        List<String> silinmeyecekler = new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {
            /*
            if (isimler.get(i).toUpperCase().contains(siinecekHarf.toUpperCase())){
                isimler.remove(isimler.get(i));
                i--;
            }
             */
            if (!isimler.get(i).toUpperCase().contains(siinecekHarf.toUpperCase())){
                silinmeyecekler.add(isimler.get(i));
            }
        }
        return silinmeyecekler;
    }
}
