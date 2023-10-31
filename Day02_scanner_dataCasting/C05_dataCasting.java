package Day02_scanner_dataCasting;

public class C05_dataCasting {
    public static void main(String[] args) {

        int sayiInt = 34;
        String str = "Java Candir";
        boolean bl = true;
        char chr = '%';
        double dbl = 4.5;
        byte byt = 10;
        short shrt = 23;

        dbl = sayiInt;
        dbl = byt;
        dbl = shrt;
        dbl = chr;

        //sayiInt = dbl
        sayiInt = shrt;
        sayiInt = byt;
        sayiInt = chr;

        //shrt =dbl
        //shrt = sayiInt
        shrt = byt;
        //shrt =chr

    }
}
