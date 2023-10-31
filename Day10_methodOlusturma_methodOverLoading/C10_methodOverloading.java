package Day10_methodOlusturma_methodOverLoading;

public class C10_methodOverloading {
    public static void main(String[] args) {

        toplama(5,7);
    }


    public static void toplama (int a, double b){ //toplama int double

        System.out.println("int ve int double sayının toplamı : "+(a+b));
    }

    public static void toplama (double a, double b){ //toplama double

        System.out.println("double ve double sayının toplamı : "+(a+b));
    }
}
