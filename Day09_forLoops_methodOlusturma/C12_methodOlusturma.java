package Day09_forLoops_methodOlusturma;

public class C12_methodOlusturma {
    public static void main(String[] args) {

        String str = "Sevim bak kim gelmiş?";

        str.toUpperCase();

        //method bir sonuç döndürüyorsa iki şekilde o sonucu kullanabiliriz.
        //==>sadece o satırda sonucu görmek istiyorsanız kalıcı bir değiiklik yapmayacaksanız;
        //direk yazdırabiliriz
        System.out.println(str.toLowerCase());

        //veya
        //==>değişikliğin kalıcı olmasını istiyorsak yeni halini kaydederiz.

        String strBuyukHarf =str.toUpperCase();
        System.out.println(strBuyukHarf);

    }
}
