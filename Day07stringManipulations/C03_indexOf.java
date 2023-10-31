package Day07stringManipulations;

import java.util.Scanner;

public class C03_indexOf {
    public static void main(String[] args) {

        //Verilen bir cümlede
        //aranan bir metin için aşağıdaki cümlellerden
        //uygun olanını yazdıracak bir program yazınız.
        //-Cümle aranan metni içermiyor.
        //Cümlede aranan metin sadece 1 kere kllnılmış
        //Cümlede aranan metin sadece 2 kere kllnılmış
        //Cümlede aranan metin sadece 2'den fazla kllnılmış
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String cumle = scanner.nextLine();

        System.out.println("Lütfen aranan metni giriniz.");
        String metin = scanner.nextLine();

        int ilkIndex = 0;
        int ikinciIndex =0;
        int ucuncuIndex = 0;

        ilkIndex = cumle.indexOf(metin);

        if (ilkIndex ==-1){
            System.out.println("Cümle aranan metni içermiyor.");
        } else if ((ikinciIndex = cumle.indexOf(metin,ilkIndex+1))==-1) { //mutlakakullanılmış ama kaç defa bilmiyoruz
            //ilk index-1 değil iinci index -1
            System.out.println("Cümlede aranan metin sadece 1 kere kullılmış");
        } else {
            //ilk index -1 değil ikinci index -1 değil
            //Şİmdiki sorumuz sadece2 tane mi var, yoksa 2'den fazla mı?

            ucuncuIndex=cumle.indexOf(metin,ikinciIndex+1);

            //ucuncuIndex -1 veya var olan bir index
            if (ucuncuIndex==-1){
                System.out.println("Cümlede aranan metin sadec 2 kere kullanılmış.");
            }else {
                //ilk index -1 değil, ikinci index -1 değil, üçüncü index -1 değil
                System.out.println("Cümlede aranan metin 2'den fazla kullanılmış.");
            }
        }
    }
}
