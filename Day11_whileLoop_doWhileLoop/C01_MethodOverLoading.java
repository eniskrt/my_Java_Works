package Day11_whileLoop_doWhileLoop;

public class C01_MethodOverLoading {
    public static void main(String[] args) {

        /*
        Bir class'ta ismi aynı ama signiture'ı farklı metjod'lar oluşturmaya
        Method OVERLOADİNG denir

        Method Overloading'in amacı aynı işlevi,
        farklı şekillerde kullanabilmektir.

        Overloadin'de isimler aynı olduğundan,
        Aynı class'ta birden fazla overloaded method yazabilmek için
        signiture'ları değiştirmemiz gerekir.

        signiture = method adı + parametrelerin data türleri
        toplama int int
        toplam int
        toplama int int int

        Java hangi method'u kıllancağına
        method call sırasında yazacağımız argument'lere göre karar verir.

        1 ==> argument sayısı ==parametre sayısı
        2 ==> argument data türleri == parametre data türleri
        3 ==> argumentler ile parametreler %100 uyumlu olmazsa,
              casting ile çalıştırılabilecek method var mı diye bakar
              casting ile çalıştırılabilecek biden fazla method varsa
              en az casting yaparak kullanılabileceğini tercih eder.
         */
        String str = "Java Candır";
        System.out.println(str.substring(3)); // a Candır
        System.out.println(str.substring(3, 5));  // a C

        System.out.println(str.replace('a','b')); //Jbvb Cbndır
        System.out.println(str.replace("Can","Güzel")); //Java Güzeldır

    }
}
