package Day03_wrapperClasses_MatematikseiIşlemler;

public class C05_prePostIncrement {
    public static void main(String[] args) {

        int a = 20;

        //a'nın değerini yazdırın
        //sonra a'nın değerini 1 arttırıp oluşturacağınız b variable'ına yeni değeri atayın

        System.out.println("a : "+a);

        a+=1;
        int b = a;

        System.out.println("İşlem sonunda a : "+ a + ", b : "+ b);

        a = 20;

        //a'nın değerini b'ye atayın
        //sonra a'nın değerini 1 arttırın

        b = a;
        a +=1;

        System.out.println("İşlem sonunda a : "+ a + ", b : "+ b);

        System.out.println("=======================================================");

        //Bu işlem sadece ++ veya -- şeklindeki kullanımlar içindir

        a = 20;
        b = a++;
        System.out.println("a++ aşlemi sonunda a : "+ a + ", b : "+ b);

        a = 20;
        b= ++a;
        System.out.println("++a işlemi sonunda a : "+ a + ", b : "+ b);

        int c = 40;

        System.out.println("c++ ile yazdırınca : " + c++);
        System.out.println("c++ ile bir alt satırda c'nin değeri : "+c);

        c =40;

        System.out.println("++c ile yazdırınca : " + ++c);
        System.out.println("++c ile bir alt satırda c'nin değeri : "+c);






    }
}
